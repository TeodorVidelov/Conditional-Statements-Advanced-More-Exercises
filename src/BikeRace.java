import java.util.Scanner;
public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJuniorsBikers = Integer.parseInt(scanner.nextLine());
        int countSeniorsBikers = Integer.parseInt(scanner.nextLine());
        String typeTrack = scanner.nextLine();

        double juniorParticipationFee = 0;
        double seniorParticipationFee = 0;
        int countBikers = countJuniorsBikers + countSeniorsBikers;

        if ("trail".equals(typeTrack)){
            juniorParticipationFee = 5.50;
            seniorParticipationFee = 7;
        }
        else if ("cross-country".equals(typeTrack)){
            juniorParticipationFee = 8;
            seniorParticipationFee = 9.50;
            if (countBikers >= 50){
                juniorParticipationFee *= 0.75;
                seniorParticipationFee *= 0.75;
            }
        }
        else if ("downhill".equals(typeTrack)){
            juniorParticipationFee = 12.25;
            seniorParticipationFee = 13.75;
        }
        else if ("road".equals(typeTrack)){
            juniorParticipationFee = 20;
            seniorParticipationFee = 21.50;
        }
        double sum = juniorParticipationFee * countJuniorsBikers + seniorParticipationFee * countSeniorsBikers;
        double amountForExpenses = sum * 0.05;
        double totalSum = sum - amountForExpenses;

        System.out.printf("%.2f",totalSum);
    }
}