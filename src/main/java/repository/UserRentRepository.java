package repository;

import model.BookEntity;
import model.UserRentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRentRepository extends JpaRepository<UserRentEntity, Integer> {
    public UserRentEntity findAllByCode(String code);
}