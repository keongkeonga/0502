package org.zerock.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.OrderDetailVO;
import org.zerock.domain.OrderVO;
import org.zerock.service.OrderService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class OrderServiceTests {

	@Setter(onMethod_= {@Autowired})
	private OrderService service;
	
	@Test
	public void testInsert() {
		
		OrderVO order = new OrderVO();
		order.setOwner("TestUser");
		List<OrderDetailVO> list = new ArrayList<>();
		for(int i=0; i<3; i++) {
			OrderDetailVO vo = new OrderDetailVO();
			list.add(vo);
		}
		service.register(order, list);
	}
}
