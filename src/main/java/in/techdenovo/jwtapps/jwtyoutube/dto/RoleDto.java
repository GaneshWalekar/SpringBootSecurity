package in.techdenovo.jwtapps.jwtyoutube.dto;

import in.techdenovo.jwtapps.jwtyoutube.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {
    private String roleName;
    private String roleDesciption;

    public Role getRoleFromDto(){
        Role role = new Role();
        role.setRoleName(roleName);
        role.setRoleDescription(roleDesciption);
        return role;
    }
}
