package com.win.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.win.dao.AirqualityMapper;
import com.win.pojo.Airquality;
@Service("asi")
public class AirqualityServiceImpel implements AirqualityService {

	@Autowired
	private AirqualityMapper am;
	
	public AirqualityMapper getAm() {
		return am;
	}

	public void setAm(AirqualityMapper am) {
		this.am = am;
	}

	@Override
	public List<Airquality> getAll(int begin, int size) {
		// TODO Auto-generated method stub
		return am.getAll(begin, size);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return am.count();
	}

	@Override
	public boolean insert(Airquality airquality) {
		// TODO Auto-generated method stub
		return am.insert(airquality);
	}

}
