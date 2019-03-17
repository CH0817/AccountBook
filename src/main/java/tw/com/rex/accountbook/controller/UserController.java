package tw.com.rex.accountbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tw.com.rex.accountbook.model.User;
import tw.com.rex.accountbook.model.response.OperateResponse;
import tw.com.rex.accountbook.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/page/register")
    public String toRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) throws Exception {
        OperateResponse<User> response = new OperateResponse<>();
        user = userService.register(user);
        response.setObject(user);
        return "forward:/main";
    }

}
