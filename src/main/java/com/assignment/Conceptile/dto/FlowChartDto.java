package com.assignment.Conceptile.dto;

import com.assignment.Conceptile.entity.Edge;
import com.assignment.Conceptile.entity.Flowchart;
import com.assignment.Conceptile.entity.Node;
import lombok.Data;

import java.util.Set;

@Data
public class FlowChartDto {
    private String name;
    private Set<NodeDto> nodes;
    private Set<EdgeDto> edges;
}
