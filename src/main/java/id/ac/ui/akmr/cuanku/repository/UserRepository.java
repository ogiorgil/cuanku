package id.ac.ui.akmr.cuanku.repository;

import id.ac.ui.akmr.cuanku.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
