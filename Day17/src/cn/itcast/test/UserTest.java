package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/**
 * �û�������
 * @author Tyler.chen
 * @version V1.0
 *
 */

public class UserTest {
	public static void main(String[] args){
		
		//Ϊ�˿��Ի���
		while(true){
		
		//��ӭ���棬����ѡ����
		System.out.println("------��ӭ����-------");
		System.out.println("1��¼");
		System.out.println("2ע��");
		System.out.println("3�˳�");
		System.out.println("���������ѡ��");
		
		//����¼��ѡ�񣬸���ѡ������ͬ�Ĳ��� 
		Scanner sc=new Scanner(System.in);
		
		//Ϊ�˺����¼�����ķ��㣬�����е�����¼��ȫ�����ַ�����
		String choiceString =sc.nextLine();
		
		//����ط�Ҫʹ���ҾͶ�������
		UserDao ud=new UserDaoImpl();
		switch (choiceString) {
			case "1":
			//��ӭ���棬�������û���������
			System.out.println("-------��½����-------");
			System.out.println("�������û�����");
			String username=sc.nextLine();
			System.out.println("���������룺");
			String password=sc.nextLine();
			
			//���õ�½����
			//UserDao ud=new UserDaoImpl();
			boolean falg=ud.isLgin(username, password);
			if(falg){ 
				System.out.println("��½�ɹ�");
				
				//����Ϸ
				GuessNumber.start();
				
				//break;  //����дbreak����������switch
				System.exit(0);
			}else{
				System.out.println("�л��������������󣬵�¼ʧ��");
			}
			break;
			case "2":
			//��ӭ���棬�������û���������
			System.out.println("-------ע�����-------");
			System.out.println("�������û�����");
			String newUsername=sc.nextLine();
			System.out.println("���������룺");
			String newPassword=sc.nextLine();
			
			//���û����������װ�ɶ���
			User user=new User();
			user.setUsername(newUsername);
			user.setPassword(newPassword);
			//����ע�Ṧ��
			//��̬
			//UserDao ud=new UserDaoImpl();
			
			
			ud.regesi(user); //�����û���������Ҫ���û����������װ�ɶ���
			System.out.println("ע��ɹ�");
			
			break;
		case "3":
		default:
			System.out.println("ллʹ�ã���ӭ�´�����");
			System.exit(0);
			break;
		}
		}
	}

}
