import java.util.Scanner;
public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String typeTicket = scanner.nextLine();
        int countPeopleInGroup = Integer.parseInt(scanner.nextLine());

        double transportPrice = budget;
        double vipTicket = 499.99;
        double normalTicket = 249.99;

        if (countPeopleInGroup >= 1 && countPeopleInGroup <= 4){
            transportPrice *= 0.25;
        }
        else if (countPeopleInGroup >= 5 && countPeopleInGroup <= 9){
            transportPrice *= 0.40;
        }
        else if (countPeopleInGroup >= 10 && countPeopleInGroup <= 24){
            transportPrice *= 0.50;
        }
        else if (countPeopleInGroup >= 25 && countPeopleInGroup <= 49){
            transportPrice *= 0.60;
        }
        else {
            transportPrice *= 0.75;
        }

        double ticketPrice = 0;

        if ("VIP".equals(typeTicket)){
            ticketPrice = vipTicket * countPeopleInGroup;
        }
        else if ("Normal".equals(typeTicket)){
            ticketPrice = normalTicket * countPeopleInGroup;
        }
        double diff = Math.abs(transportPrice - ticketPrice);
        if (ticketPrice < transportPrice){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }
    }
}