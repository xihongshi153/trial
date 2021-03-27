package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;


    @Before//前
    public void init() throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3.获取SqlSession对象
        SqlSessionFactory factory = builder.build(in);
        //4.获取Dao的代理对象
        sqlSession = factory.openSession();
        userDao = sqlSession.getMapper(IUserDao.class);
    }


    @After
    public void destroy() throws Exception{
        //提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();

    }



    /**
     * 入门案例
     */
    @Test
    public  void testFindAll() throws Exception {

        //5.执行查询所有方法

        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }

    /**
     * 测试保存
     */
    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("test Save");
        user.setAddress("重庆");
        user.setBirthday(new Date());
        user.setSex("男");
        System.out.println(user);
        //执行方法
        userDao.saveUser(user);
        System.out.println(user);


    }

    /**
     * 测试更新操作
     */
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(2);
        user.setUsername("谢圭尹2");
        user.setAddress("重庆");
        user.setBirthday(new Date());
        user.setSex("男");

        //执行方法
        userDao.updateUser(user);
    }
    /**
     * 测试删除操作
     */
    @Test
    public void testDelete(){
        //删除操作
        userDao.deleteUser(3);
    }

    /**
     *根据ID查询
     */
    @Test
    public void testFindOne (){
        User user = userDao.findById(1);
        System.out.println(user);

    }
    /**
     *根据ID查询
     */
    @Test
    public void testFindByName (){
        List<User> users = userDao.findByName("%谢%");
        for(User user:users){
            System.out.println(user);
        }
    }

    /**
     * 查询总记录条数
     */
    @Test
    public void testFindTotal(){
        int count=userDao.findTotal();
        System.out.println(count);
    }

}
