
public class Program01
{
	public static void main(String[] args)
	{
//		DON'T MODIFY THE CODE BELOW THIS LINE
		boolean[] myDeck = new boolean[52];
		
		final int cardsPerRow = 8;
		int cardsThisRow = 0;
		int myCard;
		initDeck(myDeck);
		System.out.println("\nHere is a shuffled deck ...\n");
		while (!emptyDeck(myDeck))
		{
			myCard = dealCard(myDeck);
			++cardsThisRow;
			if (cardsThisRow <= cardsPerRow)
			{
				printCard(myCard);
				System.out.print(" ");
			}
			else
			{
				System.out.println("");
				cardsThisRow = 1;
				printCard(myCard);
				System.out.print(" ");
			}
		}
		
		System.out.println('\n');
//		DON'T MODIFY THE CODE ABOVE THIS LINE
	}
	
	public static void initDeck(boolean[] deck)
	{
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = true;
		}
	}
	
	public static boolean emptyDeck(boolean[] deck)
	{
		for(int i = 0; i < deck.length; i++)
		{
			if(deck[i] == true)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static int dealCard(boolean[] deck)
	{
		int card = (int)(Math.random()*52+0);
		while(deck[card] == false)
		{
			card = (int)(Math.random()*52+0);
		}
		
		deck[card] = false;
		
		return card;
	}
	
	public static void printCard(int card)
	{
		int cardSuit = card / 13;
		String suit = cardSuit(cardSuit);
		int cardRank = card % 13 + 1;
		String rank = cardRank(cardRank);
		String cardComplete = rank + suit;
		
		System.out.print(cardComplete);
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
