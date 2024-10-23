import java.util.Scanner;

public class DeckDriver
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		Deck deck = new Deck();
		
		deck.shuffleDeck();
		
		int cardsThisRow = 0;
		final int cardsPerRow = 13;
		
		for(int i = 0; i < 52; i++)
		{
			cardsThisRow++;
			if(cardsThisRow <= cardsPerRow)
			{
				System.out.print(deck.dealCard() + " ");
			}
			else
			{
				System.out.println();
				cardsThisRow = 1;
				System.out.print(deck.dealCard() + " ");
			}
		}
		
		deck.collectAllCards();
		
		String response;
		System.out.print("\n\nWould you like to reshuffle the deck? ('y' for yes, 'n' for "
				+ "no): ");
		response = stdIn.next();
		
		if(response.equals("y"))
		{	
			int swapCnt;
			System.out.print("How many times would you like to shuffle? ");
			swapCnt = stdIn.nextInt();
			deck.shuffleDeck(swapCnt);
			
			cardsThisRow = 0;
			
			for(int i = 0; i < 52; i++)
			{
				cardsThisRow++;
				if(cardsThisRow <= cardsPerRow)
				{
					System.out.print(deck.dealCard() + " ");
				}
				else
				{
					System.out.println();
					cardsThisRow = 1;
					System.out.print(deck.dealCard() + " ");
				}
			}
		}
	}
}
