package in.techdenovo.jwtapps.jwtyoutube.service;

import in.techdenovo.jwtapps.jwtyoutube.dao.RoleDao;
import in.techdenovo.jwtapps.jwtyoutube.dto.RoleDto;
import in.techdenovo.jwtapps.jwtyoutube.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleDao roleDao;
    @Override
    public Role createNewRole(RoleDto roleDto) {

        Role newRole = new Role();
        newRole = roleDto.getRoleFromDto();

        return roleDao.save(newRole);
    }
}
