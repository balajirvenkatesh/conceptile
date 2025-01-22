package com.assignment.Conceptile.service;

import com.assignment.Conceptile.entity.Edge;
import com.assignment.Conceptile.entity.Flowchart;
import com.assignment.Conceptile.repository.EdgeRepository;
import com.assignment.Conceptile.repository.FlowChartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdgeService {

    @Autowired
    private EdgeRepository edgeRepository;

    @Autowired
    private FlowChartRepository flowChartRepository;

    public List<Edge> getFlowchartEdge(Long id) {
        Optional<Flowchart> optionalFlowchart = flowChartRepository.findById(id);
        if(optionalFlowchart.isPresent()){
            Flowchart flowchart = optionalFlowchart.get();
            return edgeRepository.findByFlowchartId(flowchart.getId());
        }
        return null;
    }

    public Flowchart updateFlowchartEdge(Long id, Edge edge) {
        Optional<Flowchart> optionalFlowchart = flowChartRepository.findById(id);
        if(optionalFlowchart.isPresent()){
            Flowchart savedFlowchart = optionalFlowchart.get();
            edge.setFlowchart(savedFlowchart);
            edgeRepository.save(edge);
            return savedFlowchart;
        }
        return null;
    }
}
