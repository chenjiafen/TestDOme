package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * 这是针对用户进行操作的接口
 * @author Tyler.chen
 *	@version V1.0
 */

public interface UserDao {
	/**
	 * 这是用户登的功能
	 * 
	 * @param username
	 * 			用户名
	 * @param password
	 * 			密码
	 * @return  返回登录是否成功
	 */
	public abstract boolean isLgin(String username ,String password);
	public abstract void regesi(User user);
}
