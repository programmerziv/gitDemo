package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws IOException {
        //对外暴露端口和IP
        ServerSocket server = new ServerSocket(9999);
        //监听客户端请求
        Socket socket = server.accept();
        //对客户端请求做出响应
        System.out.println("服务端成功接收到了请求！！！");
        //向客户端发消息
        OutputStream out = socket.getOutputStream();
        String s = "hello";
        out.write(s.getBytes());

        InputStream in = socket.getInputStream();
        byte[] bs = new byte[1024];
        in.read(bs);
        System.out.println(new String(bs) +" 世界");


    }
}
