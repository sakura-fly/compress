package com.gao.compress.co;

import net.lingala.zip4j.exception.ZipException;

public interface CallBack {
    void finish();
    void err(ZipException e);
}
