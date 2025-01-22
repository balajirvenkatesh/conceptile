package com.assignment.Conceptile.service;

import com.assignment.Conceptile.entity.Flowchart;
import com.assignment.Conceptile.entity.Node;
import com.assignment.Conceptile.repository.FlowChartRepository;
import com.assignment.Conceptile.repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NodeService {
    @Autowired
    private NodeRepository nodeRepository;

    @Autowired
    private FlowChartRepository flowChartRepository;


    public List<Node> getFlowchartNode(Long id) {
        Optional<Flowchart> optionalFlowchart = flowChartRepository.findById(id);
        if(optionalFlowchart.isPresent()){
            Flowchart flowchart = optionalFlowchart.get();
            return nodeRepository.findByFlowchartId(flowchart.getId());
        }
        return null;
    }

    public Flowchart updateFlowchartNode(Long id, Node node) {
        Optional<Flowchart> optionalFlowchart = flowChartRepository.findById(id);
        if(optionalFlowchart.isPresent()){
            Flowchart savedFlowchart = optionalFlowchart.get();
            node.setFlowchart(savedFlowchart);
            nodeRepository.save(node);
            return savedFlowchart;
        }
        return null;
    }
}
