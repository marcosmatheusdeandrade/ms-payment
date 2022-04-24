package br.com.mma.services;

import br.com.mma.entities.User;
import br.com.mma.feignclients.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email) {
        User user = userFeignClient.findByEmail(email).getBody();
        if (user == null) {
            throw new IllegalArgumentException("Email não encontrado");
        }
        return user;
    }
}
