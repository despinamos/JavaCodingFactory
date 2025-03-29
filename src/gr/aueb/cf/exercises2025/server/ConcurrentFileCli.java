package gr.aueb.cf.exercises2025.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ConcurrentFileCli {

    public static void main(String[] args) {
        Socket socket = null;

        try (Scanner in = new Scanner(System.in)) {
            InetAddress servAddress = InetAddress.getByName("127.0.0.1");
            final int SERV_PORT = 3030;

            socket = new Socket(servAddress, SERV_PORT); // initialize socket with server address localhost and port 3030
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "";

            do {
                System.out.println("Enter a file directory. BYE for exit.");
                line = in.nextLine();
                pw.println(line);
                pw.flush();
                System.out.println(br.readLine());
            } while (!line.equals("BYE"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
