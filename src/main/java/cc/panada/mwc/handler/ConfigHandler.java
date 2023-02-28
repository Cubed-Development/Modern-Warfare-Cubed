package cc.panada.mwc.handler;

import cc.panada.mwc.MWC;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import static cc.panada.mwc.utils.ModReference.MWC_LOG;

/**
 * This class handle everything related to the config system.
 */
public class ConfigHandler {

    private static FileInputStream fileInputStream;
    private static InputStreamReader inputStreamReader;
    private static BufferedReader bufferedReader;

    private static PrintWriter writer;

    private static String line;

    /**
     * Initializes the configuration system.
     * <p>
     * Check if the config files and folder exists, if not, create them.
     * Then read the config files.
     */
    public static void init() {
        try {
            if (!Paths.get(MWC.mainConfigFile.getParent()).toFile().exists())
                if (Paths.get(MWC.mainConfigFile.getParent()).toFile().mkdirs())
                    MWC_LOG.error("Could not create config directory");

            if (!MWC.mainConfigFile.exists()) {
                if (!MWC.mainConfigFile.createNewFile())
                    MWC_LOG.error("Could not create main config file");

                defaults();
            }

            readMainConfig();

        } catch (IOException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
            MWC_LOG.error("Cannot init configs, an IOException occurred: " + e.getMessage());
        } catch (SecurityException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
            MWC_LOG.error("Cannot init configs, an antivirus is probably causing this");
        } finally {
            closeStreams();
        }
    }

    /**
     * Initializes file streams for a specified file.
     * <p>
     * This is used to read the config files.
     *
     * @param file The file object to create streams for
     */
    private static void initStreams(File file) {
        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(inputStreamReader);

        } catch (FileNotFoundException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
            if (handleFileNotFound(e.getMessage(), "streams", file))
                initStreams(file);

            closeStreams();
        } catch (SecurityException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
            MWC_LOG.error("Cannot init streams for " + file + " an antivirus is probably causing this");

            closeStreams();
        }
    }

    /**
     * Closes file streams.
     */
    private static void closeStreams() {
        try {
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();

        } catch (IOException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
            MWC_LOG.error("Cannot close streams, an IOException occurred: " + e.getMessage());
        }
    }

    /**
     * Initializes writer for a specified file.
     * <p>
     * This is used to write to the config files.
     *
     * @param file The file object to create writer for
     */
    private static void initWriter(File file) {
        try {
            writer = new PrintWriter(file.getPath(), "UTF-8");

        } catch (FileNotFoundException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
            if (handleFileNotFound(e.getMessage(), "writer", file))
                initWriter(file);
        } catch (UnsupportedEncodingException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
            MWC_LOG.error("Cannot init writer for " + file + " encoding is not supported, details: " + e.getMessage());
        } catch (SecurityException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
            MWC_LOG.error("Cannot init streams for " + file + " an antivirus is probably causing this");
        }
    }

    /**
     * Handle a file not found exception.
     * <p>
     * It will output an error message to the console.
     * And then attempt to create a new file, if it fails, it will output an error message to the console.
     *
     * @param message The error message associated with the exception
     * @param source A string indicating the source of the error
     * @param file The file object that could not be found
     * @return True if the file was created successfully, false otherwise
     */
    private static boolean handleFileNotFound(String message, String source, File file) {
        MWC_LOG.error("Cannot init " + source + " for " + file + " as the file does not exist, details: " + message);
        MWC_LOG.warn("Trying to create file " + file);

        try {
            if (file.createNewFile()) {
                MWC_LOG.info("Successfully created file " + file);
                return true;
            }
        } catch (Exception ex) {
            MWC_LOG.error("Could not create file " + file);
        }

        return false;
    }

    /**
     * Reads the main config file and set the corresponding settings.
     */
    private static void readMainConfig() {
        try {
            initStreams(MWC.mainConfigFile);

            skipLines(5);

            line = bufferedReader.readLine();
            MWC.exampleFeature = Boolean.parseBoolean(line.replace("exampleFeature=", ""));

            skipLines(3);

            line = bufferedReader.readLine();
            MWC.exampleValue = Integer.parseInt(line.replace("exampleValue=", ""));
            line = bufferedReader.readLine();
            MWC.exampleDecimalValue = Float.parseFloat(line.replace("exampleDecimalValue=", ""));

        } catch (IOException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
            MWC_LOG.error("Cannot read main config, an IOException occurred: " + e.getMessage());
        } finally {
            closeStreams();
        }
    }

    /**
     * Writes the main config file.
     */
    public static void writeMainConfig() {
        initWriter(MWC.mainConfigFile);

        writer.println("Main configuration file for Modern Warfare Cubed");
        writer.println("I advice to use the in game configuration menu instead of manually editing this file");
        writer.println();
        writer.println("Example Feature Config:");
        writer.println();
        writer.println("exampleFeature=" + MWC.exampleFeature);
        writer.println();
        writer.println("Example Values Config:");
        writer.println();
        writer.println("exampleValue=" + MWC.exampleValue);
        writer.println("exampleDecimalValue=" + MWC.exampleDecimalValue);

        writer.close();
    }

    /**
     * Set all the values in the main config file to the default.
     */
    public static void defaults() {
        MWC.exampleFeature = true;

        MWC.exampleValue = 10;

        MWC.exampleDecimalValue = 0.75F;

        writeMainConfig();
    }

    /**
     * Skips a specified number of lines in a file being read by a BufferedReader.
     *
     * @param numberOfLines The number of lines to skip in the file
     * @throws IOException If an I/O error occurs while reading the file
     */
    private static void skipLines(int numberOfLines) throws IOException {
        for (int i = 0; i < numberOfLines; i++)
            bufferedReader.readLine();
    }
}
