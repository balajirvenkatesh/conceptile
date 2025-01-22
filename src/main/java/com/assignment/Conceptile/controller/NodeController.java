package com.assignment.Conceptile.controller;

import com.assignment.Conceptile.entity.Flowchart;
import com.assignment.Conceptile.entity.Node;
import com.assignment.Conceptile.service.FlowChartService;
import com.assignment.Conceptile.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flowcharts")
public class NodeController {

    @Autowired
    private NodeService nodeService;

    @GetMapping("/{id}/node")
    public ResponseEntity<List<Node>> getFlowchartNode(@PathVariable Long id) {
        return ResponseEntity.ok(nodeService.getFlowchartNode(id));
    }

    @PutMapping("/{id}/node")
    public ResponseEntity<Flowchart> updateFlowchartNode(@PathVariable Long id, @RequestBody Node node) {
        return ResponseEntity.ok(nodeService.updateFlowchartNode(id, node));
    }
}
