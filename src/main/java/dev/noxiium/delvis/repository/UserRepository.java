package dev.noxiium.delvis.repository;

import dev.noxiium.delvis.entity.GroupEntity;
import dev.noxiium.delvis.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findUserById(Integer id);
}
