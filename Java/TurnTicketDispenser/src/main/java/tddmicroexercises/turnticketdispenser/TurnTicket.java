package tddmicroexercises.turnticketdispenser;

public class TurnTicket
{
    private final int turnNumber;

    public TurnTicket(int turnNumber)
    {
        this.turnNumber = turnNumber;
    }

    public int getTurnNumber()
    {
        return turnNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        TurnTicket that = (TurnTicket) o;

        return turnNumber == that.turnNumber;
    }

    @Override
    public int hashCode() {
        return turnNumber;
    }
}
