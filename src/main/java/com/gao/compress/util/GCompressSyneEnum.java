package com.gao.compress.util;

import com.gao.compress.co.GCompressSync;
import com.gao.compress.co.impl.GCompressZip;

public enum GCompressSyneEnum {

    zip(new GCompressSync(new GCompressZip()));


    private GCompressSync compressSync;

    GCompressSyneEnum(GCompressSync compressSync) {
        this.compressSync = compressSync;
    }

    public GCompressSync getCompressSync() {
        return compressSync;
    }
}
