/*���û��رմ���ʱ�˳�����*/
package javaEvent;
import javax.swing.*;
import java.awt.event.*;
class QuitWindow2 extends WindowAdapter {        //�̳���������.
	public void WindowClosing(WindowEvent e) {   //ֻ�踲�������һ������.
		System.exit(0);
	}
}
public class JavaWindowEventEdition2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.addWindowListener(new QuitWindow2());  //�����¼�ע��.
	}
}