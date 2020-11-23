public class ChicagoPizzaStore extends PizzaStore {
	public ChicagoPizzaStore(IngredientStore st) {
		super(st);
	}
	protected Pizza createPizza(String str) {
		if(str=="cheese")
			return new ChicagoCheesePizza();
		else if(str=="thin")
			return new ChicagoThinPizza();
		return new ChicagoThinPizza();
	}
}