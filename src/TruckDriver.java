import java.util.Scanner;
public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmForMonth = Double.parseDouble(scanner.nextLine());

        double monthsInOneSeason = 4;
        double priceForKm = 0;
        double tax = 0.90;

        if ("Spring".equals(season) || "Autumn".equals(season)){
            if (kmForMonth <= 5000){
                priceForKm = 0.75;
            }
            else if (kmForMonth > 5000 && kmForMonth <= 10000){
                priceForKm = 0.95;
            }
        }
        else if ("Summer".equals(season)){
            if (kmForMonth <= 5000){
                priceForKm = 0.90;
            }
            else if (kmForMonth > 5000 && kmForMonth <= 10000){
                priceForKm = 1.10;
            }
        }
        else if ("Winter".equals(season)){
            if (kmForMonth <= 5000){
                priceForKm = 1.05;
            }
            else if (kmForMonth > 5000 && kmForMonth <= 10000){
                priceForKm = 1.25;
            }
        }
        if (kmForMonth > 10000 && kmForMonth <= 20000){
            priceForKm = 1.45;
        }
        double salary = priceForKm * kmForMonth * monthsInOneSeason * tax;
        System.out.printf("%.2f",salary);
    }
}