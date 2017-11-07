package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
/**
 * 这用户操作的具体现实类(集合版)
 * @author Tyler.chen
 * @version V1.0
 *
 */

public class UserDaoImpl implements UserDao {
	
	//为了让多个方法能够使用同一个集合，把集合定义为成员变量
	
	//为了让多个对象共享同一个成员变量，用static
	private static  ArrayList<User> array=new ArrayList<User>();
	@Override
	public boolean isLgin(String username, String password) {
		// 遍历结合，获取每一个用户，判断该用户的用户名和密码是否和传递过来的匹配
		boolean flag =false; //不匹配
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
	 * 注册功能
	 */
	public void regesi(User user) {
		//把用户信息存储集合
		//ArrayList<User> array=new ArrayList<User>();
		array.add(user);
		

	}

}
