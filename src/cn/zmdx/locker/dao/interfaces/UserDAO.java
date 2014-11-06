package cn.zmdx.locker.dao.interfaces;

import cn.zmdx.locker.entity.User;

public interface UserDAO extends ParentDAO {
	
	User get(Integer id);
	
    int save(User user);

	public String getPassword(User user);
	
}
