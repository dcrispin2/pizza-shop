package edu.iu.dcrispin.pizzashop.model;

public class NewYorkPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraTomatoSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Mushrooms(),
		                      new Onions(),
		                      new RedPeppers() };
		return veggies;
	}

	public Pepperoni createPepperoni() { return new RegularPepperoni();}


	public Clams createClam() {
		return new FreshClams();
	}
}
