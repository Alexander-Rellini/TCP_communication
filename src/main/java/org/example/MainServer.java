package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainServer {
    int porta = 12345;
    Server server;
    try {

        server = new Server(porta);
        System.out.println("Server in ascolto");

        Socket socket = erver.attendi();
        System.out.println("Server connesso al client");

    }catch(IOException e){
        ee.printStackTrace(); //system err.prnitln(e);
        System.exit(status 1);

    }
}