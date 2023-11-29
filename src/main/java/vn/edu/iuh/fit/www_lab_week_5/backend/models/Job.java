package vn.edu.iuh.fit.www_lab_week_5.backend.models;

import jakarta.persistence.*;

@Table(name = "job")
@Entity()
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;
    @Column(name = "job_name", columnDefinition = "varchar(255)")
    private String name;
    @ManyToOne
    @JoinColumn(name = "com_id")
    private Company company;
    @Column(name = "job_desc", columnDefinition = "varchar(2000)")
    private String description;

    public Job() {
    }

    public Job(long id, String name, Company company, String description) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
