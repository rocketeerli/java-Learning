/*ʹ���ڲ��������������¼�����*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class EventDemo5 {
	JFrame frame;
	JButton okButton, cancelButton;
	EventDemo5(String title) {
		frame = new JFrame(title);
		frame.setSize(600,400);
		frame.setLayout(new FlowLayout());
		okButton = new JButton("ȷ��");
		cancelButton = new JButton("ȡ��");
		frame.add(okButton);
		frame.add(cancelButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������������С�ȷ������ť���¼�����
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setTitle("�����ȷ����ť");
			}
		});
		//������������С�ȡ������ť���¼�����
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setTitle("�����ȡ����ť");
			}
		});
	}
}
public class JavaActionEventEdition5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo5 evd = new EventDemo5("�¼���Ӧ");
	}
}