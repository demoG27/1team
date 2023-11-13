package com.example.greenudemy.gorup;

import com.example.greenudemy.gorup.dto.GroupCreateDto;
import com.example.greenudemy.gorup.dto.GroupResponseDto;
import com.example.greenudemy.gorup.entity.Group;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GroupService {
    private final ModelMapper modelMapper = new ModelMapper();
    private final GroupRepository groupRepository;

    public GroupResponseDto createGroup(GroupCreateDto groupCreateDto) {

        Group group = new Group(UUID.randomUUID(),
                groupCreateDto.getName(),
                groupCreateDto.getMentorId(),
                groupCreateDto.getStartDate(),
                groupCreateDto.getGroupType(),
                groupCreateDto.getGroupStatus());

        groupRepository.save(group);
        return modelMapper.map(group, GroupResponseDto.class);
    }

    public GroupResponseDto updateGroup(UUID id, GroupCreateDto groupCreateDto) {
        Group group = groupRepository.findById(id).get();
        group.setName(groupCreateDto.getName());
        group.setMentorId(groupCreateDto.getMentorId());
        group.setStartDate(groupCreateDto.getStartDate());
        group.setGroupType(groupCreateDto.getGroupType());
        group.setGroupStatus(groupCreateDto.getGroupStatus());

        groupRepository.save(group);
        return modelMapper.map(group, GroupResponseDto.class);
    }

    public List<GroupResponseDto> getAllGroup() {
        List<Group> all = groupRepository.findAll();
        return all.stream()
                .map(group -> modelMapper.map(group, GroupResponseDto.class))
                .toList();

    }

    public GroupResponseDto deleteGroup(UUID id) {
        Group group = groupRepository.findById(id).get();
        groupRepository.deleteById(id);
        return modelMapper.map(group, GroupResponseDto.class);
    }
}
