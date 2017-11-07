package cn.itcast.game;

import java.util.Scanner;

/**
 * 这是猜数字小游戏
 * @author Tyler.chen
 *	@version V1.0
 */

public class GuessNumber {
	private GuessNumber(){
		
	}
	public static void start(){
		//产生一个随机数
		int number=(int)(Math.random()*100)+1;
		//定义一个统计数据
		int count=0;
		
		
		while(true){
		//键盘录入一个数字
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数据(1-100)");
		int GuessNumber =sc.nextInt();
		count++;
		//判断
		if(GuessNumber>number){
			System.out.println("你猜的数"+GuessNumber+"大了");
			
		}else if(GuessNumber<number){
			System.out.println("你猜的数"+GuessNumber+"小了");
		}else{
			System.out.println("恭喜你,"+count+"次猜中了");
			break;
		}
	}
	}
}
