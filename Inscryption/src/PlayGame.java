
public class PlayGame
	{

		public static void main(String[] args)
			{
				oneTimeSettingUpHand();
				Player.setPlayer();
				Map.playMap();
				Room.opponentRoom();
				// test();

			}

		public static void oneTimeSettingUpHand()
			{
				Deck.fillAllCard();
				Deck.fillStagnantPlayerDeck();
			}

		
		

		public static void test()
			{
				for (int i = 0; i < Deck.opponentDeck.size(); i++)
					{
						System.out.println(Deck.opponentDeck.get(i).getCardName());
					}
			}

	}
