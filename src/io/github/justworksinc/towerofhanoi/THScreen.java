package io.github.justworksinc.towerofhanoi;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class THScreen extends JPanel{
	private static final long serialVersionUID=-2327290491673766502L;
	private Container towers,buttons;
	private JButton newgame,setheight,quit;
	public THScreen(THEngine thengine){
		towers=new Container();buttons=new Container();newgame=new JButton("New Game");setheight=new JButton("Set Height");quit=new JButton("Quit");
		addMouseListener(thengine);addComponentListener(thengine);
		newgame.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){thengine.reset();}});
		setheight.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){while(true)try{thengine.setHeight(Integer.parseInt(JOptionPane.showInputDialog(towers,"Enter a new height","4")));break;}catch(Exception ex){JOptionPane.showMessageDialog(towers,"You must enter a positive integer","Invalid number",JOptionPane.ERROR_MESSAGE);}}});
		quit.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){System.exit(0);}});
		setLayout(new BorderLayout());buttons.setLayout(new GridLayout(1,3));
		towers.paint(thengine.draw());buttons.add(newgame);buttons.add(setheight);buttons.add(quit);
		add(towers,BorderLayout.PAGE_START);add(buttons,BorderLayout.PAGE_END);
	}
}
