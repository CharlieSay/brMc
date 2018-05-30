package co.uk.ocelotcr.Controller;

public class GameController {

    private static GameState CURRENT_STATE = GameState.PRE_LOBBY;

    public static GameState getCurrentState(){
        return CURRENT_STATE;
    }

    public static void setGameState(GameState stateToSet){
        CURRENT_STATE = stateToSet;
    }

}
