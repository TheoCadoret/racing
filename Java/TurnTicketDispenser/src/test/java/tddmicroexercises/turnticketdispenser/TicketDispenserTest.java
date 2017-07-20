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
    public void should_not_give_the_same_ticket_twice() throws Exception {
        //given
        TurnNumberSequence numberSequence = new TurnNumberSequence();
        TicketDispenser disp1 = new TicketDispenser();


        //when
        TurnTicket ticket1 = disp1.getTurnTicket();
        TurnTicket ticket2 = disp1.getTurnTicket();

        //then
        assertFalse(ticket1.equals(ticket2));
    }


    @Test
    public void should_not_give_the_same_ticket_by_two_different_dispensers() throws Exception {
        //given
        TurnNumberSequence numberSequence = new TurnNumberSequence();
        TicketDispenser disp1 = new TicketDispenser();
        TicketDispenser disp2 = new TicketDispenser();


        //when
        TurnTicket ticket1 = disp1.getTurnTicket();
        TurnTicket ticket2 = disp2.getTurnTicket();

        //then

    }

    @Test
    public void should_not_give_the_same_ticket_by_100_different_dispensers() throws Exception {

        //given
        List<TicketDispenser> dispensers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            TicketDispenser dispenser = new TicketDispenser();
            dispensers.add(dispenser);
        }

        //when
        List<TurnTicket> turnTickets = dispensers.parallelStream()
                .map(ticketDispenser -> ticketDispenser.getTurnTicket())
                .collect(Collectors.toList());


        //then
        Set<TurnTicket> distinct = new HashSet<>(turnTickets);
        System.out.println(distinct.size());

        assertTrue("Ils ne sont pas tous différents",distinct.size()==100);
    }
}