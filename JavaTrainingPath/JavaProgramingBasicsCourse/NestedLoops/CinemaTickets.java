package JavaProgramingBasicsCourse.NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        // purvi cikul trqbva da :Ime na film , boroj mesta i da izvede na konzolata imeto na filma
        int stuCount = 0;
        int staCount = 0;
        int kid = 0;

        int ticketCount = 0;


        while (!movieName.equals("Finish")) {
            int ticketsTotal = Integer.parseInt(scanner.nextLine());
            int sales = ticketsTotal;

            while (sales > 0) {
                String ticketSold = scanner.nextLine();

                if (ticketSold.equals("End")) {
                    break;
                }

                ticketCount++;

                if (ticketSold.equals("student")) {
                    stuCount++;
                } else if (ticketSold.equals("standard")) {
                    staCount++;
                } else if (ticketSold.equals("kid")) {
                    kid++;
                }

                sales--;


            }


            double occupiedPercent = ticketCount * 1.0 / ticketsTotal * 100;

            System.out.printf("%s - %.2f%% full.%n", movieName, occupiedPercent);
            ticketCount = 0;
            movieName = scanner.nextLine();
        }

        int totalTicket = staCount + stuCount + kid;

        double stu = stuCount * 1.0 / totalTicket * 100;
        double sta = staCount * 1.0 / totalTicket * 100;
        double ki = kid * 1.0 / totalTicket * 100;

        System.out.printf("Total tickets: %d%n", totalTicket);

        System.out.printf("%.2f%% student tickets.%n", stu);
        System.out.printf("%.2f%% standard tickets.%n", sta);
        System.out.printf("%.2f%% kids tickets.", ki);
        // statistika na sedalkite sled imeto na filma i procent zaeti mesta

    }
}
