package cn.zjz.ssm.controller;

import cn.zjz.ssm.pojo.Users;
import cn.zjz.ssm.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: ZhuJingZhuang
 * @Version: 1.0.0
 * @Date: 2019/7/15 14:53:00
 */
@RequestMapping("/test")
@ResponseBody
@Controller
public class TestController {
    @Autowired
    private UserServices userServices;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody Users user){
        return userServices.addUser(user);
    }

    @RequestMapping(value="/delUser",method = RequestMethod.POST)
    public int delUser(@RequestBody Users user) {
        return userServices.delUser(user);
    }

    @RequestMapping(value="/updUser",method = RequestMethod.POST)
    public int updUser(@RequestBody Users user) {
        return userServices.updUser(user);
    }

    @RequestMapping(value = "/selUser", method = RequestMethod.POST)
    public Users selUser(@RequestBody Users user){
        return userServices.selUser(user);
    }
}
