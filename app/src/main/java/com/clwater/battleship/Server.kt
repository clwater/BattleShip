package com.clwater.battleship

import java.net.ServerSocket
import java.net.Socket
import javax.swing.JOptionPane

/**
 * Created by yszsyf on 2018/3/7.
 */
class Server{

}

//class ServerListener: Thread(){
//    constructor()
//
//    override fun run(){
//        val serverSocket : ServerSocket = ServerSocket(12345)
//        while (true){
//            val socket : Socket = serverSocket.accept()
//            JOptionPane.showMessageDialog(null , "有客户端连接到本机的12345端口")
//            val cs : ChatSocket = ChatSocket(socket)
//        }
//    }
//}
//
//public class ServerListener extends Thread {
//    @Override
//    public void run() {
//        try {
//            // 1、创建ServerScoket，设置端口
//            ServerSocket serverSocket = new ServerSocket(12345);
//            while (true) {
//                // 2、accept方法将导致程序阻塞
//                Socket socket = serverSocket.accept();
//                JOptionPane.showMessageDialog(null, "有客户端连接到本机的12345端口");
//                // 3、将socket传递给新线程
//                ChatSocket cs = new ChatSocket(socket);
//                cs.start();
//                // 4、使用Chatmanager进行管理
//                ChatManager.getInstance().add(cs);
//            }
//        } catch (IOException e) {e.printStackTrace();}
//    }
//}