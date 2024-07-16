package dev.noxiium.delvis.repository;

import dev.noxiium.delvis.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupEntity, Integer> {
    GroupEntity findGroupById(Integer id);

}
