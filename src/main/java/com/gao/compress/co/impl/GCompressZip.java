package com.gao.compress.co.impl;


import com.gao.compress.co.GCompress;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;

public class GCompressZip implements GCompress {


    public void compressFolder(String out, File folder) throws ZipException {
        new ZipFile(out).addFolder(folder);
    }
}
