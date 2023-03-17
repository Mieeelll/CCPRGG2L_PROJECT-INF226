import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;

public class MainMenu extends JFrame implements ActionListener{

    public MainMenu(){
        main(null);
    }
    public static void main(String[] args) {

        // Play Button
        ImageIcon startbutton;
        startbutton = new ImageIcon("StartButton.png");
        Image a= startbutton.getImage();
        startbutton = new ImageIcon(a.getScaledInstance(135,135, 5));

        ImageIcon imgIcon = new ImageIcon("TTTBackground.png");
        ImageIcon bgIcon = new ImageIcon(imgIcon.getImage().getScaledInstance(400, 400, Image.SCALE_AREA_AVERAGING));
        JLabel backgroundLabel = new JLabel(bgIcon);
        JFrame mainMenu = new JFrame();
        JButton btnplay = new JButton();
        
        //Button
        btnplay.setBounds(250, 300, 125,95);
        btnplay.setVisible(true);
        btnplay.setBackground(Color.BLACK);
        btnplay.setIcon(startbutton);
        mainMenu.add(btnplay);
        JPanel panel = new JPanel();
        panel.add(backgroundLabel);
        mainMenu.add(panel);


        //Menu Frame
        mainMenu.setTitle("TicTacToe Game");
        mainMenu.add(backgroundLabel);
        mainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenu.setSize(500, 500);
        mainMenu.setVisible(true);
        mainMenu.setResizable(false);
        mainMenu.setLocationRelativeTo(null);
    
        
        
        btnplay.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                mainMenu.dispose();
                new playername(); 
            
                
        }  
    });  

    

    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   
 }
