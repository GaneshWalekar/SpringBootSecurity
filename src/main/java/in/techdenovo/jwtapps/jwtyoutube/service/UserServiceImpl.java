package in.techdenovo.jwtapps.jwtyoutube.service;

import in.techdenovo.jwtapps.jwtyoutube.dao.UserDao;
import in.techdenovo.jwtapps.jwtyoutube.dto.UserDto;
import in.techdenovo.jwtapps.jwtyoutube.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleService roleService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public User registerNewUser(UserDto userDto) {
        User newUser = new User();
        newUser = userDto.getUserFromDto();
        newUser.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));

        return userDao.save(newUser);

    }
}
