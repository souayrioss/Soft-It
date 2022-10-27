package Services;

import beans.Role;
import java.util.ArrayList;

public interface RolesService {
    Role add(Role role);
    Role find(long id);
    Role findByName(String roleName);
    ArrayList<Role> getAll();
    Role update(Role role);
    boolean delete(long id);
}