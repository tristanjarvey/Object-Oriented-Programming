
public class Deck
{
	// all new instance variables and methods in this class
	
	private Card[] deck = new Card[52];
	private int cardsDealt; // may only be accessed via accessors and mutators
	
	// CONSTRUCTORS **********************************************************
	
	public Deck()
	{
		for(int i = 0; i < this.deck.length; i++)
		{
			this.deck[i] = new Card(i);
		}
		
		setCardsDealt(0);
	}
	
	// ACCESSORS ************************************************************
	
	public int getCardsDealt()
	{
		return this.cardsDealt;
	}
	
	// MUTATORS *************************************************************
	
	private void setCardsDealt(int cardsDealt)
	{
		this.cardsDealt = cardsDealt;
	}
	
	public void collectAllCards()
	{
		this.cardsDealt = 0;
	}
	
	// ALL OTHER ************************************************************
	
	public boolean isEmptyDeck()
	{
		if(getCardsDealt() == 52)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Card dealCard()
	{
		if(!(isEmptyDeck()))
		{
			int currentValue = getCardsDealt();
			setCardsDealt(currentValue + 1);
			return deck[currentValue];
		}
		else
		{
			return null;
		}
	}
	
	public void shuffleDeck()
	{
		for(int i = 0; i <= 100; i++)
		{
			int a = (int)(Math.random()*52+0);
			int b = (int)(Math.random()*52+0);
			Card temp = new Card();
			
			temp = deck[a].clone();
			deck[a] = deck[b].clone();
			deck[b] = temp.clone();
		}
	}
	
	public void shuffleDeck(int swapCnt)
	{
		for(int i = 0; i <= swapCnt; i++)
		{
			int a = (int)(Math.random()*52+0);
			int b = (int)(Math.random()*52+0);
			Card temp = new Card();
			
			temp = deck[a].clone();
			deck[a] = deck[b].clone();
			deck[b] = temp.clone();
		}
		
		System.out.print("\nCards shuffled by performing " + swapCnt + " card swaps\n\n");
	}
}
