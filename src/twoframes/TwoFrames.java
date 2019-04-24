package twoframes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoFrames extends JFrame {
    
    public static TwoFrames mainFrame;
    
    JButton buttonNewFrame;
    
    public TwoFrames(){
        createView();
        this.setVisible(true);
        this.setSize(new Dimension(400, 200));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Olá");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void createView(){
        JPanel panelMain = new JPanel();
        this.getContentPane().add(panelMain);
        
//Center
        JPanel panelCenter = new JPanel(new BorderLayout());
        panelMain.add(panelCenter, BorderLayout.CENTER);
        buttonNewFrame = new JButton("New frame");
        buttonNewFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabled(false);
                new FrameTwo();
            }
        });
        panelCenter.add(buttonNewFrame);
        //
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                mainFrame = new TwoFrames();
            }
        });
    }
}
