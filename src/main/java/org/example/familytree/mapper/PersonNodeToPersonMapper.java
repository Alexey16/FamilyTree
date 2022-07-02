package org.example.familytree.mapper;

import org.example.familytree.model.Person;
import org.example.familytree.model.PersonNode;

/**
 * PersonNode to Person mapper.
 *
 * @author Aleksei_Bulatov
 */
public class PersonNodeToPersonMapper {

    public Person mapPersonNodeToPerson(PersonNode from, Person to) {
        to.setFirstName(from.getFirstName());
        to.setLastName(from.getLastName());
        to.setAge(from.getAge());
        to.setGender(from.getGender());
        return to;
    }

    public Person mapPersonToPersonNode(Person from, PersonNode to) {
        to.setFirstName(from.getFirstName());
        to.setLastName(from.getLastName());
        to.setAge(from.getAge());
        to.setGender(from.getGender());
        return to;
    }

}
