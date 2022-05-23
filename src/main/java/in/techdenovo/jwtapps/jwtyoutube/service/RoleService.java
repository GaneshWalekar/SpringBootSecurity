package in.techdenovo.jwtapps.jwtyoutube.service;

import in.techdenovo.jwtapps.jwtyoutube.dao.RoleDao;
import in.techdenovo.jwtapps.jwtyoutube.dto.RoleDto;
import in.techdenovo.jwtapps.jwtyoutube.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface RoleService {

    public Role createNewRole(RoleDto roleDto);
}
