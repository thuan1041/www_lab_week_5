package vn.edu.iuh.fit.www_lab_week_5.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "candidate")
@Entity
public class Candidate {
    @Id
    @Column(name = "can_id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "phone", columnDefinition = "varchar(15)")
    private String phone;
    @Column(name = "dob", columnDefinition = "date")
    private LocalDate dob;
    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;
    @Column(name = "full_name", columnDefinition = "varchar(255)")
    private String fullName;
    @ManyToOne
    @JoinColumn(name = "add_id")
    private Address address;

}
