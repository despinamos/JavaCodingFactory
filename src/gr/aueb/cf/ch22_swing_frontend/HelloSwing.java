package gr.aueb.cf.ch22_swing_frontend;

import javax.swing.*;

public class HelloSwing {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("First Swing App");
        jFrame.setSize(600, 300); //pixels
        jFrame.setLocationRelativeTo(null); // null means no component, uses monitor as parent element(center)
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        jFrame.setContentPane(contentPane);

        contentPane.add(new JLabel("Hello World"));
        jFrame.setVisible(true);
    }
}
