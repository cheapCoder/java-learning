import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UseRandomAccessFile {
    @Test
    public void test() {
        RandomAccessFile randomAccessFile1 = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile1 = new RandomAccessFile(new File("stream.gif"), "r");
            randomAccessFile2 = new RandomAccessFile(new File("stream-copy.gif"), "rw");

            int len;
            byte[] arr = new byte[1024];

            while ((len = randomAccessFile1.read(arr)) != -1) {
                randomAccessFile2.write(arr, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (randomAccessFile1 != null) {
                    randomAccessFile1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testCover() throws Exception {

        RandomAccessFile randomAccessFile = new RandomAccessFile(new File("copy-dbcp.txt"), "rw");
        randomAccessFile.seek(1);
        randomAccessFile.write(97);
        randomAccessFile.write(97);
        randomAccessFile.write(97);

        randomAccessFile.close();
    }

    @Test
    public void testInsert() {
        RandomAccessFile randomAccessFile = null;
        try {
            File file = new File("test.txt");
            randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(2);
//            System.out.println(file.length());
            StringBuffer stringBuffer = new StringBuffer((int) file.length());
            int len;
            byte[] arr = new byte[10];
            while ((len = randomAccessFile.read(arr)) != -1) {
                stringBuffer.append(new String(arr, 0, len));
            }

            randomAccessFile.seek(2);

            randomAccessFile.write("whatthefuck".getBytes());

            randomAccessFile.write(stringBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
