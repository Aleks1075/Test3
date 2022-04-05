package Test2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Registration
{
    static ArrayList<String> teamName = new ArrayList<>();
    static ArrayList<String> matchResult = new ArrayList<>();
    private String name;
    static ArrayList<String> club = new ArrayList<String>();

    public static void getPlayerNames() throws IOException
    {
        System.out.println("Vælg hvilket hold du vil se spillerne på\n" +
                "Tast 1 for hold 1\n" +
                "Tast 2 for hold 2\n" +
                "Tast 3 for hold 3\n" +
                "Tast 4 for hold 4\n" +
                "Tast 5 for hold 5\n" +
                "Tast 6 for hold 6\n" +
                "Tast 7 for hold 7\n" +
                "Tast 8 for hold 8\n");
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();

        switch (input)
        {
            case "1":
                System.out.println("Her er spillerne på hold 1");

                FileReader fr = new FileReader("src/Test2/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 1; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "2":
                System.out.println("Her er spillerne på hold 2");

                FileReader fr = new FileReader("src/Test2/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 2; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "3":
                System.out.println("Her er spillerne på hold 3");

                FileReader fr = new FileReader("src/Test2/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 3; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "4":
                System.out.println("Her er spillerne på hold 4");

                FileReader fr = new FileReader("src/Test2/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 4; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "5":
                System.out.println("Her er spillerne på hold 5");

                FileReader fr = new FileReader("src/Test2/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 5; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "6":
                System.out.println("Her er spillerne på hold 6");

                FileReader fr = new FileReader("src/Test2/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 6; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "7":
                System.out.println("Her er spillerne på hold 7");

                FileReader fr = new FileReader("src/Test2/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 7; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "8":
                System.out.println("Her er spillerne på hold 8");

                FileReader fr = new FileReader("src/Test2/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 8; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

    }

    public static void getIndividualTeams() throws IOException
    {
        System.out.println("Du skal vælge hvilket hold du vil se spillerne på\n" +
                "Tast 1 for hold 1\n" +
                "Tast 2 for hold 2\n" +
                "Tast 3 for hold 3\n" +
                "Tast 4 for hold 4\n" +
                "Tast 5 for hold 5\n" +
                "Tast 6 for hold 6\n" +
                "Tast 7 for hold 7\n" +
                "Tast 8 for hold 8\n");
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();

        switch (input) {
            case "1":
                System.out.println("Her er spillerne på hold 1");

                FileReader fr = new FileReader("src/Test2/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 1; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
        }

        switch (input)
        {
            case "2":
                System.out.println("Her er spillerne på hold 2");

                FileReader fr = new FileReader("src/Test2/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 2; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());

                break;
        }

        switch (input)
        {
            case "3":
                System.out.println("Her er spillerne på hold 3");
                FileReader fr = new FileReader("src/Test2/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 3; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());

                break;
        }

        switch (input)
        {
            case "4":
                System.out.println("Her er spillerne på hold 4");
                FileReader fr = new FileReader("src/Test2/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 4; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());

                break;
        }

        switch (input)
        {
            case "5":
                System.out.println("Her er spillerne på hold 5");
                FileReader fr = new FileReader("src/Test2/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 5; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());

                break;
        }

        switch (input)
        {
            case "6":
                System.out.println("Her er spillerne på hold 6");
                FileReader fr = new FileReader("src/Test2/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 6; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());

                break;
        }

        switch (input)
        {
            case "7":
                System.out.println("Her er spillerne på hold 7");
                FileReader fr = new FileReader("src/Test2/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 7; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());

                break;
        }

        switch (input)
        {
            case "8":
                System.out.println("Her er spillerne på hold 8");
                FileReader fr = new FileReader("src/Test2/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 8; //line of file to read
                for(int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());

                break;
        }
    }

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
        System.out.print(teamName + "\n");
        out.write(teamName + "\n");
        club.add(0, String.valueOf(teamName));
        System.out.println(club);
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
        System.out.print(teamName + "\n");
        out.write(teamName + "\n");
        out.close();
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