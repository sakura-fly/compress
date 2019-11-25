package com.gao.compress.co;

import net.lingala.zip4j.exception.ZipException;

import java.io.File;

public class GCompressSync {
    private GCompress compress;

    public GCompressSync(GCompress t) {
        this.compress = t;
    }

    public void compressFolder(final String out, final File folder, final CallBack callBack) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    compress.compressFolder(out, folder);
                    if (callBack != null) {
                        callBack.finish();

                    }
                } catch (ZipException e) {
                    if (callBack != null) {
                        callBack.err(e);
                    }
                }
            }
        }).start();
    }

    public void extract(final String src, final String destination, final CallBack callBack) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    compress.extract(src, destination);
                    if (callBack != null) {
                        callBack.finish();

                    }
                } catch (ZipException e) {
                    if (callBack != null) {
                        callBack.err(e);
                    }
                }
            }
        }).start();
    }

    public void extract(final String src, final CallBack callBack) {
        String[] srcArr = src.split(File.separator);
        extract(src, src.substring(0, src.indexOf(srcArr[srcArr.length - 1])), callBack);
    }


}
