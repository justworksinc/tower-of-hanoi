package io.github.justworksinc.towerofhanoi;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
public class THScreen extends JPanel{
	private static final long serialVersionUID=-2327290491673766502L;
	private THEngine engine;
	private Container towers,buttons;
	private JButton newgame,setheight,quit;
	public THScreen(THEngine e){
		engine=e;towers=new Container();buttons=new Container();newgame=new JButton("New Game");setheight=new JButton("Set Height");quit=new JButton("Quit");
		addMouseListener(e);newgame.addActionListener(e);setheight.addActionListener(e);quit.addActionListener(e);
		setLayout(new BorderLayout());buttons.setLayout(new GridLayout(1,3));
		towers.paint(e.draw());add(newgame);buttons.add(setheight);buttons.add(quit);
		add(towers,BorderLayout.PAGE_START);add(buttons,BorderLayout.PAGE_END);
	}
}
