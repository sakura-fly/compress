import com.gao.compress.co.CallBack;
import com.gao.compress.util.GCompressEnum;
import com.gao.compress.util.GCompressSyneEnum;
import net.lingala.zip4j.exception.ZipException;
import org.junit.Test;

import java.io.File;

public class Run {

    @Test
    public void zip() {
        // new ZipFile("filename.zip").addFolder(new File("/home/sakura/workspace/compress/src/main/resources/cfloder"));

        try {
            GCompressEnum.zip.getInstance().compressFolder("~workspace/compress/target/out/filename.zip", new File("/home/sakura/workspace/compress/src/main/resources/cfloder"));
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void unzip() {
        // new ZipFile("filename.zip").addFolder(new File("/home/sakura/workspace/compress/src/main/resources/cfloder"));

        try {
            GCompressEnum.zip.getInstance().extract("/home/sakura/workspace/compress/target/out/filename.zip");
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void zipSync() {
        GCompressSyneEnum.zip.getInstance().compressFolder("/home/sakura/workspace/compress/target/out/filename.zip", new File("/home/sakura/workspace/compress/src/main/resources/cfloder"), new CallBack() {
            public void finish() {
                System.out.println("finish");
            }

            public void err(ZipException e) {
                System.out.println("err" + e.getMessage());

            }
        });
        System.out.println("fff");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
