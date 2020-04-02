/*
package com.elasticsearch.service;

import com.elasticsearch.dao.UserRepository;
import com.elasticsearch.entity.User;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {

        return userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public List<User> findByName(String name) {
        List<User> list = new ArrayList<>();
        MatchQueryBuilder matchQueryBuilder = new MatchQueryBuilder("userName", name);
        Iterable<User> iterable = userRepository.search(matchQueryBuilder);
        iterable.forEach(e -> list.add(e));
        return list;
    }

    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        Iterable<User> iterable = userRepository.findAll();
        iterable.forEach(e -> list.add(e));
        return list;
    }

}
*/
