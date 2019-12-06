package cn.itstudies.ego.controller;

import cn.itstudies.ego.consumer.ConsumerService;
import cn.itstudies.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Farewell is well
 * @date 2019-12-05 09:39
 */
@RestController
public class ProductController {
    @Autowired
    private ConsumerService consumerService;
    @RequestMapping("/test")
    public String test() {
        return consumerService.showMessage();
    }
    @RequestMapping("/test2")
    public String test2(String message) {
        return consumerService.showMessage2(message);
    }
    @RequestMapping("/test3")
    public String showUser(User user) {
        return consumerService.showUser(user);
    }
}
