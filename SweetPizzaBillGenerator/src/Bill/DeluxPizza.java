package Bill;

public class DeluxPizza extends Pizza{
	public DeluxPizza(Boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
	}

	@Override
	public void addExtraCheese() {
		// TODO Auto-generated method stub
		super.addExtraCheese();
	}

	@Override
	public void addExtraToppings() {
		// TODO Auto-generated method stub
		super.addExtraToppings();
	}
	
	
}
