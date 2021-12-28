import java.util.Scanner;
public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());

        String typeSport = "";
        double price = 0;

        switch (season){
            case "Winter":
                if ("girls".equals(typeGroup)){
                    price = 9.60;
                    typeSport = "Gymnastics";
                }
                else if ("boys".equals(typeGroup)){
                    price = 9.60;
                    typeSport = "Judo";
                }
                else if ("mixed".equals(typeGroup)){
                    price = 10;
                    typeSport = "Ski";
                }
                break;
            case "Spring":
                if ("girls".equals(typeGroup)){
                    price = 7.20;
                    typeSport = "Athletics";
                }
                else if ("boys".equals(typeGroup)){
                    price = 7.20;
                    typeSport = "Tennis";
                }
                else if ("mixed".equals(typeGroup)){
                    price = 9.50;
                    typeSport = "Cycling";
                }
                break;
            case "Summer":
                if ("girls".equals(typeGroup)){
                    price = 15.00;
                    typeSport = "Volleyball";
                }
                else if ("boys".equals(typeGroup)){
                    price = 15.00;
                    typeSport = "Football";
                }
                else if ("mixed".equals(typeGroup)){
                    price = 20.00;
                    typeSport = "Swimming";
                }
                break;
        }
        double totalSum = price * countNights * countStudents;

        if (countStudents >= 10 && countStudents < 20){
            totalSum *= 0.95;
        }
        else if (countStudents >= 20 && countStudents < 50){
            totalSum *= 0.85;
        }
        else if (countStudents >= 50){
            totalSum *= 0.50;
        }
        System.out.printf("%s %.2f lv.",typeSport,totalSum);
    }
}