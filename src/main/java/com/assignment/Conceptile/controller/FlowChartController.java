package com.assignment.Conceptile.controller;

import com.assignment.Conceptile.entity.Flowchart;
import com.assignment.Conceptile.entity.Node;
import com.assignment.Conceptile.service.FlowChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/flowcharts")
public class FlowChartController {

    @Autowired
    private FlowChartService flowChartService;

    @PostMapping
    public ResponseEntity<Flowchart> createFlowChart(@RequestBody Flowchart flowchart){
        return ResponseEntity.ok(flowChartService.createFlowchart(flowchart));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Flowchart>> getFlowchart(@PathVariable Long id) {
        return ResponseEntity.ok(flowChartService.getFlowchart(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Flowchart> updateFlowchart(@PathVariable Long id, @RequestBody Flowchart flowchart) {
        flowchart.setId(id);
        return ResponseEntity.ok(flowChartService.updateFlowchart(flowchart));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFlowchart(@PathVariable Long id) {
        Flowchart flowchart = flowChartService.deleteFlowchart(id);
        if(flowchart == null){
            return ResponseEntity.ok("Id not found");
        }
        return ResponseEntity.noContent().build();
    }
}
