package tddmicroexercises.turnticketdispenser;

import static org.junit.Assert.*;

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
        assertNotSame("ticket1 = ticket 2", ticket1, ticket2);

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
        assertNotSame("ticket1 = ticket 2", ticket1, ticket2);

    }




}