package com.theironyard;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by vajrayogini on 3/28/16.
 */
public class MainTest {

    @Test
    public void testIsFlush() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.TEN));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.THREE));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FIVE));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.SEVEN));
        assertTrue(Main.isFlush(hand));
    }

    @Test
    public void testIsFour() throws Exception {

    }

    @Test
    public void testIsStraight() throws Exception {

    }

    @Test
    public void testIsStraightFlush() throws Exception {

    }

    @Test
    public void testIsTwoPair() throws Exception {

    }

    @Test
    public void testIsThree() throws Exception {

    }
}