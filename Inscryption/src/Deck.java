import java.util.ArrayList;
import java.util.Collections;

public class Deck
	{
		// arraylist of cards, pre-set decks
		static ArrayList<Card> allCard = new ArrayList<Card>();

		static ArrayList<Card> avian = new ArrayList<Card>();
		static ArrayList<Card> canine = new ArrayList<Card>();
		static ArrayList<Card> hooved = new ArrayList<Card>();
		static ArrayList<Card> insect = new ArrayList<Card>();
		static ArrayList<Card> reptile = new ArrayList<Card>();
		static ArrayList<Card> misc = new ArrayList<Card>();

		static ArrayList<Card> squirrelDeck = new ArrayList<Card>();

		static ArrayList<Card> stagnantPlayerDeck = new ArrayList<Card>();
		static ArrayList<Integer> stagnantPlayerDeckInt = new ArrayList<Integer>();
		static ArrayList<Card> playerDeck = new ArrayList<Card>();
		static ArrayList<Card> playerHand = new ArrayList<Card>();
		static ArrayList<Card> opponentDeck = new ArrayList<Card>();
		static ArrayList<Integer> preOpponentDeck = new ArrayList<Integer>();

		static ArrayList<Card> rewardOneBlood = new ArrayList<Card>();
		static ArrayList<Card> rewardTwoBlood = new ArrayList<Card>();
		static ArrayList<Card> rewardThreeBlood = new ArrayList<Card>();
		static ArrayList<Card> rewardOneBone = new ArrayList<Card>();
		static ArrayList<Card> rewardTwoBone = new ArrayList<Card>();
		static ArrayList<Card> rewardThreeBone = new ArrayList<Card>();

		public static void fillAllCard()
			{
				// health, attack, cost, cost
				// Avian down 0-5
				allCard.add(new Card(1, 1, 1, 0, "swimAndFly", "avian", "   KINGFISHER   "));
				allCard.add(new Card(2, 0, 1, 0, "grow", "avian", "   RAVEN EGG    "));
				allCard.add(new Card(2, 1, 1, 0, "fly", "avian", "    SPARROW     "));
				allCard.add(new Card(1, 1, 2, 0, "searchAndFly", "avian", "     MAGPIE     "));
				allCard.add(new Card(3, 2, 2, 0, "fly", "avian", "     RAVEN      "));
				allCard.add(new Card(3, 3, 0, 8, "fly", "avian", " TURKEY VULTURE "));
				// Canine down 6-11
				allCard.add(new Card(2, 2, 1, 0, null, "canine", "  STUNTED WOLF  "));
				allCard.add(new Card(1, 1, 1, 0, "grow", "canine", "    WOLF CUB    "));
				allCard.add(new Card(2, 3, 2, 0, null, "canine", "      WOLF      "));
				allCard.add(new Card(3, 2, 2, 0, "toLastCard", "canine", "   BLOODHOUND   "));
				allCard.add(new Card(1, 2, 0, 4, null, "canine", "     COYOTE     "));
				allCard.add(new Card(2, 1, 0, 4, "inspireEachSide", "canine", "      ALPHA     "));
				// Hooved down 12-16
				allCard.add(new Card(1, 0, 1, 0, "primeMeat", "hooved", "   BLACK GOAT   "));
				allCard.add(new Card(1, 1, 1, 0, "growAndMove", "hooved", "    ELK FAWN    "));
				allCard.add(new Card(4, 2, 2, 0, "move", "hooved", "       ELK       "));
				allCard.add(new Card(3, 1, 2, 0, "hitEachSideAndMove", "hooved", "    PRONGHORN   "));
				allCard.add(new Card(7, 3, 3, 0, "push", "hooved", "    MOOSE BUCK  "));
				// Insect down 17-25
				allCard.add(new Card(1, 1, 1, 0, "hitEachSide", "insect", "     MANTIS     "));
				allCard.add(new Card(1, 0, 1, 0, null, "insect", "    RING WORM   "));
				allCard.add(new Card(2, 1, 0, 2, "stink", "insect", "     STINKBUG   "));
				allCard.add(new Card(1, 1, 0, 4, "returnToHand", "insect", "   COCKROACH    "));
				allCard.add(new Card(2, 1, 0, 5, "playOnDeath", "insect", " CORPSE MAGGOTS "));
				allCard.add(new Card(2, 0, 1, 0, "bringBees", "insect", "     BEEHIVE    "));
				allCard.add(new Card(1, 1, 0, 0, "fly", "insect", "BEE"));
				allCard.add(new Card(3, 0, 1, 0, "grow", "insect", " STRANGE LARVA  "));
				allCard.add(new Card(1, 1, 1, 0, "hitThreeSides", "insect", "   MANTIS GOD   "));
				// Reptile below 26-32
				allCard.add(new Card(2, 1, 1, 0, "airBlock", "reptile", "    BULLFROG    "));
				allCard.add(new Card(2, 1, 1, 0, "tail", "reptile", "     SKINK      "));
				allCard.add(new Card(1, 1, 2, 0, "poison", "reptile", "     ADDER      "));
				allCard.add(new Card(6, 1, 2, 0, null, "reptile", "  RIVER SNAPPER "));
				allCard.add(new Card(1, 3, 0, 6, null, "reptile", "    RATTLER     "));
				allCard.add(new Card(1, 1, 2, 0, "returnToHand", "reptile", "    OUROBOROS   "));
				allCard.add(new Card(1, 1, 0, 0, null, "reptile", "       GECK     "));
				// Misc below 33-36
				allCard.add(new Card(1, 0, 1, 0, "eternalLife", "misc", "      CAT       "));
				allCard.add(new Card(3, 1, 1, 0, null, null, "      STOAT     "));
				allCard.add(new Card(1, 1, 0, 2, null, null, "    OPOSSUM     "));
				allCard.add(new Card(1, 0, 0, 0, null, null, "    SQUIRREL    "));
			}

		public static void fillSquirrelDeck()
			{
				for (int i = 0; i < 10; i++)
					{
						//squirrelDeck.add(allCard.get(36));
								squirrelDeck.add(new Card(allCard.get(36).getCardHealth(),
										allCard.get(36).getCardPower(),
										allCard.get(36).getCardBloodCost(),
										allCard.get(36).getCardBoneCost(),
										allCard.get(36).getCardSigil(),
										allCard.get(36).getCardTribe(),
										allCard.get(36).getCardName()));
					}
			}

		public static void clearSquirrelDeck()
			{
				for (int i = squirrelDeck.size(); i > 0; i--)
					{
						squirrelDeck.remove(i);
					}
			}

		public static void fillStagnantPlayerDeck()
			{
				stagnantPlayerDeckInt.add(8);
				stagnantPlayerDeckInt.add(35);
				stagnantPlayerDeckInt.add(34);
				stagnantPlayerDeckInt.add(26);
			}

		public static void fillPlayerDeck()
			{
				for (int i = 0; i < stagnantPlayerDeckInt.size(); i++)
					{
						playerDeck.add(new Card(allCard.get(stagnantPlayerDeckInt.get(i)).getCardHealth(),
								allCard.get(stagnantPlayerDeckInt.get(i)).getCardPower(),
								allCard.get(stagnantPlayerDeckInt.get(i)).getCardBloodCost(),
								allCard.get(stagnantPlayerDeckInt.get(i)).getCardBoneCost(),
								allCard.get(stagnantPlayerDeckInt.get(i)).getCardSigil(),
								allCard.get(stagnantPlayerDeckInt.get(i)).getCardTribe(),
								allCard.get(stagnantPlayerDeckInt.get(i)).getCardName()));
					}
				Collections.shuffle(playerDeck);
			}

		public static void clearPlayerDeck()
			{
				for (int i = playerDeck.size(); i > 0; i--)
					{
						playerDeck.remove(i);
					}
			}

		public static void settingUpHand()
			{
				fillSquirrelDeck();
				fillPlayerDeck();
			}

		public static void showHand()
			{
				int counter = 1;
				System.out.println("Your hand: ");
				for (int i = 0; i < playerHand.size(); i++)
					{
						System.out.println(counter + ". " + playerHand.get(i).getCardName()
								+ playerHand.get(i).getCardBloodCost());
						counter = counter + 1;
					}
			}

		public static void fillStagnantRewardOneBlood()
			{

			}

		public static void fillOpponentDeck()
			{
				OpponentDeckOne();

				for (int i = 0; i < preOpponentDeck.size(); i++)
					{
						opponentDeck.add(new Card(allCard.get(preOpponentDeck.get(i)).getCardHealth(),
								allCard.get(preOpponentDeck.get(i)).getCardPower(),
								allCard.get(preOpponentDeck.get(i)).getCardBloodCost(),
								allCard.get(preOpponentDeck.get(i)).getCardBoneCost(),
								allCard.get(preOpponentDeck.get(i)).getCardSigil(),
								allCard.get(preOpponentDeck.get(i)).getCardTribe(),
								allCard.get(preOpponentDeck.get(i)).getCardName()));
					}
				Collections.shuffle(opponentDeck);

			}

		public static void OpponentDeckOne()
			{
				//preOpponentDeck.add(13);
				//preOpponentDeck.add(8);
				preOpponentDeck.add(8);
				preOpponentDeck.add(26);
				preOpponentDeck.add(26);
			}
	}
