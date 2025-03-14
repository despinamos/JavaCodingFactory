package gr.aueb.cf.ch22_swing_frontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        this.setTitle("Hello Coding Factory");
        setSize(400, 200);
        setLocationRelativeTo(null);
        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.add(new JLabel("Coding Factory"));

        JButton btn = new JButton("Click Me");
        contentPane.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Hello Coding Factory", "Hello",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
