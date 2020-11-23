import Currency.java;

class TestFactory{
	public static void main(String args[]) {
		IngredientStore store = new NYIngredientStore();
		PizzaStore pz = new NYPizzaStore(store);
		pz.preparePizza("cheese");
		System.out.println(CURRENCY.PENNY);
	}
}