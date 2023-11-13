package com.example.greenudemy.gorup.dto;

import com.example.greenudemy.gorup.entity.GroupStatus;
import com.example.greenudemy.gorup.entity.GroupType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GroupCreateDto {
    private UUID id;
    private String name;
    private UUID mentorId;
    private Date startDate;
    private GroupType groupType;
    private GroupStatus groupStatus;
}
