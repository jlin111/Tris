package tris;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jay Lean
 */
public class MainMenu extends JFrame{
    private JPanel pannelloPrincipale;
    private JLabel Titolo;
    private JButton start, quit;
    
    public MainMenu(){
        pannelloPrincipale = new JPanel(new GridLayout(3,1));
        Titolo = new JLabel("TIC TAC TOE");
        Titolo.setFont(new Font("Stencil Std", Font.BOLD + Font.BOLD, 72));
        Titolo.setForeground(new Color(136,0,21));
        start = new JButton("START");
        start.setForeground(new Color(255,127,39));
        quit = new JButton("QUIT");
        quit.setForeground(new Color(255,127,39));
            
    }
    
}




