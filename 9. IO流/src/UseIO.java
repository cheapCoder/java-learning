import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.FixedWidth;

import java.io.*;
import java.nio.channels.FileLockInterruptionException;

public class UseIO {
    public static void main(String[] args) {

    }

    @Test
    public void testFileReader() {
        File file = new File("hello.txt");
//        System.out.println(file.exists());
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int len;
            char[] arr = new char[5];
            while ((len = fileReader.read(arr)) != -1) {
                System.out.print(new String(arr, 0, len));
            }
        } catch (IOException e) {
//            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileWriter() {
        File file = new File("writer.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);

            fileWriter.append("liheng12341234\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                }
            }
        }

    }

    @Test
    public void copyFile() {
        File src = new File("hello.txt");
        File dest = new File("copy-hello.txt");
        if (!src.exists()) {
            System.out.println("源文件不存在");
            return;
        }
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(src);
            fileWriter = new FileWriter(dest, true);

            int len;
            char[] arr = new char[5];
            while ((len = fileReader.read(arr)) != -1) {
//                System.out.print(new String(arr, 0, len));
                fileWriter.write(new String(arr, 0, len));
            }
        } catch (IOException e) {
//            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void copyByte() {

        File src = new File("stream.gif");
        File dest = new File("copy-stream.gif");
        if (!src.exists()) {
            System.out.println("源文件不存在");
            return;
        }
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(src);
            fileOutputStream = new FileOutputStream(dest, true);

            int len;
            byte[] arr = new byte[5];
            while ((len = fileInputStream.read(arr)) != -1) {
//                System.out.print(new String(arr, 0, len));
                fileOutputStream.write(arr, 0, len);
            }
        } catch (IOException e) {
//            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void copyByBufferStream() {
        File src = new File("stream.gif");
        File dest = new File("copy-stream.gif");

        if (!src.exists()) {
            System.out.println("源文件不存在");
            return;
        }

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            fileInputStream = new FileInputStream(src);
            fileOutputStream = new FileOutputStream(dest, true);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int len;
            byte[] arr = new byte[10];
            while ((len = bufferedInputStream.read(arr)) != -1) {
//                System.out.print(new String(arr, 0, len));
                bufferedOutputStream.write(arr, 0, len);
            }
        } catch (IOException e) {
//            e.printStackTrace();
        } finally {
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void copyByChar() {
//        File src = new File("hello.txt");
//        File dest = new File("copy-hello.txt");
//        if (!src.exists()) {
//            System.out.println("源文件不存在");
//            return;
//        }
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("dbcp.txt")));
            bufferedWriter = new BufferedWriter(new FileWriter(new File("copy-dbcp.txt")));


            int len;
            char[] arr = new char[5];
            while ((len = bufferedReader.read(arr)) != -1) {
//                System.out.print(new String(arr, 0, len));
                bufferedWriter.write(new String(arr, 0, len));
            }
        } catch (IOException e) {
//            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void conversionFlow() {
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;

        try {
            inputStreamReader = new InputStreamReader(new FileInputStream("dbcp.txt"),"UTF-8");
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream("dbcp-changeCharset.txt"), "GBK");

            int len;
            char[] arr = new char[10];
            while ((len = inputStreamReader.read(arr)) != -1) {
                outputStreamWriter.write(arr, 0, len);
            }
        } catch (IOException e) {
        } finally {

            try {
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
            } catch (
                    IOException e) {
                e.printStackTrace();
            }

            try {
                if (outputStreamWriter != null) {
                    outputStreamWriter.close();
                }
            } catch (
                    IOException e) {
                e.printStackTrace();
            }

        }


    }
}

