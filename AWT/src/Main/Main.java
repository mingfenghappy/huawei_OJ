package Main;
import java.awt.*;

import javax.swing.Box;
public class Main {
	Frame f = new Frame("���Դ���");
	Button ok = new Button("ȷ��");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox male = new Checkbox("��",cbg,true);
	Checkbox female = new Checkbox("Ů",cbg,false);
	Checkbox married = new Checkbox("����",true);
	Choice colorChooser = new Choice();
	List colorList = new List(6,true);
	TextArea ta = new TextArea(5,20);
	TextField name = new TextField(50);
	public void init(){
		colorChooser.add("��ɫ");
		colorChooser.add("��ɫ");
		colorChooser.add("��ɫ");
		colorList.add("a");
		colorList.add("b");
		Panel bottom = new Panel();
		bottom.add(name);
		bottom.add(ok);
		f.add(bottom,BorderLayout.SOUTH);
		Panel checkPanel = new Panel();
		checkPanel.add(colorChooser);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);
		Box topLeft = Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(checkPanel);
		Box top = Box.createVerticalBox();
		top.add(topLeft);
		top.add(colorList);
		f.add(top);

		
		f.pack();
		f.setVisible(true);
		
	}
		public static void main(String[] args){
			new Main().init();
		}
	}


