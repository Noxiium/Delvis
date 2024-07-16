package dev.noxiium.delvis.controller;

import dev.noxiium.delvis.DTO.CreateNewGroupRequestDTO;
import dev.noxiium.delvis.DTO.GroupDTO;
import dev.noxiium.delvis.service.GroupService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groups/")
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewGroup(@RequestBody CreateNewGroupRequestDTO newGroupRequest){
        System.out.println("CreateGroup");
        groupService.createGroup(newGroupRequest);
    }
}
