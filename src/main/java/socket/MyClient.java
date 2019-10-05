package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) throws IOException {
        //绑定服务端的ip和端口
        Socket socket = new Socket("127.0.0.1",9999);
        InputStream in = socket.getInputStream();
        //接收数据
        byte[] bs = new byte[1024];
        in.read(bs);
        System.out.println( new String(bs)+ " world");

        OutputStream out = socket.getOutputStream();
        String s = "你好 ";
        out.write(s.getBytes());
    }
}
