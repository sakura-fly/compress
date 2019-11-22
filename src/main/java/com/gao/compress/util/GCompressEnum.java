package com.gao.compress.util;


import com.gao.compress.co.GCompress;
import com.gao.compress.co.impl.GCompressZip;

public enum GCompressEnum {
    zip(new GCompressZip());


    private GCompress instance;

    GCompressEnum(GCompress instance) {
        this.instance = instance;
    }

    public GCompress getInstance() {
        return instance;
    }
}
