package cn.itcast.game;

import java.util.Scanner;

/**
 * ���ǲ�����С��Ϸ
 * @author Tyler.chen
 *	@version V1.0
 */

public class GuessNumber {
	private GuessNumber(){
		
	}
	public static void start(){
		//����һ�������
		int number=(int)(Math.random()*100)+1;
		//����һ��ͳ������
		int count=0;
		
		
		while(true){
		//����¼��һ������
		Scanner sc=new Scanner(System.in);
		System.out.println("����������(1-100)");
		int GuessNumber =sc.nextInt();
		count++;
		//�ж�
		if(GuessNumber>number){
			System.out.println("��µ���"+GuessNumber+"����");
			
		}else if(GuessNumber<number){
			System.out.println("��µ���"+GuessNumber+"С��");
		}else{
			System.out.println("��ϲ��,"+count+"�β�����");
			break;
		}
	}
	}
}
