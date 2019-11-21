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
                    compress.compressFolder(out,folder);
                    callBack.finish();
                } catch (ZipException e) {
                    // e.printStackTrace();
                    callBack.err();
                }
            }
        }).start();
    }

}
