package org.example.familytree.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.familytree.mapper.PersonNodeToPersonMapper;
import org.example.familytree.model.Person;
import org.example.familytree.model.PersonNode;
import org.example.familytree.service.PersonNodeService;
import org.example.familytree.service.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Implementation of {@link PersonService}.
 *
 * @author Aleksei_Bulatov
 */
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private PersonNodeService personNodeService;
    private PersonNodeToPersonMapper mapper;

    @Override
    public List<Person> getAllChildrenByPersonNodeId(Integer id) {
        return getAllChildrenByPersonNode(personNodeService.getPersonNodeById(id));
    }

    @Override
    public List<Person> getAllChildrenByPersonNode(PersonNode personNode) {
        return personNode.getChildren().stream()
                .map(childrenNode -> mapper.mapPersonNodeToPerson(childrenNode, new Person()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> getFamily(Integer id) {
        List<Person> family = new ArrayList<>();
        PersonNode personNode = personNodeService.getPersonNodeById(id);

        Optional.ofNullable(personNode.getFather())
                .ifPresent(father -> family.add(mapper.mapPersonNodeToPerson(father, new Person())));
        Optional.ofNullable(personNode.getMother())
                .ifPresent(mother -> family.add(mapper.mapPersonNodeToPerson(mother, new Person())));
        Optional.ofNullable(personNode.getChildren())
                .ifPresent(children -> family.addAll(this.getAllChildrenByPersonNode(personNode)));
        Optional.ofNullable(personNode.getHusband())
                .ifPresent(husband -> family.add(mapper.mapPersonNodeToPerson(husband, new Person())));
        Optional.ofNullable(personNode.getWife())
                .ifPresent(wife -> family.add(mapper.mapPersonNodeToPerson(wife, new Person())));

        return family;
    }

}
