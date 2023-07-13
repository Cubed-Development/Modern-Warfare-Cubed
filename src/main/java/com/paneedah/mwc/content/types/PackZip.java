package com.paneedah.mwc.content.types;

import com.paneedah.mwc.utils.Checks;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public class PackZip extends ZipFile {
    private String packName;
    private String packId;

    public PackZip(File pack) throws IOException {
        super(pack);
    }

    public String getPackName() {
        return packName;
    }

    public boolean setPackName(String name) {
        if(Checks.checkName(name)) {
            packName = name.toLowerCase();
            return true;
        }
        return false;
    }

    public String getPackId() {
        return packId;
    }

    public boolean setPackId(String id) {
        if(Checks.checkId(id)) {
            packId = id.toLowerCase();
            return true;
        }
        return false;
    }
}
