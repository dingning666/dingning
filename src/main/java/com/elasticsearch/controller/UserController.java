/*
package com.elasticsearch.controller;

import com.elasticsearch.entity.User;
import com.elasticsearch.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/elasticsearch")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

    */
/**
     *  新增文档
     *
     * @param user
     * @return AppResponse
     * @author dingning
     * @Date 2020-04-01
     *//*

    @PostMapping("/saveUser")
    public User saveUser(User user) {
        try {
            User resulst = userService.save(user);
            return resulst;
        } catch (Exception e) {
            logger.error("文档新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    */
/**
     *  删除文档
     *
     * @param user
     * @return AppResponse
     * @author dingning
     * @Date 2020-04-01
     *//*

    @PostMapping("/deleteUser")
    public void deleteUser(User user) {
        try {
            userService.delete(user);
        } catch (Exception e) {
            logger.error("文档删除失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    */
/**
     *  查询
     *
     * @param name
     * @return AppResponse
     * @author dingning
     * @Date 2020-04-01
     *//*

    @PostMapping("/findByName")
    public List<User> findByName(String name) {
        try {
            List<User> userList = userService.findByName(name);
            return userList;
        } catch (Exception e) {
            logger.error("文档查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    */
/**
     *  查询全部
     *
     * @return AppResponse
     * @author dingning
     * @Date 2020-04-01
     *//*

    @PostMapping("/findAll")
    public List<User> findAll() {
        try {
            List<User> userList = userService.findAll();
            return userList;
        } catch (Exception e) {
            logger.error("文档查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }


}
*/
