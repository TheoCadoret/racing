package tddmicroexercises.turnticketdispenser;

public class TicketDispenser
{
    private final Compteur compteur;

    public TicketDispenser(Compteur compteur){

        this.compteur = compteur;
    }

    public TurnTicket getTurnTicket()
    {
        int newTurnNumber = compteur.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
