package m;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class totalOrder extends JFrame {

   private JPanel c;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               totalOrder frame = new totalOrder();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public totalOrder() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      c = new JPanel();
      //c.setBorder(new EmptyBorder(5, 5, 5, 5));
      c.setLayout(null);
      setContentPane(c);
      
      JPanel p1 = new JPanel();
      p1.setBounds(0, 0, 432, 30);
      
      p1.setLayout(new BorderLayout(0, 0));
      
      JLabel laTotalMenu = new JLabel("<<\uC8FC\uBB38\uBAA9\uB85D>>");
      laTotalMenu.setVerticalAlignment(SwingConstants.TOP);
      laTotalMenu.setHorizontalAlignment(SwingConstants.LEFT);
      laTotalMenu.setFont(new Font("µ¸¿ò", Font.PLAIN, 24));
      
      p1.add(laTotalMenu, BorderLayout.SOUTH);
      c.add(p1);
      
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 10, 10);
      c.add(panel);
      
      JTextArea textArea = new JTextArea();
      textArea.setBounds(0, 42, 432, 163);
      c.add(textArea);
      
      JButton btnNewButton = new JButton("remove");
      btnNewButton.setBounds(10, 214, 206, 27);
      c.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("complete");
      btnNewButton_1.setBounds(230, 214, 188, 27);
      c.add(btnNewButton_1);
      
      
   }

}