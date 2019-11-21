package com.gao.compress.co;

import net.lingala.zip4j.exception.ZipException;

import java.io.File;

public interface GCompress {


    /**
     * 压缩文件夹
     * @param out       输出位置
     * @param folder    要压缩的文件夹
     */
    void compressFolder(String out, File folder) throws ZipException;


}
