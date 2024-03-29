/*使用lambda表达式进行事件处理*/
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
		okButton = new JButton("确定");
		cancelButton = new JButton("取消");
		frame.add(okButton);
		frame.add(cancelButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okButton.addActionListener(e->frame.setTitle("点击了确定按钮"));
		cancelButton.addActionListener(e->frame.setTitle("点击了取消按钮"));
	}
}
public class JavaActionEventEdition6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo6 evd = new EventDemo6("事件响应");
	}
}
