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

    public Candidate() {
    }

    public Candidate(long id, String phone, LocalDate dob, String email, String fullName) {
        this.id = id;
        this.phone = phone;
        this.dob = dob;
        this.email = email;
        this.fullName = fullName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
