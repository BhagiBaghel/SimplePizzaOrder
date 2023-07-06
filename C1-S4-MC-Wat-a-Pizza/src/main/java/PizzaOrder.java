import java.util.Scanner;
public class PizzaOrder
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     /*   System.out.print(" Enter your name : ");
        String name = scan.next();
        System.out.print(" Enter your email id : ");
        String email = scan.next();
        System.out.print(" Enter your phone no. : ");
        long phone = (long) scan.nextDouble();
        System.out.print(" Enter your address : ");
        String address = scan.next();

      */

        int item;
        double pizzaBill = 0, breadBill = 0, beverageBill = 0;
        double totalBill = 0, discountedBill = 0;

       do {
           System.out.print("What would you like to Order ? ");
           System.out.println(" Press: 1 for Pizza | 2 for Garlic Bread | 3 for Beverages | 0 to Exit ");
           item = scan.nextInt();
            System.out.println();

            switch (item)
            {
                case 1:
                    int pizzaOrder, pizzaSize;
                    System.out.println(" Choose the size of Pizza ");
                    System.out.println(" Press: 1 for REGULAR Size | 2 for MEDIUM Size | 3 for LARGE Size ");
                    pizzaSize = scan.nextInt();
                    System.out.println();

                    switch (pizzaSize)
                    {
                        case 1:
                            double regularPizza = 9.99;
                            System.out.print(" Total number of Pizza order: ");
                            pizzaOrder = scan.nextInt();
                            pizzaBill = regularPizza * pizzaOrder;
                            continue;
                        case 2:
                            double mediumPizza = 11.99;
                            System.out.print(" Total number of Pizza order: ");
                            pizzaOrder = scan.nextInt();
                            pizzaBill = mediumPizza * pizzaOrder;
                            continue;
                        case 3:
                            double largePizza = 13.99;
                            System.out.print(" Total number of Pizza order: ");
                            pizzaOrder = scan.nextInt();
                            pizzaBill = largePizza * pizzaOrder;
                            continue;
                    }


              //      System.out.print(" Your total Pizza bill : " + pizzaBill);
                    System.out.println();
                    System.out.println(" Do you want to Order again ? ");
                   continue;

                case 2:
                    int breadOrder;
                    double breadPrice = 5.99;
                    System.out.print(" Total number of Garlic Bread order: ");
                    breadOrder = scan.nextInt();
                      breadBill = breadPrice * breadOrder;
              //      System.out.print(" Your total Garlic Bread bill : " + breadBill);
                    System.out.println();
                    System.out.println(" Do you want to Order again ? ");
                    continue;

                case 3:
                    int beverageOrder;
                    double beveragePrice = 1.99;
                    System.out.print(" Total number of Beverages order: ");
                    beverageOrder = scan.nextInt();
                      beverageBill = beveragePrice * beverageOrder;
             //       System.out.print(" Your total Beverages bill : " + beverageBill);
                    System.out.println();
                    System.out.println(" Do you want to Order again ? ");
                    break;
            }
        }
        while (item != 0);
        {
            totalBill = pizzaBill + breadBill + beverageBill;
            System.out.println(" Your Total Bill is " + " $ " + totalBill);
        }
        if (totalBill > 50)
        {
            discountedBill = totalBill - totalBill/10;
            System.out.println(" Your Nett Bill after 10% OFF is " + " $ " + discountedBill);
        }
        System.out.println(" Thank you ... We hope you come again.");
        scan.close();
    }
}
