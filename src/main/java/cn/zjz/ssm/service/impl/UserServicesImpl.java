package cn.zjz.ssm.service.impl;

import cn.zjz.ssm.mapper.UsersMapper;
import cn.zjz.ssm.pojo.Users;
import cn.zjz.ssm.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: ZhuJingZhuang
 * @Version: 1.0.0
 * @Date: 2019/7/15 18:34:00
 */
@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int addUser(Users user){
        return usersMapper.insertSelective(user);
    }

    @Override
    public int delUser(Users user) {
        return usersMapper.deleteByPrimaryKey(user.getId());
    }

    @Override
    public int updUser(Users user) {
        return usersMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public Users selUser(Users user) {
        return usersMapper.selectByPrimaryKey(user.getId());
    }
}
