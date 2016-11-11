package com.team980.thunderscout.signup_form.data;

import java.io.Serializable;

/**
 * Implements data for one mentor
 */
public class MentorData implements Serializable, Cloneable { //TODO why do driverSkill, comments have teleop in the name

    private String dataSource;
    public static final String SOURCE_LOCAL_DEVICE = "This device";

    private String name;
    private String email;
    private String phoneNumber;
    private String city;

    public MentorData() {

    }

    /**
     * Copy constructor
     */
    public MentorData(MentorData other) {
        setDataSource(other.getDataSource());

        setName(other.getName());
        setEmail(other.getEmail());
        setPhoneNumber(other.getPhoneNumber());
        setCity(other.getCity());
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
