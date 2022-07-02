package org.example.familytree.service;

import org.example.familytree.model.PersonNode;

/**
 * PersonNodeService.
 *
 * @author Aleksei_Bulatov
 */
public interface PersonNodeService {

    PersonNode addPersonNode(PersonNode personNode);

    PersonNode getPersonNodeById(Integer id);

}
