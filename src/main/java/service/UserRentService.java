package service;

import model.BookEntity;
import model.UserRentEntity;

import java.util.List;

public interface UserRentService {
    public List<UserRentEntity> findAll();

    public UserRentEntity findById(Integer id);

    public void save(UserRentEntity userRentEntity);

    public void  delete(Integer id);

    public UserRentEntity findAllByCode(String code);
}