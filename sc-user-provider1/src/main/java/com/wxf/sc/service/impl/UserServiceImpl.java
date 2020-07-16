package com.wxf.sc.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wxf.sc.entity.User;
import com.wxf.sc.mapper.UserMapper;
import com.wxf.sc.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhuzhiguang
 * @since 2020-07-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
