package com.zhf.user.repository;

import com.zhf.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select t from User t where name = :name and password=:password")
    User getUserByInfo(String name, String password);

}
