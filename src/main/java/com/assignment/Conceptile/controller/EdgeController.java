package com.assignment.Conceptile.controller;

import com.assignment.Conceptile.entity.Edge;
import com.assignment.Conceptile.entity.Flowchart;
import com.assignment.Conceptile.entity.Node;
import com.assignment.Conceptile.service.EdgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flowchars")
public class EdgeController {

    @Autowired
    private EdgeService edgeService;

    @GetMapping("/{id}/edge")
    public ResponseEntity<List<Edge>> getFlowchartEdge(@PathVariable Long id) {
        return  ResponseEntity.ok(edgeService.getFlowchartEdge(id));
    }

    @PutMapping("/{id}/edge")
    public ResponseEntity<Flowchart> updateFlowchartEdge(@PathVariable Long id, @RequestBody Edge edge) {
        return ResponseEntity.ok(edgeService.updateFlowchartEdge(id, edge));
    }
}
