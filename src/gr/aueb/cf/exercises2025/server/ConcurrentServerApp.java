package gr.aueb.cf.exercises2025.server;

public class ConcurrentServerApp {
    public static void main(String[] args) {
        ConcurrentFileServer concurrentFileServer = new ConcurrentFileServer();
        concurrentFileServer.run();
    }
}