package JavaTutorial1;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AbstractFactory {

	public static void main(String[] args) {
		GUIFactory fact = new SwingFactory();
		Frame f = fact.getFrame();
		Component c1 = fact.getButton();
		Component c2 = fact.getTextField();
		
		f.setSize(500,300);
		f.setLayout(new FlowLayout());
		f.add(c1);
		f.add(c2);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}

abstract class GUIFactory{
	public abstract Component getButton();
	public abstract Component getTextField();
	public abstract Frame getFrame();
}

class AWTFactory extends GUIFactory{

	@Override
	public Component getButton() {
		System.out.println("AWT factory get Button.");
		return new Button("AWT Button");
	}

	@Override
	public Component getTextField() {
		System.out.println("AWT factory get textfield.");
		return new TextField();
	}

	@Override
	public Frame getFrame() {
		return new Frame("AWT Frame");
	}
	
}

class SwingFactory extends GUIFactory{

	@Override
	public Component getButton() {
		return new JButton("SWing Button");
	}

	@Override
	public Component getTextField() {
		return new JTextField(20);
	}

	@Override
	public Frame getFrame() {
		return new JFrame("SWing Frame");
	}
	
}
