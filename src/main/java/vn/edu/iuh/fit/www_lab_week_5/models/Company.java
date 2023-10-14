package vn.edu.iuh.fit.www_lab_week_5.models;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.List;

public class Company {
    private long id;
    private String name;
    private String about;
    private Address address;
    private String phone;
    private String webURL;
    private List<Job> jobs;
    private String email;
}
