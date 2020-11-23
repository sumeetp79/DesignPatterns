import java.util.*;
public abstract class IngredientStore{
	ArrayList<String> ingredients=new ArrayList<>();
	public IngredientStore() {
		addIngredients();
	}
	protected abstract void addIngredients();
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	Dough
	protected abstract void setDough();
	protected abstract void setCheese();
	protected abstract void setVeggies();
	protected abstract void setMeat();
}