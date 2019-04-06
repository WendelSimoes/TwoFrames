package twoframes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTwo extends JFrame{
    JButton buttonClose;
    public FrameTwo(){
        this.setVisible(true);
        this.setSize(new Dimension(400, 200));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Olá");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonClose = new JButton("Close");
        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TwoFrames().setVisible(true);
                dispose();
            }
        });
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        
        //North
        JPanel panelNorth = new JPanel(new BorderLayout());
        panelNorth.add(buttonClose, BorderLayout.NORTH);
        panel.add(panelNorth);
    }
}
