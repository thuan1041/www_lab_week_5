package vn.edu.iuh.fit.www_lab_week_5.backend.models;

import jakarta.persistence.*;

@Table(name = "skill")
@Entity()
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long skillId;
    @Column(name = "skill_type", columnDefinition = "tinyint(4)")
    private String skillType;
    @Column(name = "skill_name", columnDefinition = "varchar(150)")
    private String skillName;
    @Column(name = "skill_desc", columnDefinition = "varchar(300)")
    private String skillDescription;

    public Skill() {
    }

    public long getSkillId() {
        return skillId;
    }

    public void setSkillId(long skillId) {
        this.skillId = skillId;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public Skill(long skillId, String skillType, String skillName, String skillDescription) {
        this.skillId = skillId;
        this.skillType = skillType;
        this.skillName = skillName;
        this.skillDescription = skillDescription;
    }
}
