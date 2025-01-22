package com.assignment.Conceptile.repository;

import com.assignment.Conceptile.entity.Edge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EdgeRepository extends JpaRepository<Edge, Long> {
    List<Edge> findByFlowchartId(Long id);
}
