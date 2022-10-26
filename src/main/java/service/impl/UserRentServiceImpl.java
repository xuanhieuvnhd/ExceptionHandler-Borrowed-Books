package service.impl;

import model.BookEntity;
import model.UserRentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRentRepository;
import service.UserRentService;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserRentServiceImpl implements UserRentService {

    @Autowired
    private UserRentRepository userRentRepository;

    @Override
    public List<UserRentEntity> findAll() {
        return userRentRepository.findAll();
    }

    @Override
    public UserRentEntity findById(Integer id) {
        return userRentRepository.findOne(id);
    }

    @Override
    public void save(UserRentEntity userRentEntity) {
        userRentRepository.save(userRentEntity);
    }

    @Override
    public void delete(Integer id) {
        userRentRepository.delete(id);
    }

    @Override
    public UserRentEntity findAllByCode(String code) {
        return userRentRepository.findAllByCode(code);
    }
}