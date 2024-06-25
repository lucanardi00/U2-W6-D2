package lucanardi.u5w2d2.entities.services;

import lucanardi.u5w2d2.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserService {
    private List<User> usersList = new ArrayList<>();

    public List<User> getUsersList() {
        return this.usersList;
    }

    public User saveUser(User body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 10000));
        this.usersList.add(body);
        return body;
    }
}
