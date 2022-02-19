import java.util.Scanner;

public class HypotenuseFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstSide, secondSide, hypotenuse;

        System.out.print("Please enter the first side of triangle: ");
        firstSide = scanner.nextDouble();

        System.out.print("Please enter the second side of triangle: ");
        secondSide = scanner.nextDouble();
        scanner.close();

        hypotenuse = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));

        System.out.println("Triangle's hypotenuse is " + hypotenuse);

    }
}
