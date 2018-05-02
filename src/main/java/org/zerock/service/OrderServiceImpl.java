package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.OrderDetailVO;
import org.zerock.domain.OrderVO;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;

@Service
public class OrderServiceImpl implements OrderService {

	@Setter(onMethod_={@Autowired})
	private TimeMapper mapper;
	
	@Transactional
	@Override
	public void register(OrderVO order, List<OrderDetailVO> details) {
		
		mapper.insertOrder(order);
		details.forEach(detail->mapper.insertDetail(detail));

	}

}
