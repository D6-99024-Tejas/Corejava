/*3. Display food menu to user. User will select items from menu along with the 
quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
prices to food items(hard code the prices)  When user enters 'Generate Bill' 
option , display total bill & exit. */
import java.util.Scanner;

class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int quantity;
        double total = 0;
        

        while (true) 
        {
            System.out.println("\n----- FOOD MENU -----");
            System.out.println("1. Dosa       - Rs. 50");
            System.out.println("2. Samosa     - Rs. 20");
            System.out.println("3. Idli       - Rs. 40");
            System.out.println("4. Vada       - Rs. 30");
            System.out.println("5. Poha       - Rs. 30");
            System.out.println("6. Misal      - Rs. 60");
            System.out.println("7. Pav Bhaji  - Rs. 80");
            System.out.println("8. Tea        - Rs. 15");
            System.out.println("9. Coffee     - Rs. 25");
            System.out.println("10. Generate Bill");  


            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            if (choice == 10) {
                break;
            }
            System.out.print("Enter quantity : ");
            quantity = sc.nextInt();
            switch (choice) {
                case 1:
                  total = total + (50 * quantity);
                    break;
                case 2:
                  total = total + (20 * quantity);
                    break;
                case 3:
                  total = total + (30 * quantity);
                    break;
                case 4:
                  total = total + (20 * quantity);
                    break;
                case 5:
                  total = total + (15 * quantity);
                    break;
                case 6:
                    total = total + (60 * quantity);
                    break;
                case 7:
                  total = total + (80 * quantity);
                    break;
                case 8:
                  total = total + (15 * quantity);
                    break;
                case 9:
                    
                  total = total + ( 25* quantity);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        System.out.println("Total Bill = Rs. " + total);
        sc.close();
    }
}