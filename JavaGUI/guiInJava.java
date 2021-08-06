
package JavaGUI;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiInJava implements ActionListener {

    int count = 0;
    private JLabel label;
    private JPanel panel;
    private JFrame frame;


    public guiInJava() {
        
        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("Click me");
        label = new JLabel("# of clicks: 0");

        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
         new guiInJava();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count ++;
        label.setText("# of clicks: " + count);
        
    }
}
