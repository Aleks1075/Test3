package Test2;

public class TournamentInfo {
    IO dataHandler;

    public TournamentInfo(){
        dataHandler = new FileIO();
        dataHandler.saveData();

    }
}
