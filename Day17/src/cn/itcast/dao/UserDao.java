package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * ��������û����в����Ľӿ�
 * @author Tyler.chen
 *	@version V1.0
 */

public interface UserDao {
	/**
	 * �����û��ǵĹ���
	 * 
	 * @param username
	 * 			�û���
	 * @param password
	 * 			����
	 * @return  ���ص�¼�Ƿ�ɹ�
	 */
	public abstract boolean isLgin(String username ,String password);
	public abstract void regesi(User user);
}
