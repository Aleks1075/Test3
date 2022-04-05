package Test2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TextUI {

    private static ArrayList<Team> league;
    private int numberOfClubs;
    private static Scanner scanner;
    static ArrayList<String> result = new ArrayList<>();
    static ArrayList<String> result1 = new ArrayList<>();

    public TextUI(int numberOfClubs) {

        this.numberOfClubs = numberOfClubs;
        league = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void addPlayedMatch() throws IOException {
        FileWriter out;
        out = new FileWriter("src/Test2/kampResultat.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Indtast hjemmeholdets antal mål: ");
        result.add(sc.next());

        System.out.println("Indtast udeholdets antal mål: ");
        result1.add(sc.next());

        System.out.print(result);
        System.out.print(result1);
        out.write(result +"\n");
        out.write(result1 +"\n");
        out.close();
    }

    static void displayLeagueTable() {

        Collections.sort(league, new CustomComparator());
        for (Team club : league) {
            System.out.println("Hold: " + club.getName() + " Points: " + club.getPoints() + " mål forskel: " + (club.getScoredGoalsCount() - club.getReceivedGoalsCount()));
        }
    }

}
