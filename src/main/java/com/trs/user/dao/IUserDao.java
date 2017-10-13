package com.trs.user.dao;

import com.trs.user.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Title:
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: HaierFramework
 * Author: E_wind
 * Create Time:2017/10/10 13:41
 */

/*dao职责描述

数据库操作的实现*/
@Repository
public interface IUserDao {

    /*service/dao 层方法命名规约

获取单个对象的方法用 get 做前缀。
获取多个对象的方法用 list 做前缀。
获取统计值的方法用 count 做前缀。
插入的方法用save做前缀。
删除的方法用remove做前缀。
修改的方法用update做前缀。*/
    /*所有的抽象方法（包括接口中的方法）必须要用 Javadoc 注释、除了返回值、参数、 异常说明外，
    还必须指出该方法做什么事情，实现什么功能。对子类的实现要求，或者调用注意事项，请一并说明。*/

    /**
     *通过id查询用户
     * @param id userid
     * @return user
     */
    User getUserById(int id);

    /**
     * 查询所有用户
     * @return users
     */
    List<User> listUser();

    /**
     * 计算用户数量
     * @return int
     */
    int countUser();

    /**
     * 添加用户
     * @param user user
     */
    void saveUser(User user);

    /**
     * 通过用户id删除用户
     * @param id userid
     */
    void removeUser(int id);

    /**
     * 更改用户密码
     * @param password user's password
     */
    void updateUser(String password);
}
