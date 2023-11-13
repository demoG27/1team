package com.example.greenudemy.gorup;

import com.example.greenudemy.gorup.dto.GroupCreateDto;
import com.example.greenudemy.gorup.dto.GroupResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

    @PostMapping("/create-group")
    public GroupResponseDto createGroup(@RequestBody GroupCreateDto groupCreateDto) {
        return groupService.createGroup(groupCreateDto);
    }

    @PostMapping("/update-group/{id}")
    public GroupResponseDto updateGroup(@PathVariable("id")UUID id, @RequestBody GroupCreateDto groupCreateDto){
        return groupService.updateGroup(id, groupCreateDto);
    }

    @GetMapping("/get-all-group")
    public List<GroupResponseDto> getAllGroup(){
        return groupService.getAllGroup();
    }

    @DeleteMapping("/delete-group/{id}")
    public GroupResponseDto deleteGroup(@PathVariable("id") UUID id){
        return groupService.deleteGroup(id);
    }
}
