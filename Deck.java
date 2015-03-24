package Blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> Deck;
	private int noOfCards;
	
    public Deck(int noOfDeck)
	{
		noOfCards=noOfDeck*52;
		Deck=new ArrayList<Card>(noOfCards);
		
	
	//Initializing cards for each deck
	 for(int deck=0;deck<(noOfCards/52);deck++)
	  {
		//for Clubs
		for(int i=1;i<=13;i++)
		{
			Deck.add(new Card("Clubs",i));
		}
				
		//for Diamonds
		for(int i=1;i<=13;i++)
		{
			Deck.add(new Card("Diamonds",i));
		}
		
		//for Spades
		for(int i=1;i<=13;i++)
		{
			Deck.add(new Card("Spades",i));
		}
		
		//for Hearts
		for(int i=1;i<=13;i++)
		{
			Deck.add(new Card("Hearts",i));
		}		
		
				
	  }//end of for loop for Deck
	 
	 
	//logic for shuffle(Shuffling of Cards is made mandatory)
	 Collections.shuffle(Deck);
	 
   } //End of Constructor
    
    
   
	//method to get top card of the deck    
    public Card getTopCard()
    {
    	Card topCard;
    	
    	topCard=Deck.get(0);
    	Deck.remove(0);
    	
    	return topCard;
    }
	
    
    //method to print the top few cards
    public void printTopCards(int noOfCardsToPrint)
    {
    	if(noOfCardsToPrint>this.noOfCards)
    	{
    		System.err.println("Invalid no of cards to print");
    		System.exit(1);
    	}
    	
    	for(int i=0;i<noOfCardsToPrint;i++)
    	{
    		System.out.printf("Card %2d:   %s \n",i+1,Deck.get(i).getNumberInString());
    	}
    }

}
