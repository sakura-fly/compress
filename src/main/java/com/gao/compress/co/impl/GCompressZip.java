package com.gao.compress.co.impl;


import com.gao.compress.co.GCompress;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;

public class GCompressZip extends GCompress {


    public void compressFolder(String out, File folder) throws ZipException {
        new ZipFile(out).addFolder(folder);
    }

    public void extract(String src, String destination) throws ZipException {
        new ZipFile(src).extractAll(destination);
    }
}
