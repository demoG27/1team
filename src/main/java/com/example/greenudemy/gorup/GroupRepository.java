package com.example.greenudemy.gorup;

import com.example.greenudemy.gorup.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface GroupRepository extends JpaRepository<Group, UUID> {
}
