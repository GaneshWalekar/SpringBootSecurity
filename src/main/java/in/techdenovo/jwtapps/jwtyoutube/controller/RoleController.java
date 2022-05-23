package in.techdenovo.jwtapps.jwtyoutube.controller;

import in.techdenovo.jwtapps.jwtyoutube.dto.RoleDto;
import in.techdenovo.jwtapps.jwtyoutube.entity.Role;
import in.techdenovo.jwtapps.jwtyoutube.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody RoleDto roleDto){

        return roleService.createNewRole(roleDto);
    }
}
