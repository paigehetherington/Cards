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
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.TEN));
        hand.add(new Card (Card.Suit.HEARTS, Card.Rank.TEN));
        hand.add(new Card (Card.Suit.SPADES, Card.Rank.TEN));
        hand.add(new Card (Card.Suit.DIAMONDS, Card.Rank.TEN));
        assertTrue(Main.isFour(hand));

    }

    @Test
    public void testIsStraight() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FOUR));
        hand.add(new Card (Card.Suit.HEARTS, Card.Rank.FIVE));
        hand.add(new Card (Card.Suit.SPADES, Card.Rank.SIX));
        hand.add(new Card (Card.Suit.DIAMONDS, Card.Rank.SEVEN));
        assertTrue(Main.isStraight(hand));

    }

    @Test
    public void testIsStraightFlush() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FOUR));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FIVE));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.SIX));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.SEVEN));
        assertTrue(Main.isStraightFlush(hand));
    }

    @Test
    public void testIsTwoPair() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FOUR));
        hand.add(new Card (Card.Suit.HEARTS, Card.Rank.FOUR));
        hand.add(new Card (Card.Suit.DIAMONDS, Card.Rank.SIX));
        hand.add(new Card (Card.Suit.SPADES, Card.Rank.SIX));
        assertTrue(Main.isTwoPair(hand));

    }

    @Test
    public void testIsThree() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FOUR));
        hand.add(new Card (Card.Suit.HEARTS, Card.Rank.FOUR));
        hand.add(new Card (Card.Suit.DIAMONDS, Card.Rank.FOUR));
        hand.add(new Card (Card.Suit.SPADES, Card.Rank.SIX));
        assertTrue(Main.isThree(hand));

    }
}