package nguyenthanhliem.demo.springdatajpa.repo;

import nguyenthanhliem.demo.springdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
