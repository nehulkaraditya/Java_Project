package Blackjack;

public class Card {
	
	private String suit;
	private int number;
	
	public Card(String suit, int number)
	{
		this.suit=suit.toUpperCase();
		this.number=number;
	}
	
	
	public String getSuit()
	{
		return suit;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getNumberInString()
	{
		String numberString;
		
		if(number==1)
			numberString= "Ace";
		else if(number==2)
		    numberString= "Two";
		else if(number==3)
		    numberString= "Three";
		else if(number==4)
		    numberString= "Four";
		else if(number==5)
		    numberString= "Five";
		else if(number==6)
		    numberString= "Six";
		else if(number==7)
		    numberString= "Seven";
		else if(number==8)
		    numberString= "Eight";
		else if(number==9)
		    numberString= "Nine";
		else if(number==10)
		    numberString= "Ten";
		else if(number==11)
		    numberString= "Jack";
		else if(number==12)
		    numberString= "Queen";
		else if(number==13)
		    numberString= "King";
		else 
			numberString= "Invalid Card Number";
		
		return numberString + " of " + suit;
			
	}

}
