import java.util.Scanner;
public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String typeCarClass = "";
        String typeCar = "";
       

        if (budget <= 100){
            typeCarClass = "Economy class";
            if ("Summer".equals(season)){
                typeCar = "Cabriolet";
                budget *= 0.35;
            }
            else if ("Winter".equals(season)){
                typeCar = "Jeep";
                budget *= 0.65;
            }
        }
        else if (budget > 100 && budget <= 500){
            typeCarClass = "Compact class";
            if ("Summer".equals(season)){
                typeCar = "Cabriolet";
                budget *= 0.45;
            }
            else if ("Winter".equals(season)){
                typeCar = "Jeep";
                budget *= 0.80;
            }
        }
        else if (budget > 500){
            typeCarClass = "Luxury class";
            if ("Summer".equals(season) || "Winter".equals(season)){
                typeCar = "Jeep";
                budget *= 0.90;
            }
        }
        System.out.println(typeCarClass);
        System.out.printf("%s - %.2f",typeCar,budget);
    }
}