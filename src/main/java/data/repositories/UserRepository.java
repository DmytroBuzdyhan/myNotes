package data.repositories;

import data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by dima on 24.03.16.
 */
public interface  UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.city= :city")
    User getUser(@Param("city") String name);
}
