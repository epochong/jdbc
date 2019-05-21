package cn.epochong;
/**
 * @author wangchong
 * @date 2019/5/18 11:54
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC入门
 */
public class Jdbc {
    public static void main(String[] args) throws Exception{
            //1. 导入驱动jar包
            //2.注册驱动
            // Class.forName("com.mysql.jdbc.Driver");
            //3.获取数据库连接对象
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "wangchong");
            //4.定义sql语句
            //String sql = "update account set balance = 2000 where id = 1";
            String updateSql = "update jdbc.tb_user set mname = 'Jack' where id = 1";
            String insertSql = "insert into tb_user values(3,'Baby','女','123@qq.com,'199-01-01')";
            //5.获取执行sql的对象 Statement
            Statement stmt = conn.createStatement();
            //6.执行sql
            int count = stmt.executeUpdate(updateSql);
            //7.处理结果
            System.out.println("执行修改语句:" + "影响行数:" + count + "行");
            //stmt.executeUpdate()

            //8.释放资源
            stmt.close();
            conn.close();
        }
}
