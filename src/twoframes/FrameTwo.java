package twoframes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTwo extends JFrame{
    
    JButton buttonClose;
    
    public FrameTwo(){
        this.setVisible(true);
        this.setSize(new Dimension(400, 200));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Olá");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                TwoFrames.mainFrame.setEnabled(true);
                dispose();
            }
        });
        
        buttonClose = new JButton("Close");
        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TwoFrames.mainFrame.setEnabled(true);
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
