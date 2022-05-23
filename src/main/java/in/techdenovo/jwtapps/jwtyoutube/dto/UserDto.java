package in.techdenovo.jwtapps.jwtyoutube.dto;

import in.techdenovo.jwtapps.jwtyoutube.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public User getUserFromDto(){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }
}
