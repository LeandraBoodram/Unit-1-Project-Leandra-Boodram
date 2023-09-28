import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert the bill: $");
        double bill = scan.nextDouble();
        System.out.println();
        System.out.print("Insert the tip percentage (without the percentage sign): ");
        int tipPercent = scan.nextInt();
        System.out.println();
        System.out.print("Insert number of people: ");
        int numberOfPeople = scan.nextInt();
        System.out.println();
        double tipDecimal = (double) tipPercent / 100;
        double totalTip = bill * tipDecimal;
        double tipPerPerson = totalTip / numberOfPeople;
        double splitBill = bill / numberOfPeople;
        double totalPerPerson = splitBill + tipPerPerson;
        System.out.printf("Tip Per Person: = %.2f", tipPerPerson);
        System.out.println();
        System.out.printf("Total Per Person = %.2f", totalPerPerson);
    }
}
