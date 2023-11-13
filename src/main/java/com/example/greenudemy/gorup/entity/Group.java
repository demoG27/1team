package com.example.greenudemy.gorup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "group")
public class Group {
    @Id
    private UUID id;
    private String name;
    private UUID mentorId;
    private Date startDate;
    @Enumerated(EnumType.STRING)
    private GroupType groupType;
    @Enumerated(EnumType.STRING)
    private GroupStatus groupStatus;
}
