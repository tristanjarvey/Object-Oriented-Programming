
public class DeckDriver
{
	public static void main(String[] args)
	{
		Deck myDeck = new Deck();
//		SmartDeck myDeck = new SmartDeck();
		final int cardsPerRow = 8;
		int cardsThisRow = 0;
		int myCard;
		myDeck.initDeck();
		System.out.println("\nHere is a shuffled deck ...\n");
		while (!myDeck.emptyDeck())
		{
			myCard = myDeck.dealCard();
			String myCardDisplay = myDeck.cardToString(myCard);
			++cardsThisRow;
			if (cardsThisRow <= cardsPerRow)
			{
				System.out.print(myCardDisplay);
				System.out.print(" ");
			}
			else
			{
				System.out.println("");
				cardsThisRow = 1;
				System.out.print(myCardDisplay);
				System.out.print(" ");
			}
		}
		
		System.out.println('\n');
	}
}