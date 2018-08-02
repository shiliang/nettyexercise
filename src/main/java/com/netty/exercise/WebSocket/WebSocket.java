package com.netty.exercise.WebSocket;/*
 * @program:com.netty.exercise.WebSocket
 * @description:程序主函数
 * @author:shiliang
 * @create:2018-08-02 18:49
 * */

public class WebSocket {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int port = 8080;
        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        WebSocketServer web = new WebSocketServer();
        try {
            web.run(port);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
