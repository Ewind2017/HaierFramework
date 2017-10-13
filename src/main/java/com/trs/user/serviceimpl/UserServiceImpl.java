package com.trs.user.serviceimpl;

import com.trs.user.dao.IUserDao;
import com.trs.user.pojo.User;
import com.trs.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: HaierFramework
 * Author: E_wind
 * Create Time:2017/10/10 13:45
 */

/*实现类在类名后加Impl*/

/*service职责描述
业务逻辑的实现
dao层的调用
处理事务*/
@Service
public class UserServiceImpl implements IUserService {
    /*方法名、参数名、成员变量、局部变量都统一使用 lowerCamelCase 风格，必须遵从驼峰形式。*/
    @Autowired
    public IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(int id) {
        User user = userDao.getUserById(id);
        return user;
    }

    public List<User> listUser() {

        List<User> userList = userDao.listUser();

        return userList;
    }

    public int countUser() {

        int userCount = userDao.countUser();

        return userCount;
    }

    public void saveUser(String name, String password) {

        User user = new User();

        user.setName(name);
        user.setPassword(password);

        userDao.saveUser(user);

    }

    public void removeUser(int id) {

        userDao.removeUser(id);

    }

    /*数据更新时，不要更新无改动的字段，一是易出错；二是效率低；三是增加 binlog 存储*/
    public void updateUser(String password) {

        userDao.updateUser(password);

    }
}
