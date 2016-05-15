
package swingcountertrial;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author james
 */
public class SwingCounterTrial extends JFrame implements ActionListener{

    JFrame frame = new JFrame();
    JPanel pnl = new JPanel();
    JLabel lbl1 = new JLabel("Counter");
    JTextField txt1 = new JTextField();
    JButton btn1 = new JButton("Count");
    int count = 0;
    
    
    public SwingCounterTrial()
    {
        super("Swing Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        add(pnl);
        
        btn1.addActionListener(this);
        txt1.setPreferredSize(new Dimension(100,25));
        txt1.setText("" + count);
        
        pnl.add(lbl1);
        pnl.add(txt1);
        pnl.add(btn1);
        
        setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        SwingCounterTrial counter = new SwingCounterTrial();
        
//        @Override
//        public void run()
//        {
//            setVisible(true);
//        }
    }

    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == btn1)
        {
            count = count + 1;
            txt1.setText("" + count);        
        }
    }
    
}
