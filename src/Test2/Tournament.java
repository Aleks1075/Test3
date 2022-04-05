package Test2;

import java.io.IOException;
import java.util.Scanner;

public class Tournament {
    public static void runTournament() throws IOException {
        while (true) {
            Scanner scanner;
            scanner = new Scanner(System.in);
            System.out.println("Velkommen til bordfodboldturneringen\nTast 1 for at oprette ny turnering. \n" +
                    "Tast 2 for at se igangværende turnering. \n" +
                    "Tryk Q for at quitte. \n");
            String input;
            input = scanner.nextLine();

            switch (input) {
                case "Q":

                    break;
            }

            if (input.equals("1")) {
                System.out.println("Tast 1 for at oprette navnene\n" +
                        "Tast 2 for at registrere kampresultat\nTast 3 for at planlægge kampe\n" + "Tast 4 for at tilføje holdene. \n" + "Tryk Q for at quitte. \n");

                String input2;
                input2 = scanner.nextLine();

                switch (input2) {
                    case "Q":

                        break;
                }

                switch (input2) {
                    case "1" -> {
                        Registration.teamRegistrations();
                        break;
                    }
                }

                switch (input2) {
                    case "2" -> {
                        Registration.registerResult();
                        break;
                    }
                }

                switch (input2) {
                    case "3" -> {
                        Match.scheduleMatch();
                        break;
                    }
                }

                switch (input2) {
                    case "4" -> {
                        Registration.addTeams();
                        break;
                    }
                }

            }

            if (input.equals("2")) {
                System.out.println("Tast 1 for at se alle hold\n" +
                        "Tast 2 for at se kampresultater\nTast 3 for at se planlagte kampe. \n" + "Tryk Q for at quitte. \n");

                String input3;
                input3 = scanner.nextLine();

                switch (input3) {
                    case "Q":

                        break;
                }

                switch (input3) {
                    case "1" -> {
                        Team.getTeams();
                        break;
                    }
                }

                switch (input3) {
                    case "2" -> {
                        Match.getMatchResults();
                        break;
                    }
                }

                switch (input3) {
                    case "3" -> {
                        Match.getScheduledMatches();
                        break;
                    }
                }

            }

        }
    }
}