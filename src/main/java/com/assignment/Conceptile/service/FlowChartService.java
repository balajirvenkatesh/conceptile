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
public class FlowChartService {


    @Autowired
    private NodeRepository nodeRepository;

    @Autowired
    private FlowChartRepository flowChartRepository;

    public Flowchart createFlowchart(Flowchart flowchart) {
        return flowChartRepository.save(flowchart);
    }

    public Optional<Flowchart> getFlowchart(Long id) {
        return flowChartRepository.findById(id);
    }

    public Flowchart updateFlowchart(Flowchart flowchart) {
        return flowChartRepository.save(flowchart);
    }

    public Flowchart deleteFlowchart(Long id) {
        Optional<Flowchart> optionalFlowchart = getFlowchart(id);
        if(optionalFlowchart.isPresent()){
            flowChartRepository.deleteById(id);
            return optionalFlowchart.get();
        }
        return null;
    }


}
