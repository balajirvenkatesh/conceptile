package com.assignment.Conceptile.repository;


import com.assignment.Conceptile.entity.Flowchart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowChartRepository extends JpaRepository<Flowchart, Long> {
}
