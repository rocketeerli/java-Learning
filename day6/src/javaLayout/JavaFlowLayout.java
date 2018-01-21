package javaLayout;
import java.awt.*;
import javax.swing.*;
class FlowLayoutDemo {
	JFrame frame;
	JButton button1,button2,button3,button4,button5;
	public FlowLayoutDemo(String title) {
		frame = new JFrame(title);
		frame.setSize(260, 150);
		button1 = new JButton("第一个按钮");
		button2 = new JButton("第二个按钮");
		button3 = new JButton("第三个按钮");
		button4 = new JButton("第四个按钮");
		button5 = new JButton("第五个按钮");
		//设置流式布局管理器.
		frame.getContentPane().setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class JavaFlowLayout {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutDemo("FlowLayout");
		
	}

}
