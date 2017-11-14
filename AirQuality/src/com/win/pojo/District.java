package com.win.pojo;

import java.util.List;

public class District {
		private int id;
		private String name;
		
		private List<Airquality> list;
		
		public List<Airquality> getList() {
			return list;
		}
		public void setList(List<Airquality> list) {
			this.list = list;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}
