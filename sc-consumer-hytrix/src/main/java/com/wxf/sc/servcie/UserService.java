package com.wxf.sc.servcie;


import com.wxf.sc.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
@FeignClient(name = "scuserservice")
//@FeignClient(name = "scuserservice",fallback = UserServiceFailBack.class)
public interface UserService {


    @RequestMapping("/getuser")
    String getNameById(@RequestParam("uid") int uid);

    @RequestMapping("/testList")
    List<String> testlist();

    @RequestMapping("/ulist")
    List<User> getUserlist();

}
