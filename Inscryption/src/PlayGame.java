
public class PlayGame
	{

		public static void main(String[] args)
			{
				Deck.fillAllCard();
				Deck.fillStagnantPlayerDeck();
				Map.fillMap();
				Room.allRoom();
			}

		public static void test()
			{
				for (int i = 0; i < Deck.opponentDeck.size(); i++)
					{
						System.out.println(Deck.opponentDeck.get(i).getCardName());
					}
			}

	}
