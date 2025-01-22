package com.assignment.Conceptile.dto;

import com.assignment.Conceptile.entity.Node;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class NodeDto {
    private String lable;

    public static Set<NodeDto> mapperDto(Set<Node> nodeSet){
        Set<NodeDto> nodeDtos = new HashSet<>();
        for(Node n : nodeSet){
            NodeDto nodeDto = new NodeDto();
            nodeDto.lable = n.getLable();
            nodeDtos.add(nodeDto);
        }
        return nodeDtos;
    }
}
