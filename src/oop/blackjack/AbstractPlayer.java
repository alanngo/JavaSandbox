package oop.blackjack;
import java.util.*;
public abstract class AbstractPlayer
{
    private Stack<String> hand;

    AbstractPlayer()
    {
        hand = new Stack<>();
    }
}
