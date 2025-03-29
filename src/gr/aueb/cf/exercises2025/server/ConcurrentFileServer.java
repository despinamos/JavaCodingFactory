package gr.aueb.cf.exercises2025.server;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ConcurrentFileServer implements Runnable {
    public void run() {
        ServerSocket servFd = null;
        final int SERVER_PORT = 3030;

        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("127.0.0.1", SERVER_PORT));
            System.out.println("File Server Started ...");

            while (true) {
                Socket connectedFd = servFd.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(connectedFd.getInputStream()));
                PrintWriter pw = new PrintWriter(connectedFd.getOutputStream());
                String line = "";
                String fileContent = "";

                do {
                    line = br.readLine();
                    BufferedReader bf = new BufferedReader(new FileReader("C:/Users/Despoina/tmp/characters.txt"));
                    fileContent = bf.readLine();
                    pw.println(fileContent);
                    pw.flush();
                } while (!line.equals("BYE"));
                connectedFd.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (servFd != null) servFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}