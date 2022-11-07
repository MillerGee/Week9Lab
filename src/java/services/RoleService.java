
package services;

import dataaccess.RoleDB;
import dataaccess.UserDB;
import java.util.List;
import models.Role;
import models.User;


public class RoleService {

    public int getRoleID(String roleName) {
        if (roleName.equals("system admin")) {
            return 1;
        } else {
            return 2;
        }
    }
    
    public List<Role> getAllRole() throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAllRole();
        return roles;
    }
    
}
