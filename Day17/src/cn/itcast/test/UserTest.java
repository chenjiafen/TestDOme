package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/**
 * 用户测试类
 * @author Tyler.chen
 * @version V1.0
 *
 */

public class UserTest {
	public static void main(String[] args){
		
		//为了可以回来
		while(true){
		
		//欢迎界面，给出选择项
		System.out.println("------欢迎光临-------");
		System.out.println("1登录");
		System.out.println("2注册");
		System.out.println("3退出");
		System.out.println("请输入你的选择");
		
		//键盘录入选择，根据选择做不同的操作 
		Scanner sc=new Scanner(System.in);
		
		//为了后面的录入信心方便，我所有的数据录入全部用字符接收
		String choiceString =sc.nextLine();
		
		//多个地方要使用我就定义外面
		UserDao ud=new UserDaoImpl();
		switch (choiceString) {
			case "1":
			//欢迎界面，请输入用户名和密码
			System.out.println("-------登陆界面-------");
			System.out.println("请输入用户名：");
			String username=sc.nextLine();
			System.out.println("请输入密码：");
			String password=sc.nextLine();
			
			//调用登陆功能
			//UserDao ud=new UserDaoImpl();
			boolean falg=ud.isLgin(username, password);
			if(falg){ 
				System.out.println("登陆成功");
				
				//玩游戏
				GuessNumber.start();
				
				//break;  //这里写break，结束的是switch
				System.exit(0);
			}else{
				System.out.println("有户名或者密码有误，登录失败");
			}
			break;
			case "2":
			//欢迎界面，请输入用户名和密码
			System.out.println("-------注册界面-------");
			System.out.println("请输入用户名：");
			String newUsername=sc.nextLine();
			System.out.println("请输入密码：");
			String newPassword=sc.nextLine();
			
			//把用户名和密码封装成对象
			User user=new User();
			user.setUsername(newUsername);
			user.setPassword(newPassword);
			//调用注册功能
			//多态
			//UserDao ud=new UserDaoImpl();
			
			
			ud.regesi(user); //需求用户对象，所以要把用户名和密码封装成对象
			System.out.println("注册成功");
			
			break;
		case "3":
		default:
			System.out.println("谢谢使用，欢迎下次再来");
			System.exit(0);
			break;
		}
		}
	}

}
