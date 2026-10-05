// ATM Simulation - By Vivek Rentapalli | B.Tech 2nd Year
import java.util.Scanner;

class ATM 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        int pin = 548765;
        double balance = 10000.00;

        System.out.println("----WELCOME TO INDIA'S ATM----");
        System.out.print("Enter 6 digits pin: ");
        int enterpin = input.nextInt();

        if (enterpin == pin) {
            System.out.println("Login Successful..");

            while (true) {
                System.out.println("\n---MENU---");
                System.out.println("1. Cash Withdraw");
                System.out.println("2. Deposit Cash");
                System.out.println("3. Check Balance");
                System.out.println("4. Change Pin");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to Withdraw: $");
                        double withdraw = input.nextDouble();
                        if (withdraw <= balance && withdraw > 0) {
                            balance -= withdraw;
                            System.out.println("Collect your Cash: $" + withdraw);
                            System.out.println("Remaining Balance: $" + balance);
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                        break;
                    case 2:
                        System.out.print("Enter amount to Deposit: $");
                        double deposit = input.nextDouble();
                        balance += deposit;
                        System.out.println("$" + deposit + " Deposit Successful");
                        System.out.println("Updated Balance: $" + balance);
                        break;
                    case 3:
                        System.out.println("Your Current Balance: $" + balance);
                        break;
                    case 4:
                        System.out.print("Enter New 6-digit Pin: ");
                        int newpin = input.nextInt();
                        pin = newpin;
                        System.out.println("Your Pin Changed Successfully!");
                        break;
                    case 5:
                        System.out.println("Thank You for Using Vivek ATM");
                        System.out.println("Please Collect Your Card");
                        input.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        } 
        else
             {
            System.out.println("Wrong Pin!");
        }
    }
}
