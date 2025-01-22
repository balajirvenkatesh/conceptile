package com.assignment.Conceptile;

import com.assignment.Conceptile.entity.Flowchart;
import com.assignment.Conceptile.repository.FlowChartRepository;
import com.assignment.Conceptile.service.FlowChartService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class ConceptileApplicationTests {

	@Mock
	private FlowChartRepository flowchartRepo;

	@InjectMocks
	private FlowChartService flowchartService;

	@Test
	public void testCreateFlowchart() {
		Flowchart flowchart = new Flowchart();
		flowchart.setName("Test Chart");
		when(flowchartRepo.save(any())).thenReturn(flowchart);

		Flowchart created = flowchartService.createFlowchart(flowchart);
		assertEquals("Test Chart", created.getName());
	}

}
