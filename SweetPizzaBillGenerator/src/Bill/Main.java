package Bill;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		System.out.println("---------------------------------------Welcome to Pizzamania------------------------------------------");
		System.out.println("Select Your Pizza:\n"
				+ " 1.Veg Pizza \n"
				+ " 2.Non-Veg Pizza \n"
				+ " 3.Delux Veg Pizza \n"
				+ " 4.Delux non-Veg Pizza \n"
				+ " ===> ");
		Scanner sc = new Scanner(System.in); 
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			Pizza vegPizza = new Pizza(true);
			vegPizza.addExtraToppings();
			vegPizza.addExtraCheese();
			vegPizza.takeAway();
			vegPizza.getBill();
			break;
			
		case 2:
			Pizza nonVegPizza = new Pizza(false);
			nonVegPizza .addExtraToppings();
			nonVegPizza .addExtraCheese();
			nonVegPizza .takeAway();
			nonVegPizza .getBill();
			break;
			
		case 3:
			DeluxPizza veg = new DeluxPizza(true);
			veg.basePizzaPrice= 550;
			veg.addExtraToppings();
			veg.addExtraCheese();
			veg.takeAway();
			veg.getBill();
			break;
			
		case 4:
			DeluxPizza nonVeg = new DeluxPizza(true);
			nonVeg.basePizzaPrice = 650;
			nonVeg.addExtraToppings();
			nonVeg.addExtraCheese();
			nonVeg.takeAway();
			nonVeg.getBill();
			break;
			
		default:
			System.out.println("Invalid Choice...!!!"
					+ " Please Enter Again...!!!");
			return;
		}
		sc.close();
	}
}
