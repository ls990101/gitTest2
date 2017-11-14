package com.win.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.win.pojo.Airquality;

public interface AirqualityService {
		
	
		public List<Airquality> getAll(@Param("begin")int begin,@Param("size")int size);
		
		public int count();
		
		public boolean insert(Airquality airquality);
}
