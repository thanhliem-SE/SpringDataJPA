package nguyenthanhliem.demo.springdatajpa.repo;

import nguyenthanhliem.demo.springdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select * from user", nativeQuery = true)
    public List<User> getUsers();
}
