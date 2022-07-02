package org.example.familytree.repositories;

import org.example.familytree.model.PersonNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Repository for PersonNode objects.
 *
 * @author Aleksei_Bulatov
 */
public class PersonNodeRepository {

    Map<Integer, PersonNode> familyRepository = new HashMap<>();

    public PersonNode addPersonNode(PersonNode personNode) {
        familyRepository.put(personNode.getId(), personNode);
        return personNode;
    }

    public PersonNode getPersonNode(Integer id) {
        return familyRepository.get(id);
    }
}
