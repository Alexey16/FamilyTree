package org.example.familytree.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * TreeNode.
 *
 * @author Aleksei_Bulatov
 */
@Data
@Builder
public class PersonNode extends Person {
    private int id;
    private PersonNode father;
    private PersonNode mother;
    private List<PersonNode> children;
    private PersonNode husband;
    private PersonNode wife;
}
