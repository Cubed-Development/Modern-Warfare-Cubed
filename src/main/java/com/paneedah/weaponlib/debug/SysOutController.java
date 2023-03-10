package com.paneedah.weaponlib.debug;

import java.io.*;

/**
 * Based off of post on Stack Overflow (https://stackoverflow.com/questions/25711648/find-the-location-in-code-of-a-system-out-println)
 * @author Jim Holden, 2022
 *
 */
public class SysOutController {
	
	private static final OutputStream CONSOLE_OUT_STREAM = new FileOutputStream(FileDescriptor.out);

	
	private static void setOutputStream(OutputStream out) {
		System.setOut(new PrintStream(out));
	}
	
	public static void reset() {
		setOutputStream(CONSOLE_OUT_STREAM);
	}
	
	public static void blockAllSysOut() {
		setOutputStream(new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				
				
			}
		});
	}
	
	public static void revealCallLocations() {
		setOutputStream(new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				CONSOLE_OUT_STREAM.write(b);
				if(b == '\n') {
					final StackTraceElement stackTrace = new Throwable().getStackTrace()[9];
					String pathData = "(" + stackTrace.getFileName() + " : " + stackTrace.getLineNumber() + ") [" + stackTrace + "]\n";
					CONSOLE_OUT_STREAM.write(pathData.getBytes());
				}
				
			}
		});
	}
	
	
	
}
