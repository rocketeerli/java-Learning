/*ʹ��lambda����ʽ�����¼�����*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class EventDemo6 {
	JFrame frame;
	JButton okButton,cancelButton;
	EventDemo6(String title) {
		frame = new JFrame(title);
		frame.setSize(800,600);
		frame.setLayout(new FlowLayout());
		okButton = new JButton("ȷ��");
		cancelButton = new JButton("ȡ��");
		frame.add(okButton);
		frame.add(cancelButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okButton.addActionListener(e->frame.setTitle("�����ȷ����ť"));
		cancelButton.addActionListener(e->frame.setTitle("�����ȡ����ť"));
	}
}
public class JavaActionEventEdition6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo6 evd = new EventDemo6("�¼���Ӧ");
	}
}