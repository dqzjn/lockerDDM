package cn.zmdx.locker.service.interfaces;

import cn.zmdx.locker.entity.User;

public interface UserService {
   public int addUser(User user);
   //��֤�û��Ƿ�ɹ���¼
   public boolean verifyUser(User user);
   
}
