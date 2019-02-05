package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name ="users")
public class User {
    @Id
    @Column(updatable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int age;
    @Column
    private String name;
    @Column
    private int ssn;
    @Column
    private String email;

    public User() {

    }

    public User(int age, String name, int ssn, String email) {
        this.age = age;
        this.name = name;
        this.ssn = ssn;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "User {id:" + id + " age:" + age + " name:" + name + " ssn:" + ssn + " email:" + email + "}";
    }
}
