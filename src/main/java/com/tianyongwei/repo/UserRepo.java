package com.tianyongwei.repo;

import com.tianyongwei.entity.core.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
