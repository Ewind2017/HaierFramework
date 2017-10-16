package com.trs.user.controller;

import com.trs.user.pojo.User;
import com.trs.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
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

/*controller职责描述

搜集参数
简单的参数验证
处理服务级别业务并调用service层
转发或重定向结果集*/
/**
 *
 */
@Controller
public class UserController {
    @Autowired
    IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getUserById")
    public String getUserById(int id, HttpSession session) {

        User user = userService.getUserById(id);
        session.setAttribute("user", user);

        return "test";
    }

    @RequestMapping("/listUser")
    public String listUser(HttpSession session) {

        List<User> userList = userService.listUser();
        session.setAttribute("userList", userList);

        return "test";
    }

    @RequestMapping("/countUser")
    public String countUser(HttpSession session) {

        int userCount = userService.countUser();
        session.setAttribute("userCount", userCount);

        return "test";
    }

    @RequestMapping("/saveUser")
    public void saveUser(String name, String password) {

        userService.saveUser(name, password);

    }

    @RequestMapping("/removeUser")
    public void removeUser(int id) {

        userService.removeUser(id);

    }

    @RequestMapping("/updateUser")
    public void updateUser(String password) {

        userService.updateUser(password);

    }
}
