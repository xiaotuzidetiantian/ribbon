package com.wxf.sc.servcie;

import com.wxf.sc.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务降级的熔断调用实现类
 */
@Component
public class UserServiceFailBack  implements  UserService{

    @Override
    public String getNameById(int uid) {
        return "没有得到【"+uid+"】的用户" ;
    }

    @Override
    public List<String> testlist() {
        List<String> ls = new ArrayList<>();
        ls.add("无他");
        ls.add("无他");
        return ls;
    }

    @Override
    public List<User> getUserlist() {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setName("guest");
        users.add(user);

        return users;
    }
}
