package vn.edu.iuh.fit.www_lab_week_5.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_lab_week_5.backend.models.Skill;

public interface SkillRepository extends JpaRepository<Skill,Long> {
}
