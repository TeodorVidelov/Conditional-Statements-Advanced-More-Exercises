import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String placeToStay = "";

        if (budget <= 1000){
        placeToStay = "Camp";
            if ("Summer".equals(season)){
                destination = "Alaska";
                budget *= 0.65;
            }
            else if ("Winter".equals(season)){
                destination = "Morocco";
                budget *= 0.45;
            }
        }
        else if (budget > 1000 && budget <= 3000){
            placeToStay = "Hut";
            if ("Summer".equals(season)){
                destination = "Alaska";
                budget *= 0.80;
            }
            else if ("Winter".equals(season)){
                destination = "Morocco";
                budget *= 0.60;
            }
        }
        else if (budget > 3000){
            placeToStay = "Hotel";
            if ("Summer".equals(season)){
                destination = "Alaska";
                budget *= 0.90;
            }
            else if ("Winter".equals(season)){
                destination = "Morocco";
                budget *= 0.90;
            }
        }
        System.out.printf("%s - %s - %.2f",destination,placeToStay, budget);
    }
}