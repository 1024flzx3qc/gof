package cn.zjz.ssm.service;

import cn.zjz.ssm.pojo.Users;

/**
 * @Description:
 * @Author: ZhuJingZhuang
 * @Version: 1.0.0
 * @Date: 2019/7/15 14:44:00
 */
public interface UserServices {
    int addUser(Users user);
    int delUser(Users user);
    int updUser(Users user);
    Users selUser(Users user);
}
