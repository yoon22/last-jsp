package com.service.impl;

import java.util.List;
import java.util.Map;

import com.DAO.AddrDAO;
import com.DAO.impl.AddrDAOImpl;
import com.service.AddrService;

public class AddrServiceImpl implements AddrService {
	private AddrDAO adao = new AddrDAOImpl();
	@Override
	public List<Map<String, String>> selectAddrList(Map<String,String> addr) {
		return adao.selectAddrList(addr);
	}

	@Override
	public Map<String, String> selectAddr(Map<String, String> addr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertAddr(Map<String, String> addr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAddr(Map<String, String> addr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAddr(Map<String, String> addr) {
		// TODO Auto-generated method stub
		return 0;
	}

}
