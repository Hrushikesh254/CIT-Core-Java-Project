package Bill;

import java.util.Scanner;

public class Pizza {
	protected int price;
	private Boolean veg;
	
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 150;
	private int backPackPrice = 20;
//	private String bill;
	
	protected int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;
	
	Scanner in = new Scanner(System.in);

	public Pizza(Boolean veg) {
		this.veg = veg;
		
		if(this.veg) {
			this.price = 300;
		} 
		else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese() {
		System.out.println("Extra Cheese (y/n)? => ");
		char ch = in.next().charAt(0);
		switch(ch)
		{
		case ('y'):
			isExtraCheeseAdded = true;
			this.price += extraCheesePrice;
			break;
			
		case ('n'):
			isExtraCheeseAdded = false;
			break;
		}
		
	}	        
	
	public void addExtraToppings() {
		System.out.println("Extra Toppings (y/n)? =>");
		char ch = in.next().charAt(0);
		switch(ch)
		{
		case ('y'):
			isExtraToppingsAdded = true;
			this.price += extraToppingsPrice;
			break;
			
		case ('n'):
			isExtraToppingsAdded = false;
			break;
		}

	}
	
	public void takeAway() {
		System.out.println("Want Take Away (y/n)? =>");
		char ch = Character.toLowerCase(in.next().charAt(0));
		switch(ch)
		{
		case ('y'):
			isOptedForTakeAway = true;
			this.price += backPackPrice;
			break;
			
		case ('n'):
			isOptedForTakeAway = false;
			break;
		}

	}
	
	public void getBill() {
		String bill = "";
		
		System.out.println("Pizza: " + basePizzaPrice);
		
		if(isExtraCheeseAdded) {
			bill += "Extra cheese added: "+ extraCheesePrice + "\n";
		}
		
		if(isExtraToppingsAdded) {
			bill += "Extra toppings added: " + extraToppingsPrice + "\n";
		}
		
		if(isOptedForTakeAway) {
			bill += "Take away: "+ backPackPrice + "\n";
		}
		
		bill += "Bill: "+ this.price + "\n";
		System.out.println(bill);
		System.out.println("\n Thank You!!!! Visit Again....");
		System.out.println("---------------------------------------------------");
		
	}
	
}
