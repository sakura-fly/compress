package com.gao.compress.util;

import com.gao.compress.co.GCompressSync;
import com.gao.compress.co.impl.GCompressZip;

public enum GCompressSyneEnum {

    zip(new GCompressSync(new GCompressZip()));


    private GCompressSync instance;

    GCompressSyneEnum(GCompressSync compressSync) {
        this.instance = compressSync;
    }

    public GCompressSync getInstance() {
        return instance;
    }
}
