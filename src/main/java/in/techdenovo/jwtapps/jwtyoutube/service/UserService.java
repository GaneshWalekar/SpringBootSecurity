package in.techdenovo.jwtapps.jwtyoutube.service;

import in.techdenovo.jwtapps.jwtyoutube.dao.UserDao;
import in.techdenovo.jwtapps.jwtyoutube.dto.UserDto;
import in.techdenovo.jwtapps.jwtyoutube.entity.Role;
import in.techdenovo.jwtapps.jwtyoutube.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {
    public User registerNewUser(UserDto userDto);


}
