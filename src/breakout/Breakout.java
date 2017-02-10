package breakout;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author joomlah
 */
public class Breakout extends JFrame {
    
    public Breakout() {
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        setTitle("Breakout");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Commons.WIDTH, Commons.HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() { 
            @Override
            public void run() {
                Breakout game = new Breakout();
                game.setVisible(true);
            }
        });
    }
    
}
