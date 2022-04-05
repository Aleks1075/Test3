package Test2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException
    {
        Tournament.runTournament();
        //Main.arraylistTest();
        //TextUI.addTeams();
        //TextUI.addPlayedMatch();
        //TextUI.displayLeagueTable();
    }

    private static void arraylistTest() throws IOException
    {
        ArrayList<String> Array2 = new ArrayList<String>();

        // Array 2: [1][0][0][1][0]

        Array2.add("1");
        Array2.add("0");
        Array2.add("0");
        Array2.add("1");
        Array2.add("0");
        for (int i = 0; i < Array2.size(); i++)
        {
            if (Array2.get(i).equals("1"))
            {
                System.out.println(Array2);
            }
        }
    }
}