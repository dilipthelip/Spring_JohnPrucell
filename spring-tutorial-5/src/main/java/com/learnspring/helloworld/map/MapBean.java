package com.learnspring.helloworld.map;

import java.util.Map;

import com.learnspring.helloworld.list.Animal;

public class MapBean {
	
	private Map<String, String> inMap;
	private Map<String, Animal> animalMap;

	/**
	 * @return the animalMap
	 */
	public Map<String, Animal> getAnimalMap() {
		return animalMap;
	}

	/**
	 * @param animalMap the animalMap to set
	 */
	public void setAnimalMap(Map<String, Animal> animalMap) {
		this.animalMap = animalMap;
	}

	/**
	 * @return the inMap
	 */
	public Map<String, String> getInMap() {
		return inMap;
	}

	/**
	 * @param inMap the inMap to set
	 */
	public void setInMap(Map<String, String> inMap) {
		this.inMap = inMap;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MapBean [inMap=" + inMap + ", animalMap=" + animalMap + "]";
	}

	
	
	
	
}
