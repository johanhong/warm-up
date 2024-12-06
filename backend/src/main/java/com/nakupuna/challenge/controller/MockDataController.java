package com.nakupuna.challenge.controller;

import com.nakupuna.challenge.mock.MockDataInitializer;
import com.nakupuna.challenge.model.NodeRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/nodes")
public class MockDataController {

    /**
     * Retrieves mock records for a given nodeId by invoking MockDataInitializer.
     *
     * @param nodeId the identifier of the node
     * @return a list of NodeRecord instances associated with the given nodeId
     */
    @GetMapping("/{nodeId}")
    public ResponseEntity<Map<String, List<NodeRecord>>> getMockRecords(@PathVariable String nodeId) {
        Map<String, List<NodeRecord>> mockRecords = MockDataInitializer.getMockRecords(nodeId);
        if (mockRecords.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(mockRecords);
    }
}