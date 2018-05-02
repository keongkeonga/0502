package org.zerock.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.zerock.service.CalcService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CalcServiceTests {
	
	@Setter(onMethod_={@Autowired})
	private CalcService service;
	
	@Test
	public void testAdd1() {
		log.info(service.getClass().getName());
		log.info(service.add2("123", "456"));
		log.info(service.add3("123", "456"));
		log.info(service.add4("123", "456"));
	}

}
