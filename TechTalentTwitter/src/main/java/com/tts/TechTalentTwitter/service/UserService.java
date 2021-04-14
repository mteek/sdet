package com.tts.TechTalentTwitter.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tts.TechTalentTwitter.model.Role;
import com.tts.TechTalentTwitter.model.User;
import com.tts.TechTalentTwitter.repository.RoleRepository;
import com.tts.TechTalentTwitter.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    //bcrypt is a library that helps
    //us to encrypt passwords
    //it's illegal to have passwords
    //in plain text
    //in databases 
    //because dbs can be hacked
    
    @Autowired
    public UserService(UserRepository userRepository, 
                       RoleRepository roleRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    
    //this constructor takes in all three of 
    //our imports as args
    //it means that the UserService
    //is equal to whatever
    //is passed in 

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
        
    public List<User> findAll(){
        return (List<User>) userRepository.findAll();
    }
        
    public void save(User user) {
        userRepository.save(user);
    }

    public User saveNewUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        return userRepository.save(user);
    }
    //method to save a new user ^^^
    
    
    public User getLoggedInUser() {
        String loggedInUsername = SecurityContextHolder.
          getContext().getAuthentication().getName();
        
        return findByUsername(loggedInUsername);
    }

	//public User getSignedUpUser () {
	//	String signedUpUser = SecurityContextHolder.
	//			getContext().getAuthentication().getName();
	//	return findByUsername(signedUpUser);
	//}
}

