package com.learnspring.helloworld.list;

import java.util.List;

public class Jungle {
	
	private Animal animal;
	private List<Animal> animals;
	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return animal;
	}
	/**
	 * @param animal the animal to set
	 */
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	/**
	 * @return the animals
	 */
	public List<Animal> getAnimals() {
		return animals;
	}
	/**
	 * @param animals the animals to set
	 */
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jungle [animal=" + animal + ", animals=" + animals + "]";
	}
	
	
	

}
