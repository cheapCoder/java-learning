import jdk.management.jfr.RecordingInfo;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.IntUnaryOperator;

public class SimulateCS {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream receiveStream = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 5000);
            outputStream = socket.getOutputStream();
            fileInputStream = new FileInputStream("stream.gif");


            int len = 0;
            byte[] arr = new byte[10];
            while ((len = fileInputStream.read(arr)) != -1) {
                outputStream.write(arr, 0, len);
            }

            socket.shutdownOutput();

            inputStream = socket.getInputStream();
            receiveStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[20];
            int len2;
            while ((len2 = inputStream.read(buffer)) != -1) {
                receiveStream.write(buffer, 0, len2);
            }
            System.out.println(receiveStream.toString());
//            outputStream.write("hello world".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (receiveStream != null) {
                    receiveStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        ByteArrayOutputStream storeStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("stream-copybyTCP.gif");

            serverSocket = new ServerSocket(5000);
            socket = serverSocket.accept();

            inputStream = socket.getInputStream();

            int len = 0;
            byte[] arr = new byte[10];
//            storeStream = new ByteArrayOutputStream();
            while ((len = inputStream.read(arr)) != -1) {
                fileOutputStream.write(arr, 0, len);
            }
            outputStream = socket.getOutputStream();
            outputStream.write("received".getBytes());

//            System.out.println(socket.getInetAddress().getHostName() + "   " + socket.getInetAddress().getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {

            }
            try {
                if (storeStream != null) {
                    storeStream.close();
                }
            } catch (IOException e) {

            }
        }


    }

}
