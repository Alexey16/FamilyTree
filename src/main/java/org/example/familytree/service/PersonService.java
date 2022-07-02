package org.example.familytree.service;

import org.example.familytree.model.Person;
import org.example.familytree.model.PersonNode;

import java.util.List;

/**
 * Person node service.
 *
 * @author Aleksei_Bulatov
 */
public interface PersonService {

    List<Person> getAllChildrenByPersonNodeId(Integer id);

    List<Person> getAllChildrenByPersonNode(PersonNode personNode);

    List<Person> getFamily(Integer id);

}
