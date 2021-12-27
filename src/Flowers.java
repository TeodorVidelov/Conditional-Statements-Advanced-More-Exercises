import java.util.Scanner;
public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrysanthemums = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isItTheDayAHoliday = scanner.nextLine();

        double priceChrysanthemum = 0;
        double priceRoses = 0;
        double priceTulips = 0;
        double priceArrangingFlowers = 2.00;
        int countFlowers = countChrysanthemums + countRoses + countTulips;

        if ("Spring".equals(season) || "Summer".equals(season)){
            priceChrysanthemum = 2.00;
            priceRoses = 4.10;
            priceTulips = 2.50;
        }
        else if ("Autumn".equals(season) || "Winter".equals(season)){
            priceChrysanthemum = 3.75;
            priceRoses = 4.50;
            priceTulips = 4.15;
        }
        double totalSum = priceChrysanthemum * countChrysanthemums +
                priceRoses * countRoses + priceTulips * countTulips;

        if ("Y".equals(isItTheDayAHoliday)){
            totalSum *= 1.15;
        }
        if (countTulips > 7 && "Spring".equals(season)){
            totalSum *= 0.95;
        }
        if (countRoses >= 10 && "Winter".equals(season)){
            totalSum *= 0.90;
        }
        if (countFlowers > 20){
            totalSum *= 0.80;
        }
        totalSum += priceArrangingFlowers;
        System.out.printf("%.2f",totalSum);
    }
}