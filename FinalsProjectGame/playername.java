import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class playername extends JFrame {

    JTextField textField;
    JTextField textField2;

    playername() {
        super("TicTacToe Game");
        this.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel();
        label.setText("Enter O Player Name: ");
        label.setFont(new Font("Consolas", Font.BOLD, 30));
        label.setForeground(new Color(216,135,255));

        // JTextField
        textField = new JTextField(20);

        // Adds event to textfield
        EventHandler handler = new EventHandler();
        textField.addKeyListener(handler);

        // Add components to frame
        this.add(label);
        this.add(textField);

         // JLabel
         JLabel label2 = new JLabel();
         label2.setText("Enter X Player Name: ");
         label2.setFont(new Font("Consolas", Font.BOLD, 30));
         label2.setForeground(new Color(78,215,255));
 
         // JTextField
         textField2 = new JTextField(20);
         // Adds event to textfield
         EventHandler handler2 = new EventHandler();
         textField2.addKeyListener(handler2);
 
         // Add components to frame
         this.add(label2);
         this.add(textField2);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 200);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(27, 11, 84));

    }

    private class EventHandler implements KeyListener {

        public void keyPressed(KeyEvent event) {

            EasyMode em = EMode();
            MediumMode mm = MMode();
            HardMode hm = HMode();

            // If ENTER button is pressed, do this
            if (event.getKeyCode() == KeyEvent.VK_SPACE) {

                //player o
                em.Nameplayero = textField.getText();
                mm.Nameplayero = textField.getText();
                hm.Nameplayero = textField.getText();

                //player x
                em.Nameplayerx = textField2.getText();
                mm.Nameplayerx = textField2.getText();
                hm.Nameplayerx = textField2.getText();

    
                // Close playermenu frame
                dispose();

                // Go to game frame
                new GameDifficulty();
            }
        }

        private HardMode HMode() {
            return null;
        }

        private MediumMode MMode() {
            return null;
        }

        public void keyTyped(KeyEvent event) {
            //
        }

        public void keyReleased(KeyEvent event) {
            //
        }
    }

    public GameDifficulty GameDifficulty() {
        return null;
    }

    public EasyMode EMode() {
        return null;
    }
}


