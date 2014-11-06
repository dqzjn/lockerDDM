package cn.zmdx.locker.actions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class test1 {
	public static void main(String[] args) throws Exception {     
        Properties p = new Properties();// 属性集合对象     
        FileInputStream fis = new FileInputStream("WEB-INF/c3p0.properties");// 属性文件输入流     
        p.load(fis);// 将属性文件流装载到Properties对象中     
        fis.close();// 关闭流     
    
        String url = p.getProperty("c3p0.cloudTestUrl");
		String driverName = p.getProperty("c3p0.cloudTestDriverClassName");
		String userName = p.getProperty("c3p0.cloudTestUsername");
		String password = p.getProperty("c3p0.cloudTestPassword");
    
    }     
}
