import java.util.*;
public abstract class Pizza{
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	ArrayList<String> ingredients = new ArrayList<String>();
	public void receiveIngredient(ArrayList<String> ing) {
		ingredients=ing;
	}
    public void prepare() {
		System.out.println("Preparing pizza "+name);
		System.out.println("Add ingredients:");
		for(String s:ingredients) {
			System.out.println(s);
		}
		System.out.println("Here comes toppings:");
		for(String s:toppings) {
			System.out.println(s);
		}
		
	}
	public void bake() {
		System.out.println("Bake for 15 minutes");
	}
	public void cut() {
		System.out.println("Cut into 6 pieces");
	}
	public void box() {
		System.out.println("Boxing the pizza and doneee....");
	}	
}