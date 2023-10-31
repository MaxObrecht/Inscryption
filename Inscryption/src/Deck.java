import java.util.ArrayList;
import java.util.Collections;

public class Deck
	{
//arraylist of cards, pre-set opponent decks
		private ArrayList<Card> deckType;

		Deck(ArrayList<Card> d)
			{
				setDeckType(d);
			}

		public ArrayList<Card> getDeckType()
			{
				return deckType;
			}

		public void setDeckType(ArrayList<Card> deckType)
			{
				this.deckType = deckType;
			}

		static ArrayList<Card> stagnantSquirrelDeck = new ArrayList<Card>();
		// (int h, int a, int c, String b, String t, String n)

		public static void fillStagnantSquirrelDeck()
			{
				for (int i = 0; i < 10; i++)
					{
						stagnantSquirrelDeck.add(new Card(1, 0, 0, null, squirrel, SQUIRREL));
					}
			}

		static ArrayList<Card> squirrelDeck = new ArrayList<Card>();

		public static void fillSquirrelDeck()
			{
				for (int i = 0; i < stagnantSquirrelDeck.size(); i++)
					{
						squirrelDeck.add(stagnantSquirrelDeck.get(i));
					}
			}

		static ArrayList<Card> stagnantPlayerDeck = new ArrayList<Card>();
		static ArrayList<Card> playerDeck = new ArrayList<Card>();

		public static void fillStagnantStarterDeck()
			{
				stagnantPlayerDeck.add(new Card(2, 3, 2, null, dog, WOLF));
				stagnantPlayerDeck.add(new Card(1, 1, 1, null, null, OPPOSUM));
				stagnantPlayerDeck.add(new Card(3, 1, 1, null, null, STOAT));
				stagnantPlayerDeck.add(new Card(2, 1, 1, airBlock, reptile, BULLFROG));
			}

		public static void fillStarterDeck()
			{
				for (int i = 0; i < 4; i++)
					{
						playerDeck.add(stagnantPlayerDeck.get(i));
					}
			}

//		public static void shuffle()
//			{
//				Collections.shuffle("I wanna find some variable to put here");
//			}
	}
