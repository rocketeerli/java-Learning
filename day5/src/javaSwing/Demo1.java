package javaSwing;
import java.awt.*;
import javax.swing.*;
class LoginGUI{
	//�����������.
	JFrame frame;
	JLabel labelUserName, labelPassword;
	JTextField textFieldUserName;
	JPasswordField passwordField;
	JButton buttonLogin, buttonReset;
	LoginGUI(String title){                  //�������������Ȼ����װ��ͳһ�Ľ���.
		frame = new JFrame(title);           //�������.
		//���ÿ�ܵĲ��ֹ�����.
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setSize(200, 200); 
		this.labelUserName = new JLabel("�û���");   //�����������.
		labelPassword = new JLabel("��  ��");
		textFieldUserName = new JTextField(10);
		passwordField = new JPasswordField(10);
		buttonLogin = new JButton("��¼");
		buttonReset = new JButton("����");
		frame.add(labelUserName);                 //��������ӵ������.
		frame.add(labelPassword);
		frame.add(textFieldUserName);
		frame.add(passwordField);
		frame.add(buttonLogin);
		frame.add(buttonReset);
		frame.setVisible(true);                   //���ÿ�ܵĿɼ���.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}
public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginGUI("��¼");
	}

}