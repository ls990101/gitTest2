package com.win.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.win.pojo.District;
import com.win.service.DistrictService;

@Controller
public class DistrictController {
		@Autowired
		private DistrictService ds;

		public DistrictService getDs() {
			return ds;
		}

		public void setDs(DistrictService ds) {
			this.ds = ds;
		}
		@RequestMapping("/getDistrict")
		public String getDistrict(HttpServletRequest request){
			List<District> Dlist= ds.getDistricts();
			request.getSession().setAttribute("Dlist", Dlist);
			return "add.jsp";
		}
}
