package nguyenthanhliem.demo.springdatajpa;

import nguyenthanhliem.demo.springdatajpa.entity.User;
import nguyenthanhliem.demo.springdatajpa.repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void addUser() {
        User user = new User();
        user.setUserName("Nguyen Thanh Liem");
        System.out.println("Add User: " + userRepository.save(user));
    }

    @Test
    public void getUsers() {
        System.out.println("Get Users: " + userRepository.findAll());
    }

    @Test
    public void updateUser() {
        User user = userRepository.getById(1);
        System.out.println("Update User: " + userRepository.save(user));
    }

    @Test
    public void deleteUser() {
        try {
            userRepository.deleteById(1);
            System.out.println("Delete User: True");
        } catch (Exception e) {
            System.out.println("Delete User: False");
        }
    }

}
