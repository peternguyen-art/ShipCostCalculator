import java.util.Scanner;

public class Main {
    {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double total = 0;
        double fee = 0;
        System.out.println("Enter item price: ");
        if (in.hasNextDouble())
        {
            price = in.nextDouble();
            if (price <100)
            {
                fee = 0.02*price;
                total = price + fee;
            }
            else{
                fee = 0;
                total = price;
            }
            System.out.println("Shipping fee is "+fee);
            System.out.println("Your total is "+total);
            in.nextLine();
        }
    }
}
