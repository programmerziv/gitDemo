package socket;

import java.io.IOException;
import java.net.ServerSocket;

public class MyServer {
    public static void main(String[] args) throws IOException {
        //对外暴露端口和IP
        ServerSocket server = new ServerSocket(9999);
        //监听客户端请求
        server.accept();
        //对客户端请求做出响应
        System.out.println("服务端成功接收到了请求！！！");

    }
}
