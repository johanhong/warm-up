package com.nakupuna.challenge.mock;

import com.nakupuna.challenge.model.NodeRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockDataInitializer {

    private static final Map<String, List<NodeRecord>> mockRecords = new HashMap<>();

    static {
        // Create mock data with hierarchical relationships
        NodeRecord node1_1 = new NodeRecord(201L, "1-1", "Facet Value 1", "Value C1", "Value C2", "Value C3", null, new ArrayList<>());
        NodeRecord node1_2 = new NodeRecord(202L, "1-1", "Facet Value 2", "Value D1", "Value D2", "Value D3", null, new ArrayList<>());

        NodeRecord node2_1 = new NodeRecord(301L, "1-2", "Facet Value 1", "Value A1", "Value A2", "Value A3", null, new ArrayList<>());
        NodeRecord node2_2 = new NodeRecord(302L, "1-2", "Facet Value 2", "Value B1", "Value B2", "Value B3", null, new ArrayList<>());
        NodeRecord node2_3 = new NodeRecord(303L, "1-2", "Facet Value 3", "Value C1", "Value C2", "Value C3", null, new ArrayList<>());

        mockRecords.put("1-1", List.of(node1_1, node1_2));
        mockRecords.put("1-2", List.of(node2_1, node2_2, node2_3));
    }

    public static Map<String, List<NodeRecord>> getMockRecords(String nodeId) {
        return mockRecords;
    }
}