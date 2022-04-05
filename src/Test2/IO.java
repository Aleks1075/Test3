package Test2;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IO {

    public void getTeamNames();
    public void getTeamPlayers() throws IOException;
    public void getTeamScores();
}
