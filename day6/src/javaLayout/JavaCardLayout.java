/*����ܵĲ��ֹ���������Ϊ��Ƭ���ֹ�����������һ����塢һ����ť��
 * һ���ı���������У�Ȼ������ʾ���������.*/
package javaLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardLayoutDemo extends MouseAdapter {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;
	Container contentPane;
	CardLayout cardLayout;               //������Ƭ���ֹ���������.
	CardLayoutDemo() {
		frame = new JFrame("CardLayout");
		contentPane = frame.getContentPane();
		cardLayout = new CardLayout();           //������Ƭ���ֹ���������.
		contentPane.setLayout(cardLayout);      //Ϊframe���ÿ�Ƭ���ֹ�����.
		//����ÿ�����.
		panel = new JPanel();
		JLabel labelPanel = new JLabel("����һ�����");
		panel.add(labelPanel);
		label = new JLabel("����һ����ǩ");
		button = new JButton("����һ����ť");
		//��������ӵ�frame�У�ÿ���������һ������.
		frame.add(panel,"panel");
		frame.add(label,"label");
		frame.add(button, "button");
		cardLayout.show(contentPane, "panel");  //��ʾ���.
		frame.setSize(240, 180);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������¼�ע��.
		panel.addMouseListener(this);
		label.addMouseListener(this);
		button.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e) {       //�¼�����.
		cardLayout.next(contentPane);
	}
}
public class JavaCardLayout {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardLayoutDemo();
	}

}