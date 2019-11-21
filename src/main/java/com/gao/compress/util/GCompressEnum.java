package com.gao.compress.util;


import com.gao.compress.co.GCompress;
import com.gao.compress.co.impl.GCompressZip;

public enum GCompressEnum {
    zip(new GCompressZip());


    private GCompress compress;

    GCompressEnum(GCompress compress) {
        this.compress = compress;
    }

    public GCompress getCompress() {
        return compress;
    }
}
