package com.example.HRplatform.repository;

import com.example.HRplatform.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface SkillRepository extends JpaRepository<Skill, UUID> {

    Skill save(Skill skill);
}
