package dev.noxiium.delvis.service;

import dev.noxiium.delvis.DTO.CreateNewGroupRequestDTO;
import dev.noxiium.delvis.DTO.GroupDTO;
import dev.noxiium.delvis.entity.GroupEntity;
import dev.noxiium.delvis.entity.UserEntity;
import dev.noxiium.delvis.repository.GroupRepository;
import dev.noxiium.delvis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    private final GroupRepository groupRepository;
    private final UserRepository userRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository, UserRepository userRepository) {
        this.groupRepository = groupRepository;
        this.userRepository = userRepository;
    }

    public void createGroup(CreateNewGroupRequestDTO newGroupRequestDTO) {
        GroupEntity newGroupEntity = new GroupEntity();
        UserEntity groupCreator = userRepository.findUserById(newGroupRequestDTO.getCreatedByID());
        newGroupEntity.setCreatedBy(groupCreator);
        newGroupEntity.setGroupName(newGroupRequestDTO.getGroupName());
        newGroupEntity.setDescription(newGroupRequestDTO.getDescription());
        newGroupEntity.setCreatedAt(newGroupRequestDTO.getCreatedAt());


        newGroupEntity = groupRepository.save(newGroupEntity);
        //TODO Call function to save to groupToUser ta

    }
}
