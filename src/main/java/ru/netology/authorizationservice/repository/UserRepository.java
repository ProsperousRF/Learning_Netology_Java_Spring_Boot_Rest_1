package ru.netology.authorizationservice.repository;

import ru.netology.authorizationservice.model.Authorities;

import java.util.List;

/**
 * @author Stanislav Rakitov
 */
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return ...;
    }
}