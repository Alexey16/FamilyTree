package org.example.familytree.model;

/**
 * Gender.
 *
 * @author Aleksei_Bulatov
 */
public enum Gender {
    MALE("мужик"),
    FEMALE("женский"),
    OTHER("не определён");

    private String value;

    Gender(String value) {
        this.value = value;
    }
}
