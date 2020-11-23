public class NYPizzaStore extends PizzaStore {
	public NYPizzaStore(IngredientStore st) {
		super(st);
	}
	protected Pizza createPizza(String str) {
		if(str=="cheese")
			return new NYCheesePizza();
		else if(str=="thin")
			return new NYThinPizza();
		return new NYThinPizza();
	}
}