package in.techdenovo.jwtapps.jwtyoutube.controller;

import in.techdenovo.jwtapps.jwtyoutube.dto.UserDto;
import in.techdenovo.jwtapps.jwtyoutube.entity.User;
import in.techdenovo.jwtapps.jwtyoutube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody UserDto userDto){
        return userService.registerNewUser(userDto);
    }

    @GetMapping({"/forAdmin"})
    public String forAdmin(){
    return "This url is only accessible to admin";
    }

    @GetMapping({"/forUsers"})
    public String forUsers(){
        return "This url is only accessible to admin";
    }

}
