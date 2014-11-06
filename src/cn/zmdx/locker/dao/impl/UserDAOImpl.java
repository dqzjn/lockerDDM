package cn.zmdx.locker.dao.impl;

import java.util.List;

import cn.zmdx.locker.dao.interfaces.UserDAO;
import cn.zmdx.locker.entity.User;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDAOImpl extends ParentDAOImpl implements UserDAO {

	
	public UserDAOImpl(HibernateTemplate template) {
		super(template);
		// TODO Auto-generated constructor stub
	}
	public UserDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		template.save(user);
		return user.getId();
	}

	@Override
	public String getPassword(User user) {
		// TODO Auto-generated method stub
		List<String> password=template.find("select password from User where worker_no=?",user.getId());
		if(password.size()>0)
		{
			return password.get(0);
		}
		return null;
	}

	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
			
		
	}


