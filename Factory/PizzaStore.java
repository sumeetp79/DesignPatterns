public abstract class PizzaStore{
	Pizza p;
	IngredientStore store;
	public PizzaStore(IngredientStore st) {
		this.store=st;
	}
	void preparePizza(String str){
		p=createPizza(str);
		p.receiveIngredient(store.getIngredients());
		p.prepare();
		p.bake();
		p.cut();
		p.box();
	}
	protected abstract Pizza createPizza(String str);
}
	