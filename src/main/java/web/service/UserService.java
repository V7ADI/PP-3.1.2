package web.service;

import javassist.NotFoundException;
import web.model.User;


import java.util.List;

public interface UserService {
    List<User> getListUsers();
    void saveUser(User user);
    User getById(int id);
    void update(User user);
    void delete(int id);
    User getByName(String userName) throws NotFoundException;
    User getByEmail(String email) throws NotFoundException;
}
