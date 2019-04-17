package com.DAO.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.DAO.AddrDAO;
import com.common.DBConnector;

public class AddrDAOImpl implements AddrDAO {
	private String selectAddrList = "select * from address where ad_num<=100";

	@Override
	public List<Map<String, String>> selectAddrList(Map<String, String> addr) {
		try {
			PreparedStatement ps = DBConnector.getCon().prepareStatement(selectAddrList);
			ResultSet rs = ps.executeQuery();
			List<Map<String,String>> addrList = new ArrayList<>();
			while(rs.next()) {
				Map<String,String> a = new HashMap<>();
				a.put("ad_num",rs.getString("ad_num"));
				a.put("ad_code",rs.getString("ad_code"));
				a.put("ad_sido",rs.getString("ad_sido"));
				a.put("ad_gugun",rs.getString("ad_gugun"));
				a.put("ad_dong",rs.getString("ad_dong"));
				a.put("ad_lee",rs.getString("ad_lee"));
				a.put("ad_bunji",rs.getString("ad_bunji"));
				a.put("ad_ho",rs.getString("ad_ho"));
				a.put("ad_roadcode",rs.getString("ad_roadcode"));
				a.put("ad_isbase",rs.getString("ad_isbase"));
				a.put("ad_orgnum",rs.getString("ad_orgnum"));
				a.put("ad_subnum",rs.getString("ad_subnum"));
				a.put("ad_jinum",rs.getString("ad_jinum"));
				
				addrList.add(a);
				
			}
			return addrList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Map<String, String> selectAddr(Map<String, String> addr) {
		return null;
	}

	@Override
	public int insertAddr(Map<String, String> addr) {
		return 0;
	}

	@Override
	public int updateAddr(Map<String, String> addr) {
		return 0;
	}

	@Override
	public int deleteAddr(Map<String, String> addr) {
		return 0;
	}
	public static void main(String[] args) {
		AddrDAO adao = new AddrDAOImpl();
		System.out.println(adao.selectAddrList(null));
	}
}
