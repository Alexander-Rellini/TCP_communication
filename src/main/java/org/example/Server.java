package org.example;

public class Server {

    private serverSocket serverSocket;
    private socket clientSocket;
    private int porta;

    serverSocket = new ServerSocket;


    Server(int porta, serverSocket serverSocket, socket clientSocket){
        this.porta=porta;
    }

    int connetti(){
        try {
            socket = serverSocket.accept;
        }catch (IOException e){
            return null;

        }
    }
}
