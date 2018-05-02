package org.zerock.service;

import java.util.List;

import org.zerock.domain.OrderDetailVO;
import org.zerock.domain.OrderVO;

public interface OrderService {

	
	public void register(OrderVO order, List<OrderDetailVO> details);
	
}
