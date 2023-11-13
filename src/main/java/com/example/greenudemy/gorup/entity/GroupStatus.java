package com.example.greenudemy.gorup.entity;

import jakarta.persistence.Table;

@Table(name = "group_status")
public enum GroupStatus {
    CANCELED,
    IN_PROGRESS,
    FINISHED,
    PAUSED
}
