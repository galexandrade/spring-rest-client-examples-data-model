package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;

import java.util.List;

/**
 * Created by alex.andrade on 17/05/2018.
 */
public interface ApiService {
    List<User> getUsers(Integer limit);
}
