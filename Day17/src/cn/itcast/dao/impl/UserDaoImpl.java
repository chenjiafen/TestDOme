package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
/**
 * ���û������ľ�����ʵ��(���ϰ�)
 * @author Tyler.chen
 * @version V1.0
 *
 */

public class UserDaoImpl implements UserDao {
	
	//Ϊ���ö�������ܹ�ʹ��ͬһ�����ϣ��Ѽ��϶���Ϊ��Ա����
	
	//Ϊ���ö��������ͬһ����Ա��������static
	private static  ArrayList<User> array=new ArrayList<User>();
	@Override
	public boolean isLgin(String username, String password) {
		// ������ϣ���ȡÿһ���û����жϸ��û����û����������Ƿ�ʹ��ݹ�����ƥ��
		boolean flag =false; //��ƥ��
		for(User u:array){
			if(u.getUsername().equals(username)&& u.getPassword().equals(password)){
				flag =true;
				break;
			}
		}
		
		return flag;
	}

	@Override
	/**
	 * ע�Ṧ��
	 */
	public void regesi(User user) {
		//���û���Ϣ�洢����
		//ArrayList<User> array=new ArrayList<User>();
		array.add(user);
		

	}

}
