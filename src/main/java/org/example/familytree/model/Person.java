package org.example.familytree.model;

import lombok.Data;

/**
 * Person.
 *
 * @author Aleksei_Bulatov
 */
@Data
public class Person {
    private String firstName;
    private String lastName;
    private String age;
    private Gender gender;
}
