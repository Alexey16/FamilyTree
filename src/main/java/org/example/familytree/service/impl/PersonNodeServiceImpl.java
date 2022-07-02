package org.example.familytree.service.impl;

import org.example.familytree.model.PersonNode;
import org.example.familytree.repositories.PersonNodeRepository;
import org.example.familytree.service.PersonNodeService;
import org.example.familytree.util.IdentifierUtil;

/**
 * Implementation of {@link PersonNodeService}.
 *
 * @author Aleksei_Bulatov
 */
public class PersonNodeServiceImpl implements PersonNodeService {

    PersonNodeRepository personNodeRepository;

    @Override
    public PersonNode addPersonNode(PersonNode personNode) {
        personNode.setId(IdentifierUtil.getNextId());
        return personNodeRepository.addPersonNode(personNode);
    }

    @Override
    public PersonNode getPersonNodeById(Integer id) {
        return personNodeRepository.getPersonNode(id);
    }

}
