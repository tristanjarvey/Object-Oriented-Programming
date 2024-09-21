
public class CardDriver
{
	public static void main(String[] args)
	{
		Card[] deck = new Card[52];
		
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = new Card(i);
		}
		
		for(int i = 0; i <= 100; i++)
		{
			int a = (int)(Math.random()*52+0);
			int b = (int)(Math.random()*52+0);
			Card temp = new Card();
			
			temp = deck[a].clone();
			deck[a] = deck[b].clone();
			deck[b] = temp.clone();
		}
		
		int cardsThisRow = 0;
		final int cardsPerRow = 13;
		int queenOfClubsIndex = -1;
		
		Card queenOfClubs = new Card(24);
		
		for(int i = 0; i < deck.length; i++)
		{
			String card = deck[i].toString();
			
			cardsThisRow++;
			if(cardsThisRow <= cardsPerRow)
			{
				System.out.print(card + " ");
			}
			else
			{
				System.out.println();
				cardsThisRow = 1;
				System.out.print(card + " ");
			}
			
			if(deck[i].equals(queenOfClubs))
			{
				queenOfClubsIndex = i;
			}
		}
		
		System.out.print("\n\nThe Queen of Clubs was found at index " + 
				queenOfClubsIndex + " (i.e. location " + (queenOfClubsIndex + 1) + 
					" in the deck)");
	}
}
