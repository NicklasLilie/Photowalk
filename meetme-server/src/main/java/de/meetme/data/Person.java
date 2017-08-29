package de.meetme.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
// create table person ( id int, name varchar(256), firstname varchar(256), email varchar(256))
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String firstName;
    private String email;

    public Person() {
        // Needed by Jackson deserialization
    }

    public Person(long id, String firstName, String name, String email) {
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.email = email;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public String getEmail() {
        return email;
    }
}