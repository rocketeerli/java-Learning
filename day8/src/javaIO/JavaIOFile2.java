/*���ı��ļ��ж�ȡ���ݲ���ʾ����Ļ��.*/
package javaIO;
import java.io.*;
public class JavaIOFile2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\test\\data.txt");   //�����ļ�����.
			//ʹ���ļ����󴴽��ļ������������൱�ڴ��ļ�.
			FileInputStream fileInputStream = new FileInputStream(file);
			char ch;
			for (int i = 0;i < file.length();i++) {  //ʹ��ѭ����ȡȫ������.
				ch = (char) (fileInputStream.read()); //�����ж�ȡһ���ֽ�.
				System.out.print(ch);
			}
			fileInputStream.close();          //�ر���.
		}
		catch (FileNotFoundException fnfe) {     //�����ļ��޷��ҵ��쳣.
			System.out.println("�ļ���ʧ�ܡ�");
		}
		catch (IOException ioe) {                //��������/����쳣.
			System.out.println("�ļ������쳣��");
		}
	}
}