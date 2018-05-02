package org.zerock.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;
import org.zerock.service.TxService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {
	
	@Setter(onMethod_={@Autowired})
	private TimeMapper mapper;
	
	@Setter(onMethod_={@Autowired})
	private TxService service;
	
	@Test
	public void testTx() {
		String str = "AOP를 사용할때 서블릿 컨텍스트 설정을 어떻게 구분하였는 지에 따라 문제점이 다양하게 발생한다. 처음부터 스프링을 이해하고";
		service.insertAll(str);
	}

	
	@Test
	public void testTime() {
		log.info(mapper.getTime());
	}
	
	
}