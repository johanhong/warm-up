package com.nakupuna.challenge.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY) // Exclude null or empty fields in JSON response
public class NodeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nodeId; // Identifier for the node (e.g., "1-1")
    private String valueType; // Type or category of the value
    private String column1; // Column 1 data
    private String column2; // Column 2 data
    private String column3; // Column 3 data

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private NodeRecord parent; // Parent node (for hierarchical relationships)

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<NodeRecord> children; // Child nodes
}