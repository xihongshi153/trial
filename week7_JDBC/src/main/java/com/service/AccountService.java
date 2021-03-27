package com.service;
import com.entity.Account;
import com.mapper.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountService {
    private AccountDao accountDao;
    public AccountService() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession(true);
        accountDao = session.getMapper(AccountDao.class);
    }
    // 1查询所有记录
    public List<Account> findAll() {
        return accountDao.findAll();
    }
    // 2通过id删除记录
    void deleteByPrimaryKey(String id) {
        accountDao.deleteByPrimaryKey(id);
    }
    // 3插入记录
    void insert(Account record) {
        accountDao.insert(record);
    } // 4通过id查找对象
    Account selectByPrimaryKey(String id) {
        return accountDao.selectByPrimaryKey(id);
    }
    // 5更新Account
    void updateByPrimaryKey(Account record) {
        accountDao.updateByPrimaryKey(record);
    }
    // 6转账功能 输入转出人id，转入人id，转账金额 实现转账
    void transfer(String remitterId,String remitteeId,int money) {
        Account account1=selectByPrimaryKey(remitterId);
        Account account2=selectByPrimaryKey(remitteeId);
        account1.setMoney(account1.getMoney()-money);
        account2.setMoney(account2.getMoney()+money);
        updateByPrimaryKey(account1);
        updateByPrimaryKey(account2);
    }
}
