package loops;

//Importing the Scanner class
// import java.util.Scanner;
// public class Customer {
// 	public static void main(String[] args) {
// 		try (// Create a Scanner object
//         Scanner sc = new Scanner(System.in)) {
//             int totalCost = 0;
//             int unitPrice = 10;
//             System.out.println("Enter the max amount you can pay");
//             int maxAmountCustomerCanPay = sc.nextInt();
//             System.out.println("Enter the number of food items to be ordered");
//             int noFoodItemsToBeOrdered = sc.nextInt();
//             for (int counter = 1; counter <= noFoodItemsToBeOrdered; counter++) {
//             	System.out.println("Enter the food item");
//             	String foodItem = sc.next();
//             	System.out.println("Enter the quantity");
//             	int quantity = sc.nextInt();
//             	totalCost += unitPrice * quantity;
//             	if (totalCost > maxAmountCustomerCanPay) {
//             		System.out.println("Sorry! Total cost is crossing your max amount limit.");
//             		break;
//             	}
//             	System.out.println("You have ordered: " + foodItem);
//             	System.out.println("Order placed successfully");
//             	System.out.println("Total cost of the order: " + totalCost);
//             }
//         }
// 	}
// }

//Importing the Scanner class
import java.util.Scanner;
public class Customer {
	public static void main(String[] args) {
		// Create a Scanner object
		@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		int unitPrice = 10;
		System.out.println("Enter the number of food items to be ordered");
		int noFoodItemsToBeOrdered = sc.nextInt();
		for (int counter = 1; counter <= noFoodItemsToBeOrdered; counter++) {
			if (counter == 3)
				continue;
			System.out.println("Enter the food item");
			String foodItem = sc.next();
			System.out.println("Enter the quantity");
			int quantity = sc.nextInt();
			System.out.println("You have ordered: " + foodItem);
			System.out.println("You have successfully placed the order number: "+ counter);
			totalCost += unitPrice * quantity;
			System.out.println("Total cost of the order: " + totalCost);
		}
	}
}



