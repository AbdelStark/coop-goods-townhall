package org.coopgoods.service.user;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.coopgoods.model.user.User;
import org.coopgoods.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
  @Autowired private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }
}
