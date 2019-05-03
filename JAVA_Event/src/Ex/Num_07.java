package Ex;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Num_07 extends JFrame{
   JLabel la;
   Num_07(){
      this.setTitle("마우스 휠을 굴려 폰트 크기 조절");
      this.setSize(300, 300);
      
      Container c = getContentPane();
      la = new JLabel("LOVE");
      la.setFont(new Font("Arial", Font.PLAIN, 10));
      c.add(la);
      la.addMouseWheelListener(new MouseWheelListener() {
         
         @Override
         public void mouseWheelMoved(MouseWheelEvent e) {
            int n = e.getWheelRotation();
            Font f = la.getFont();
            int size = f.getSize();
            if(n<0) {
               la.setFont(new Font("Arial", Font.PLAIN, size+5));
            }
            else {
               if(size > 5)
                  la.setFont(new Font("Arial", Font.PLAIN, size-5));
            }
         }
      });
      
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setVisible(true);
   }
   public static void main(String[] args) {
      new Num_07();
   }

}