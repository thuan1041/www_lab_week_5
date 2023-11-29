package vn.edu.iuh.fit.www_lab_week_5.backend.ids;

import java.io.Serializable;
import java.util.Objects;

public class CandidateSkillIds implements Serializable {
    private long canId;
    private long skillId;

    public CandidateSkillIds() {
    }

    public CandidateSkillIds(long canId, long skillId) {
        this.canId = canId;
        this.skillId = skillId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateSkillIds that = (CandidateSkillIds) o;
        return canId == that.canId && skillId == that.skillId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canId, skillId);
    }

    @Override
    public String toString() {
        return "CandidateSkillIds{" +
                "canId=" + canId +
                ", skillId=" + skillId +
                '}';
    }
}
