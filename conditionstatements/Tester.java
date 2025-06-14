package conditionstatements;

// public class Tester {
//     //Observe the output for different values of customerType

// 	public static void main(String[] args) {
// 		double discount;
// 		String customerType = "Premium";
// 		switch (customerType) {
// 		case "Regular":
// 			discount = 5;
//             break;
            
//             case "Premium":
// 			discount = 10;
//             break;

// 		default:
// 			discount = 0;
// 		}
// 		System.out.println("Customer has got discount of " + discount + "%");
// 	}

// }



// class Tester {
// 	public static void main(String[] args) {
// 		int inputNumber = 7865;
// 		int sumOfDigits = 0;
// 		int temp = 0;

// 		while (inputNumber > 0) {
// 			temp = inputNumber % 10;
// 			sumOfDigits += temp;
// 			inputNumber = inputNumber / 10;
// 		}

// 		System.out.println("Sum of digits are : " + sumOfDigits);
// 	}
// }

class Tester {
	public static void main(String[] args) {
		int totalCost = 0;
		char wantToAddFoodItem = 'Y';
		int unitPrice = 10;
		int quantity = 1;

		while (wantToAddFoodItem == 'Y') {
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order placed successfully");
			System.out.println("Total cost: " + totalCost);
			System.out.println("Do you want to add one more food item to the order?");
		}
		System.out.println("Thank you for ordering the food! It will reach you shortly...");
	}
}