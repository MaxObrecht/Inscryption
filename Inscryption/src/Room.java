import java.util.Scanner;

public class Room
	{
//type (opponent, shop, campfire, etc.)-- run method based on type

		public static void allRoom()
			{
				// int position = 0;
				for (int i = 0; i < Map.map.size(); i++)
					{
						if (Map.map.get(i).equals("opponent"))
							{
								opponentRoom();
							}
						else if (Map.map.get(i).equals("campfire"))
							{
								campfireRoom();
							}
						else if (Map.map.get(i).equals("reward"))
							{
								rewardRoom();
							}
					}

			}

		public static void opponentRoom()
			{
				boolean round = true;
				
				Deck.fillOpponentDeck();
				Deck.settingUpHand();
				Board.prepareBoard();

				while (round)
					{
						opponentMove();
						Board.displayBoard();
						playerMove();
					}
			}

		public static void campfireRoom()
			{
				System.out.println("b");
			}

		public static void rewardRoom()
			{
				System.out.println("c");
			}

		public static void opponentMove()
			{
				Board.board[0][0] = Deck.opponentDeck.get(0);
			}

		public static void playerMove()
			{
				Scanner userIntInput = new Scanner(System.in);

				System.out.println("How");
				int place = userIntInput.nextInt();
			}

	}
