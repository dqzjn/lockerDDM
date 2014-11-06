package cn.zmdx.locker.actions;

import java.io.PrintWriter;

import org.apache.struts2.ServletActionContext;

import cn.zmdx.locker.entity.User;
import cn.zmdx.locker.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	private UserServiceImpl userService;
	private String j_username;
	private String j_password;

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		PrintWriter out = ServletActionContext.getResponse().getWriter();
		try {
			String ids = ServletActionContext.getRequest().getParameter("ids");
			if ("admin".equals(j_username) && "1".equals(j_password)) {
				out.print("{\"ajaxResult\":\"success\"}");
				return SUCCESS;
			}
			return "false";
		} catch (Exception e) {
			e.printStackTrace();
			out.print("{\"ajaxResult\":\"error\"}");
			return "false";
		}

	}

	public String getJ_username() {
		return j_username;
	}

	public void setJ_username(String j_username) {
		this.j_username = j_username;
	}

	public String getJ_password() {
		return j_password;
	}

	public void setJ_password(String j_password) {
		this.j_password = j_password;
	}

}
