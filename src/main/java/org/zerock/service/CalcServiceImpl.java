package org.zerock.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

	@Override
	public Integer add1(String s1, String s2) {
	
		return Integer.parseInt(s1)+ Integer.parseInt(s2);
	}

	@Override
	public Integer add2(String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer add3(String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer add4(String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer add5(String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}

}
