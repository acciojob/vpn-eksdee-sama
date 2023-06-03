package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ServiceProviders")
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn
    private com.driver.model.Admin admin;

    @OneToMany(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
    private List<com.driver.model.Country> countryList = new ArrayList<>();

    @ManyToMany(mappedBy = "serviceProviderList",cascade = CascadeType.ALL)
    private List<User> users;

    @OneToMany(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
    private List<com.driver.model.Connection> connectionList = new ArrayList<>();

    public ServiceProvider() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.driver.model.Admin getAdmin() {
        return admin;
    }

    public void setAdmin(com.driver.model.Admin admin) {
        this.admin = admin;
    }

    public List<com.driver.model.Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<com.driver.model.Country> countryList) {
        this.countryList = countryList;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<com.driver.model.Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<com.driver.model.Connection> connectionList) {
        this.connectionList = connectionList;
    }
}
