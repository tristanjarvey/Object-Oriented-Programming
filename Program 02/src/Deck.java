
public class Deck
{
	private boolean[] deck = new boolean[52];
	
	public void initDeck()
	{
		for(int i = 0; i < this.deck.length; i++)
		{
			this.deck[i] = true;
		}
	}
	
	public boolean emptyDeck()
	{
		for(int i = 0; i < this.deck.length; i++)
		{
			if(this.deck[i] == true)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public int dealCard()
	{
		int card = (int)(Math.random()*52+0);
		while(this.deck[card] == false)
		{
			card = (int)(Math.random()*52+0);
		}
		
		this.deck[card] = false;
		
		return card;
	}
	
	public static String cardToString(int card)
	{
		int cardSuit = card / 13;
		String suit = cardSuit(cardSuit);
		int cardRank = card % 13 + 1;
		String rank = cardRank(cardRank);
		String cardComplete = rank + suit;
		
		return cardComplete;
	}
	
	public static String cardSuit(int suit)
	{
		String cardSuit = "";
		
		if (suit == 0)
		{
			cardSuit = "D";
		}
		if (suit == 1)
		{
			cardSuit = "H";
		}
		if (suit == 2)
		{
			cardSuit = "S";
		}
		if (suit == 3)
		{
			cardSuit = "C";
		}
		
		return cardSuit;
	}
	
	public static String cardRank(int rank)
	{
		String cardRank;
		
		if(rank == 1)
		{
			cardRank = "A";
		}
		else if(rank == 11)
		{
			cardRank = "J";
		}
		else if(rank == 12)
		{
			cardRank = "Q";
		}
		else if(rank == 13)
		{
			cardRank = "K";
		}
		else
		{
			cardRank = "" + rank;
		} 
		
		return cardRank;
	}
}