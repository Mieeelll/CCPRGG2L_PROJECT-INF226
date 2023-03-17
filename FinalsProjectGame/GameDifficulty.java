import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class GameDifficulty extends JFrame implements ActionListener{
    JList listX,listO;
    private String[] colorNameArrays = { "BLUE", "WHITE", "GREEN", "YELLOW" };
    private Color[] colorsClassArray = { Color.BLUE, Color.WHITE, Color.GREEN, Color.YELLOW };
    int buttonYpos = 300;

    int labelXpos = 50;
    int labalYpos = 25;
    int labelHeight = 50;
    int labelWidth = 300;

    int spacing = 50;

    Color colorX;
    Color colorO;

    JLabel labelX, labelO;

    public GameDifficulty(){
        main(null);
    }
    public void main(String[] args) {
        
        // Easy Mode
        ImageIcon easygamemode;
        easygamemode = new ImageIcon("EasyButton.png");
        Image a = easygamemode.getImage();
        easygamemode = new ImageIcon(a.getScaledInstance(135,135, 0));

        // Medium Mode
        ImageIcon mediumgamemode;
        mediumgamemode = new ImageIcon("MediumButton.png"); 
        Image b = mediumgamemode.getImage();
        mediumgamemode = new ImageIcon(b.getScaledInstance(135,135, 0));

        // Hard Mode
        ImageIcon hardgamemode;
        hardgamemode = new ImageIcon("HardButton.png"); 
        Image c = hardgamemode.getImage();
        hardgamemode = new ImageIcon(c.getScaledInstance(135,135, 0));

        ImageIcon imgIcon = new ImageIcon("UsernameBackground.png");
        ImageIcon bgIcon = new ImageIcon(imgIcon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH));
        JLabel backgroundLabel = new JLabel(bgIcon);
        JFrame gamedifficulty = new JFrame();
        
        labelX = new JLabel();
        labelX.setText("Color of Player 1 ");
        labelX.setFont(new Font("Consolas", Font.BOLD, 30));
        labelX.setBounds(labelXpos,labalYpos, labelWidth, labelHeight);
        labelX.setForeground(Color.WHITE);
        gamedifficulty.add(labelX);

    
        listX = new JList(colorNameArrays);
        listX.setFont(new Font("Consolas", Font.BOLD, 30));
        listX.setVisibleRowCount(2);
        listX.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        
        EventHandlerX handlerX = new EventHandlerX();
        listX.addListSelectionListener(handlerX);

        
        JScrollPane scrollPaneX = new JScrollPane(listX);
        scrollPaneX.setBounds(labelXpos,labalYpos + spacing, labelWidth, labelHeight);

        labelO = new JLabel();
        labelO.setText("Color of Player 2 ");
        labelO.setFont(new Font("Arial", Font.BOLD, 30));
        labelO.setBounds(labelXpos,labalYpos + (spacing*2), labelWidth, labelHeight);
        labelO.setForeground(Color.WHITE);
        gamedifficulty.add(labelO);

        // Jlist 
        listO = new JList(colorNameArrays);
        listO.setFont(new Font("Arial", Font.BOLD, 30));
        listO.setVisibleRowCount(2);
        listO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add event
        EventHandlerO handlerO = new EventHandlerO();
        listO.addListSelectionListener(handlerO);

        // JScrollPane
        JScrollPane scrollPaneO = new JScrollPane(listO);
        scrollPaneO.setBounds(labelXpos,labalYpos + (spacing*3), labelWidth, labelHeight);

        // Add components to frame
        gamedifficulty.add(labelX);
        gamedifficulty.add(scrollPaneX);
        gamedifficulty.add(labelO);
        gamedifficulty.add(scrollPaneO);

        // Easy Mode
        JButton egm = new JButton();
        egm.setBounds(30, buttonYpos, 135,105);
        egm.setVisible(true);
        egm.setIcon(easygamemode);
        gamedifficulty.add(egm);
        JPanel easyJPanel = new JPanel();
        easyJPanel.add(backgroundLabel);
        gamedifficulty.add(easyJPanel);

        // Medium Mode
        JButton mgm = new JButton();
        mgm.setBounds(180, buttonYpos, 135,105);
        mgm.setVisible(true);
        mgm.setIcon(mediumgamemode);
        gamedifficulty.add(mgm);
        JPanel mediumJPanel = new JPanel();
        mediumJPanel.add(backgroundLabel);
        gamedifficulty.add(mediumJPanel);

        // Hard Mode
        JButton hgm = new JButton();
        hgm.setBounds(330, buttonYpos, 135,105);
        hgm.setVisible(true);
        hgm.setIcon(hardgamemode);
        gamedifficulty.add(hgm);
        JPanel hardJPanel = new JPanel();
        hardJPanel.add(backgroundLabel);
        gamedifficulty.add(hardJPanel);


        //Menu Frame
        gamedifficulty.setTitle("TicTacToe Game");
        gamedifficulty.add(backgroundLabel);
        gamedifficulty.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gamedifficulty.setSize(500, 500);
        gamedifficulty.setVisible(true);
        gamedifficulty.setResizable(false);
        gamedifficulty.setLocationRelativeTo(null);
    
        
        egm.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                 gamedifficulty.dispose();
                new EasyMode(colorX,colorO);
               
            
                
        }  
    });  

        mgm.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
             gamedifficulty.dispose();
            new MediumMode(colorX,colorO);
           
        
            
    }  
    });  

        hgm.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                 gamedifficulty.dispose();
                new HardMode(colorX,colorO);
               
            
                
        }  
    });  



    

    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    private class EventHandlerX implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {
            colorX = colorsClassArray[listX.getSelectedIndex()];
            labelX.setForeground(colorsClassArray[listX.getSelectedIndex()]);
        }
    }

    private class EventHandlerO implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {
            colorO = colorsClassArray[listO.getSelectedIndex()];
            labelO.setForeground(colorsClassArray[listO.getSelectedIndex()]);
        }
    }
   
 }