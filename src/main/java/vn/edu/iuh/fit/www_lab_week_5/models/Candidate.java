package vn.edu.iuh.fit.www_lab_week_5.models;

import java.time.LocalDate;
import java.util.List;

public class Candidate {
    private long id;
    private String phone;
    private LocalDate dob;
    private String email;
    private String fullName;
    private Address address;
    private List<Candidate> candidates;
    private List<Exception> exceptions;
}
