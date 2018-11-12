package com.capg.trg.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Country 
{
	private List<String>  countryList;
	private Set<String> countrySet;
	private Map<String,String> countryMap;
	
	
	

	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}
	public Set<String> getCountrySet() {
		return countrySet;
	}
	public void setCountrySet(Set<String> countrySet) {
		this.countrySet = countrySet;
	}
	public Map<String, String> getCountryMap() {
		return countryMap;
	}
	public void setCountryMap(Map<String, String> countryMap) {
		this.countryMap = countryMap;
	}
	public List<String> getCountryList() {
		
		return countryList;
	}
	
	
}
