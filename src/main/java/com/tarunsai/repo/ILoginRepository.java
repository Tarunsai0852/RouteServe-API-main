package com.tarunsai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarunsai.entities.Login;

@Repository
public interface ILoginRepository extends JpaRepository<Login, String> {

}
