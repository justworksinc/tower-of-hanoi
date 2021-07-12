package io.github.justworksinc.towerofhanoi;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class THMain{
  public static void main(String[] args){
    JFrame frame=new JFrame();
    frame.add(new THScreen(new THEngine()));
    frame.pack();
    frame.setLocation((int)((Toolkit.getDefaultToolkit().getScreenSize().getWidth()-frame.getWidth())/2),(int)((Toolkit.getDefaultToolkit().getScreenSize().getHeight()-frame.getHeight())/2));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
