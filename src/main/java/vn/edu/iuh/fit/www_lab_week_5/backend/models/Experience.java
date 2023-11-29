package vn.edu.iuh.fit.www_lab_week_5.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Table(name = "experience")
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;
    @Column(name = "to_date")
    private LocalDate toDate;
    @Column(name = "from_date")
    private LocalDate fromDate;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "role")
    private String role;
    @Column(name = "work_desc")
    private String workDescription;
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

}
