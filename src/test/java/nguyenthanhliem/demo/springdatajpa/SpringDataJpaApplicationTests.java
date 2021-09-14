package nguyenthanhliem.demo.springdatajpa;

import nguyenthanhliem.demo.springdatajpa.repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void getUsersByNativeQuery(){
        System.out.println("Get Users By Native Query: " + userRepository.getUsers());
    }
}
