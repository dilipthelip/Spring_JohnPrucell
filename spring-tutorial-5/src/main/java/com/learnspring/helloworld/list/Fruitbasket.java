package com.learnspring.helloworld.list;

import java.util.List;
import java.util.Map;

public class Fruitbasket {

	private String name;
	private List<String> fruits;
	private Map<String, String> map;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the fruits
	 */
	public List<String> getFruits() {
		return fruits;
	}
	/**
	 * @param fruits the fruits to set
	 */
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	/**
	 * @param name
	 * @param fruits
	 */
	public Fruitbasket(String name, List<String> fruits, Map<String,String> map) {
		super();
		this.name = name;
		this.fruits = fruits;
		this.map=map;
	}
	/**
	 * @return the map
	 */
	public Map<String, String> getMap() {
		return map;
	}
	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fruitbasket [name=" + name + ", fruits=" + fruits + ", map="
				+ map + "]";
	}
	
}
