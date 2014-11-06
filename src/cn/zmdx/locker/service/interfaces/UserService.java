package cn.zmdx.locker.service.interfaces;

import cn.zmdx.locker.entity.User;

public interface UserService {
   public int addUser(User user);
   //验证用户是否成功登录
   public boolean verifyUser(User user);
   
}
