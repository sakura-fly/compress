package com.gao.compress.co;

import net.lingala.zip4j.exception.ZipException;

import java.io.File;

public abstract class GCompress {


    /**
     * 压缩文件夹
     *
     * @param out    输出位置
     * @param folder 要压缩的文件夹
     */
    public abstract void compressFolder(String out, File folder) throws ZipException;


    /**
     * 解压
     *
     * @param src         要解压的压缩包
     * @param destination 目标地址
     */
    public abstract void extract(String src, String destination) throws ZipException;


    /**
     * 解压到同一级目录
     * @param src 要解压的压缩包
     */
    public void extract(String src) throws ZipException {
        String[] srcArr = src.split(File.separator);
        extract(src, src.substring(0,src.indexOf(srcArr[srcArr.length - 1])));
    }


}
