package Blackjack;

import java.util.ArrayList;

public class Player {
	
	private String playerName;
	//private int noOfCardsInHand;
	
	private ArrayList<Card> playerHand;
	
	//Constructor
	public Player(String playerName)
	{
		this.playerName=playerName;
		playerHand=new ArrayList<Card>();
		//noOfCardsInHand=0;
	}
	
	//Getter methods for each instance variable
	public String getPlayerName()
	{
		return this.playerName;
	}
	
	public int getNoOfCardsInHand()
	{
		return this.playerHand.size();
	}
	
	public ArrayList<Card> getPlayerHand()
	{
		return this.playerHand;
	}
	
	//method to add a card to players hand
	public boolean addCard(Card card)
	{
		if (this.playerHand.size()==10)
		{
			System.err.println("No of cards in hand couldn't exceed 10");
			System.exit(1);
		}
		
		playerHand.add(card);
		
		return (getSumOfHandCards()<=21);
	}
	
	public int getSumOfHandCards()
	{
		int sum=0;
		int countOfAces=0;
		int cardValue;
		
		//calculating sum of hand card
		for(Card c : this.playerHand)
		{
			cardValue=c.getNumber();
			
			if (cardValue==1)
			{
				sum+=11;
				countOfAces++;
			}
			
			else if (cardValue>10)
				sum+=10;	
			else 
				sum+=cardValue;
		}
		
		//if sum is greater than 21, convert each ace value from 11 to 1
		
		while(sum>21 && countOfAces>0)
		{
			sum-=10;
			countOfAces--;
		}
		
		return sum;
	}
	
	//method to print the cards curently in hand
	public void printHandCards(boolean firstCardVisible)
	{
		System.out.println("Hand cards for Player: " + this.getPlayerName());
		for(int i=0;i<this.playerHand.size();i++)
		{
			if(!firstCardVisible && i==0)
				System.out.println("Hidden Card");
			else
				System.out.println(playerHand.get(i).getNumberInString());
		}
	}
	
	

}
