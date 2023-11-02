
public class PlayGame
	{

		public static void main(String[] args)
			{
				oneTimeSettingUpHand();
				settingUpHand();
				playMap();
			}

		public static void oneTimeSettingUpHand()
			{
				Deck.fillAllCard();
				Deck.fillStagnantPlayerDeck();
			}

		public static void settingUpHand()
			{
				Deck.fillSquirrelDeck();
				Deck.fillPlayerDeck();
			}

		public static void playMap()
			{
				Map.fillMap();
				Room.allRoom();
			}

	}
