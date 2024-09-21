
public class Card
{
	private String suit;
	private String rank;
	
	// CONSTRUCTORS **********************************************************
	
	public Card()
	{
		this.suit = "A";
		this.rank = "C";
	}
	
	public Card(int i)
	{
		this.setRank(i);
		this.setSuit(i);
	}
	
	// ACCESSORS ************************************************************
	
	public String getRank()
	{
		return this.rank;
	}
	
	public String getSuit()
	{
		return this.suit;
	}
	
	// MUTATORS *************************************************************
	
	private void setRank(int i)
	{	
		int rankFormula = i % 13 + 1;
			
		if(rankFormula == 1)
		{
			this.rank = "A";
		}
		else if(rankFormula == 11)
		{
			this.rank = "J";
		}
		else if(rankFormula == 12)
		{
			this.rank = "Q";
		}
		else if(rankFormula == 13)
		{
			this.rank = "K";
		}
		else
		{
			this.rank = "" + rankFormula;
		}
	}
	
	private void setSuit(int i)
	{
		if(i / 13 == 0)
		{
			this.suit = "D";
		}
		
		if(i / 13 == 1)
		{
			this.suit = "C";
		}
		
		if(i / 13 == 2)
		{
			this.suit = "H";
		}
		
		if(i / 13 == 3)
		{
			this.suit = "S";
		}
	}
	
	// END MUTATORS ********************************************************
	
	public Card clone()
	{
		Card clone = new Card();
		clone.suit = this.getSuit();
		clone.rank = this.getRank();
		
		return clone;
	}
	
	public boolean equals(Card guest)
	{
		if(guest.toString().equals(this.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String s = this.getRank() + this.getSuit();
		
		return s;
	}
}
