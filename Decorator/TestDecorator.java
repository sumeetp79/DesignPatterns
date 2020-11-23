import com.sumeetp.Decorator.*;

public class TestDecorator {
	public static void main(String[] args) {
		Beverage b = new Caramel(new Hazelnut(new Hazelnut(new Milk())));
		System.out.println("Cost of the beverage: "+b.getCost());
	}
}
	