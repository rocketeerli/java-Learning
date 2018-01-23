/*在用户关闭窗口时退出程序*/
package javaEvent;
import javax.swing.*;
import java.awt.event.*;
class QuitWindow2 extends WindowAdapter {        //继承适配器类.
	public void WindowClosing(WindowEvent e) {   //只需覆盖所需的一个方法.
		System.exit(0);
	}
}
public class JavaWindowEventEdition2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.addWindowListener(new QuitWindow2());  //窗口事件注册.
	}
}
