package gr.aueb.cf.ch22_swing_frontend;

import java.awt.*;

public class Main {
    private static final HelloFrame helloFrame = new HelloFrame();

    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                helloFrame.setVisible(true);
//            }
//        });

        EventQueue.invokeLater(() -> helloFrame.setVisible(true));
    }
}
