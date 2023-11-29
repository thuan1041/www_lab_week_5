package vn.edu.iuh.fit.www_lab_week_5.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "com_id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", columnDefinition = "varchar(255)")
    private String name;
    @Column(name = "about", columnDefinition = "varchar(2000)")
    private String about;
    @Column(name = "phone", columnDefinition = "varchar(255)")
    private String phone;
    @Column(name = "web_utrl", columnDefinition = "varchar(255)")
    private String webURL;
    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;
//    private List<Job> jobs;
    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;

    public Company() {
    }

    public Company(long id, String name, String about, String phone, String webURL, String email) {
        this.id = id;
        this.name = name;
        this.about = about;
        this.phone = phone;
        this.webURL = webURL;
        this.email = email;
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", phone='" + phone + '\'' +
                ", webURL='" + webURL + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
