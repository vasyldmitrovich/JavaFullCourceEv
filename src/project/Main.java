package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        run();

    }

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        int rows = getNumberOfRows(scanner);

        int seats = getNumberOfSeats(scanner);

        int[][] cinema = new int[rows][seats];

        int purchasedTickets = 0;

        int currentIncome = 0;

        int totalIncome = calculateTotalIncome(rows, seats);

        int opt;

        do {

            opt = showMenu(scanner);

            switch (opt) {
                case 1:
                    printSeating(cinema);
                    break;
                case 2:

                    int[] purchaseResult = buyTicket(scanner, cinema, rows, seats, purchasedTickets, currentIncome, totalIncome);

                    purchasedTickets = purchaseResult[0];

                    currentIncome = purchaseResult[1];

                    break;
                case 3:

                    printStatistics(cinema, purchasedTickets, currentIncome, totalIncome);

                    break;
            }

        } while (opt != 0);


    }

    public static int getNumberOfRows(Scanner scanner) {

        System.out.println("Enter the number of rows:");

        return scanner.nextInt();
    }

    public static int getNumberOfSeats(Scanner scanner) {

        System.out.println("Enter the number of seats in each row:");

        return scanner.nextInt();
    }

    public static int showMenu(Scanner scanner) {

        System.out.println(" ");

        System.out.println("1. Show the seats");

        System.out.println("2. Buy a ticket");

        System.out.println("3. Statistics");

        System.out.println("0. Exit");

        return scanner.nextInt();
    }

    public static void printSeating(int[][] cinema) {

        System.out.println(" ");

        System.out.print("Cinema:\n  ");


        int rows = cinema.length;

        int seats = cinema[0].length;

        for (int i = 1; i <= seats; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {

            System.out.print(i + 1 + " ");

            for (int j = 0; j < seats; j++) {

                if (cinema[i][j] == 1) {

                    System.out.print("B ");

                } else {

                    System.out.print("S ");
                }
            }

            System.out.println(" ");
        }
    }

    public static int[] buyTicket(Scanner scanner, int[][] cinema, int rows, int seats, int purchasedTickets, int currentIncome, int totalIncome) {

        boolean isSeatAvailable = false;

        while (!isSeatAvailable) {

            System.out.println("Enter a row number:");

            int rowNum = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");

            int seatNum = scanner.nextInt();

            if (rowNum < 1 || rowNum > rows || seatNum < 1 || seatNum > seats) {

                System.out.println("Wrong input!");

                continue;
            }

            if (cinema[rowNum - 1][seatNum - 1] == 1) {

                System.out.println("That ticket has already been purchased!");

            } else {

                cinema[rowNum - 1][seatNum - 1] = 1;

                purchasedTickets++;

                int price = getPrice(rows, seats, rowNum);

                currentIncome += price;

                totalIncome += price;

                System.out.println("Ticket price: $" + price);

                isSeatAvailable = true;
            }
        }

        int[] result = {purchasedTickets, currentIncome};

        return result;
    }

    public static void printStatistics(int[][] cinema, int purchasedTickets, int currentIncome, int totalIncome) {

        int rows = cinema.length;

        int seats = cinema[0].length;

        int totalSeats = rows * seats;

        double percentage = (double) purchasedTickets / totalSeats * 100;

        String formattedPercentage = String.format("%.2f", percentage);

        System.out.println("Number of purchased tickets: " + purchasedTickets);

        System.out.println("Percentage: " + formattedPercentage + "%");

        System.out.println("Current income: $" + currentIncome);

        System.out.println("Total income: $" + totalIncome);
    }

    public static int getPrice(int rows, int seats, int rowNum) {
        int totalSeats = rows * seats;
        int frontRowsPrice = 10;
        int backRowsPrice = 8;
        if (totalSeats <= 60) {
            return 10;
        } else {
            int halfRows = rows / 2;

            if (rowNum <= halfRows) {
                return frontRowsPrice;
            } else {
                return backRowsPrice;
            }
        }

    }

    public static int calculateTotalIncome(int rows, int seats) {

        int totalSeats = rows * seats;

        int frontRowsPrice = 10;

        int backRowsPrice = 8;

        if (totalSeats <= 60) {

            return totalSeats * frontRowsPrice;

        } else {

            int halfRows = rows / 2;

            int frontRowsIncome = halfRows * seats * frontRowsPrice;

            int backRowsIncome = (rows - halfRows) * seats * backRowsPrice;

            return frontRowsIncome + backRowsIncome;
        }
    }
}

