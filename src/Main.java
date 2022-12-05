public class Main
{
    public static void main(String[] args)
    {
        double itemPrice = 45;
        double shippingCost = itemPrice * 0.02;
        double totalPrice = itemPrice + shippingCost;

        System.out.println("The item price is $" + itemPrice);
        System.out.println("The shipping cost is $" + shippingCost);
        System.out.println("The total price is $" + totalPrice);

    }
}