package com.javainuse.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.springbootsecurity.model.DAOUser;

/**
 * @author  Mohammad Saeid Tavana
 */
@Repository
public interface UserRepository extends JpaRepository<DAOUser, Long> {
	DAOUser findByUsername(String username);

}