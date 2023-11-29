package vn.edu.iuh.fit.www_lab_week_5.backend.models;


import jakarta.persistence.*;
import vn.edu.iuh.fit.www_lab_week_5.backend.ids.JobSkillIds;

@Entity()
@Table(name = "job_skill")
@IdClass(JobSkillIds.class)
public class JobSkill  {
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job id;
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skillId;
    @Column(name = "skill_level", columnDefinition = "tinyint(4)")
    private int skillLevel;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfos;

    public JobSkill() {
    }

    public JobSkill(Job id, Skill skillId, int skillLevel, String moreInfos) {
        this.id = id;
        this.skillId = skillId;
        this.skillLevel = skillLevel;
        this.moreInfos = moreInfos;
    }

    public Job getId() {
        return id;
    }

    public void setId(Job id) {
        this.id = id;
    }

    public Skill getSkillId() {
        return skillId;
    }

    public void setSkillId(Skill skillId) {
        this.skillId = skillId;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getMoreInfos() {
        return moreInfos;
    }

    public void setMoreInfos(String moreInfos) {
        this.moreInfos = moreInfos;
    }
}
