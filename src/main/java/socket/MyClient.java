package socket;

import java.io.IOException;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) throws IOException {
        //绑定服务端的ip和端口
        Socket socket = new Socket("127.0.0.1",9999);



    }
}
