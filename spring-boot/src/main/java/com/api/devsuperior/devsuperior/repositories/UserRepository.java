package com.api.devsuperior.devsuperior.repositories;
import com.api.devsuperior.devsuperior.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
