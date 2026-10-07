/*0. Exit 
1. Add Mango 
boundary checking      
basket [counter++]=new 
Mango(nm, weight, color); break; 
2. Add Orange 
3. Add Apple 
NOTE: You will be adding a fresh fruit in the basket, in all of above options. 
4. Display names of all fruits in the basket. eg : for-each --- null checking --getName() 
5. Display name, color, weight, taste of all fresh fruits, in the basket. eg : for-each , null 
checking --toString , taste, isFresh: getter 
6. Display tastes of all stale (not fresh) fruits in the basket. 
7. Mark a fruit as stale i/p : index 
Eg: setter : isFresh : false 
O/P: error message (in case of invalid index) or mark it stale. 
8. Mark all sour fruits stale (optional) eg : for-each , taste --equals(String)*/

package inheri_polymor;

import java.util.Scanner;

public class Fruit_Basket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter basket size : ");
		int n = sc.nextInt();

		fruit[] basket = new fruit[n];
		int counter = 0;
		int choice;

		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits");
			System.out.println("5. Display details of all fresh fruits");
			System.out.println("6. Display tastes of all stale fruits");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you!");
				break;
			case 1:
				if (counter >= basket.length) {
					System.out.println("Basket is full!");
					break;
				}
				System.out.print("Enter Mango name: ");
				String mangoName = sc.next();

				System.out.print("Enter weight: ");
				double mangoWeight = sc.nextDouble();

				System.out.print("Enter color: ");
				String mangoColor = sc.next();
				
				basket[counter++] = new Mango(mangoName, mangoColor, mangoWeight);

                System.out.println("Mango added successfully.");

				break;
			case 2:
				if (counter >= basket.length) {
					System.out.println("Basket is full!");
					break;
				}
				System.out.println("Enter Orange Name: ");
				String Orangename=sc.next();
				
				System.out.println("Enter weight: ");
				double OrangeWeight=sc.nextDouble();
				
				System.out.println("Enter color: ");
				String orangeColor=sc.next();
				
				basket[counter++]= new Orange(Orangename, orangeColor, OrangeWeight);
				System.out.println("Orange added successfully");
				
				break;
			case 3:
				if (counter >= basket.length) {
					System.out.println("Basket is full!");
					break;
				}
				System.out.println("Enter Apple Name: ");
				String Applename=sc.next();
				
				System.out.println("Enter weight: ");
				double AppleWeight=sc.nextDouble();
				
				System.out.println("Enter color: ");
				String AppleColor=sc.next();
				
				basket[counter++]=new Apple(Applename, AppleColor, AppleWeight);
				
				break;
			case 4:
				System.out.println("fruit list");
				for(fruit f:basket)
				{
					if(f!=null)
					{
						System.out.println(f.getName());
					}
				}
				break;
			case 5:
				System.out.println("\n--- Fresh Fruits ---");

                for (fruit f : basket) {

                    if (f != null && f.getIsFresh()) {

                        System.out.println(f);
                        System.out.println("Taste: " + f.taste());
                        System.out.println();
                    }
                }
				break;
			case 6:

                System.out.println("\n--- Stale Fruits ---");

                for (fruit f : basket) {

                    if (f !=  null && f.getIsFresh()) {

                        System.out.println(
                            f.getName() + " -> " + f.taste()
                        );
                    }
                }
				break;
			case 7:
				System.out.print("Enter index at which you want to mark as stale: ");
			    int i = sc.nextInt();

			    try {
			        basket[i].setIsFresh(false);
			        System.out.println("Fruit marked as stale.");
			    }
			    catch (IndexOutOfBoundsException e) {
			        System.out.println("Error: Invalid index.");
			    }
				break;
			case 8:
				for (fruit f : basket) {

                    if (f.taste().equals("sour")) {

                        f.setIsFresh(false);
                    }
                }

                System.out.println(
                    "All sour fruits marked as stale."
                );
				break;
			}

		} while (choice !=0);
		sc.close();
	}
	

}
