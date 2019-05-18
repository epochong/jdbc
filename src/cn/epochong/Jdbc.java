package cn.epochong;
/**
 * @author wangchong
 * @date 2019/5/18 11:54
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */

import java.sql.DriverManager;

/**
 * JDBC入门
 */
public class Jdbc {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","password");
        String sql = "update account set balance = ";
    }
}
