package tddmicroexercises.turnticketdispenser;

public class TurnNumberSequence implements Compteur
{
    private static int _turnNumber = 0;

    @Override
    public  int getNextTurnNumber()
    {
        return _turnNumber++;
    }
}
