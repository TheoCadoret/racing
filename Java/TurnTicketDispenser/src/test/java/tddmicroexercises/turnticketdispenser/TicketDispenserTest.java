package tddmicroexercises.turnticketdispenser;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * Created by theoc on 20/07/2017.
 */
public class TicketDispenserTest {




    @Test
    public void should_correctly_assign_turnticket_numbers_with_compteur() throws Exception {
        //given
        int nextNumber = 0;
        testableompteur compteur = new testableompteur(nextNumber);
        TicketDispenser disp1 = new TicketDispenser(compteur);


        //when
        TurnTicket ticket1 = disp1.getTurnTicket();


        //then
        assertTrue(ticket1.getTurnNumber()==nextNumber);

    }

    private class testableompteur implements Compteur{
       private final int next;


       public testableompteur(int next) {

           this.next = next;
       }

       @Override
        public int getNextTurnNumber() {
            return next;
        }
    }
}