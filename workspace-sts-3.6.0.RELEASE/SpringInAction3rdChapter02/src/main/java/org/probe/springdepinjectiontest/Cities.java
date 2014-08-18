package org.probe.springdepinjectiontest;

import java.util.List;

public class Cities {
	private List<City> citiesList;
	
	public List<City> getCitiesList() {
		return citiesList;
	}
	
	public void setCitiesList(List<City> cities) {
		this.citiesList = cities;
	}
}
