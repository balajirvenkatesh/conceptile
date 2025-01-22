package com.assignment.Conceptile.repository;

import com.assignment.Conceptile.entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NodeRepository extends JpaRepository<Node, Long> {
    List<Node> findByFlowchartId(Long id);
}
