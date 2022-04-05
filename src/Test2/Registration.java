package Test2;

import java.io.FileWriter;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.Scanner;

public class Registration {
    static ArrayList<String> teamName = new ArrayList<>();
    static ArrayList<String> matchResult = new ArrayList<>();
    private String name;
    static ArrayList<String> club = new ArrayList<>();

    public static void teamRegistrations() throws IOException
    {
        FileWriter out;
        out = new FileWriter("src/Test2/hold.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);
        while (teamName.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne:");
            teamName.add(sc.next());
        }
        System.out.print(teamName);
        out.write(teamName + "\n");
        out.close();
    }

    public static void registerResult() throws IOException {
        FileWriter out;
        out = new FileWriter("src/Test2/kampResultat.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        while (matchResult.size() <= 4)
        {
            System.out.println("Indtast venligst hvilke hold der spillede mod hinanden: \n" +
                    "Tast 1 for hold 1\n" +
                    "Tast 2 for hold 2\n" +
                    "Tast 3 for hold 3\n" +
                    "Tast 4 for hold 4\n" +
                    "Tast 5 for hold 5\n" +
                    "Tast 6 for hold 6\n" +
                    "Tast 7 for hold 7\n" +
                    "Tast 8 for hold 8\n");
            matchResult.add(sc.next());

            System.out.print("Hold " + matchResult.get(0) + " Registreret. \n");
            teamName.add(sc.next());
        }
        System.out.print(teamName);
        out.write(teamName + "\n");
        out.close();

        System.out.println("Her skal vi kunne planlægge kampe");
    }

    public static void addTeams() throws IOException
    {
        FileWriter out;
        out = new FileWriter("src/Test2/hold.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        while (club.size() <= 8)
        {
            System.out.println("Indtast venligst navnene på holdene:");
            club.add(sc.next());
        }
        System.out.print(club);
        out.write(club +"\n");
        out.close();
    }



    public String getName() {
        return name;
    }


    public void setName(String s) {
        this.name = s;
    }

}
