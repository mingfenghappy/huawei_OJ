package CommonComponent;
import java.awt.*;
import javax.swing.*;
public class CommonComponent {
Frame f = new Frame("����");
Button ok = new Button("ȷ��");
CheckboxGroup a = new CheckboxGroup();
Checkbox male = new Checkbox("��",a,true);
Checkbox female = new Checkbox("Ů",a,false);
Choice color =  new Choice();
List colorList = new List();
TextArea ta = new TextArea(5,20);
TextField name = new TextField(50);
public void init()
{
    color.add("��");
    color.add("��");
    color.add("��");
    colorList.add("��");
    colorList.add("��");
    Panel bottom =new Panel();
    bottom.add(name);
    bottom.add(ok);
    f.add(bottom,BorderLayout.SOUTH);
    Panel checkPanel = new Panel();
    checkPanel.add(color);
    checkPanel.add(male);
    checkPanel.add(female);
    Box topLeft = Box.createVerticalBox();
    topLeft.add(ta);
    topLeft.add(checkPanel);
    Box tope = Box.createHorizontalBox();
    tope.add(topLeft);
    tope.add(colorList);
    f.add(tope);
    f.pack();
    f.setVisible(true);
    
    
    	
}
public static void main(String[] args)
{
    new CommonComponent().init();	
}

}
