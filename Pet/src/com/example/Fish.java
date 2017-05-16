package com.example;

public class Fish extends Animal implements Pet {

	
	private String name;
	
	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish eat pond scum");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Just keep swimming");
	}
	
	@Override 
	public void walk() {
		super.walk();
		System.out.println("Fis, of course, can't walk; they swim!");
	}

}
