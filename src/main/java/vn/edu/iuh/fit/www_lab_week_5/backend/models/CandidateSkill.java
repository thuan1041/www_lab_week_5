package vn.edu.iuh.fit.www_lab_week_5.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.www_lab_week_5.backend.ids.CandidateSkillIds;

import java.util.Objects;

@Entity
@Table(name = "candidate_skill")
@IdClass(CandidateSkillIds.class)
public class CandidateSkill {
    @Id
    @ManyToOne()
    @JoinColumn(name = "can_id")
    private Candidate canId;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skillId;

    public CandidateSkill(Candidate canId, Skill skillId) {
        this.canId = canId;
        this.skillId = skillId;
    }

    public CandidateSkill() {
    }

    public Candidate getCanId() {
        return canId;
    }

    public void setCanId(Candidate canId) {
        this.canId = canId;
    }

    public Skill getSkillId() {
        return skillId;
    }

    public void setSkillId(Skill skillId) {
        this.skillId = skillId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateSkill that = (CandidateSkill) o;
        return Objects.equals(canId, that.canId) && Objects.equals(skillId, that.skillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canId, skillId);
    }

    @Override
    public String toString() {
        return "CandidateSkill{" +
                "canId=" + canId +
                ", skillId=" + skillId +
                '}';
    }
}
