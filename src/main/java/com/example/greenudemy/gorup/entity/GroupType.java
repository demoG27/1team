package com.example.greenudemy.gorup.entity;

import jakarta.persistence.Table;

@Table(name = "group_type")
public enum GroupType {
    JAVA,
    PYTHON,
}
