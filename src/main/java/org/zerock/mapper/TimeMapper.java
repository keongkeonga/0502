package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.OrderDetailVO;
import org.zerock.domain.OrderVO;

public interface TimeMapper {
	
	public String getTime();
	
	public int insertT1(String str);
	
	public int insertT2(String str);
	
	public void insertOrder(OrderVO order);
	
	public void insertDetail(OrderDetailVO details);
}
