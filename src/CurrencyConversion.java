import java.util.Scanner;

public class CurrencyConversion {
    static final float USA_VIE_RATE = 23000;
    public static void main(String[] args) {
        float inputUsdAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your USD amount: ");
        inputUsdAmount = scanner.nextFloat();

        System.out.println("Your VND amount is: " + inputUsdAmount*USA_VIE_RATE);
    }
}
