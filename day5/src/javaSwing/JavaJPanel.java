package javaSwing;
import javax.swing.*;

import java.awt.Color;
import java.awt.color.*;
public class JavaJPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JPanelʾ��");
		frame.setSize(800, 600);
		frame.setLayout(null);          //��frame�Ĳ��ֹ�������Ϊnull.
		JPanel panel = new JPanel();    //�������.
		panel.setSize(300,200);         //�������Ŀ��͸�.
		panel.setBackground(Color.BLUE);//�������ı���ɫ.
		frame.add(panel);               //��������ӵ�frame��.
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}