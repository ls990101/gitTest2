package com.win.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.win.dao.DistrictMapper;
import com.win.pojo.District;
@Service
public class DistrictServiceImpel implements DistrictService {

	@Autowired
	private DistrictMapper dm;
	
	public DistrictMapper getDm() {
		return dm;
	}

	public void setDm(DistrictMapper dm) {
		this.dm = dm;
	}

	@Override
	public List<District> getDistricts() {
		// TODO Auto-generated method stub
		return dm.getDistricts();
	}

}
