public class Board
	{
		// visual board for fights, should show things like items, scale, etc.
		// method that sets board and displays board
		static Card board[][] = new Card[3][4];

		public static void prepareBoard()
			{
				for (int row = 0; row < board.length; row++)
					{
						for (int col = 0; col < board[0].length; col++)
							{
								board[row][col] = null;
								// board[row][col] = Deck.playerDeck.get(0);
							}
					}
				// board[0][0] = Deck.playerDeck.get(0);
			}

		public static void displayBoard()
			{
				placeArrowBoard();
				placeOpponentBoard();
			}

		public static void playBoard()
			{

			}

		public static void placeArrowBoard()
			{
				String arrowCard[] = new String[16];
				for (int i = 0; i < 4; i++)
					{
						if (board[0][i] == null)
							{
								arrowCard[i] = "        |       ";
								arrowCard[i + 4] = "        |       ";
								arrowCard[i + 8] = "        |       ";
								arrowCard[i + 12] = "        V       ";
							}
						else
							{
								arrowCard[i] = arrowCard[0] = Deck.playerDeck.get(0).getCardName();
								arrowCard[i + 4] = "                ";
								arrowCard[i + 8] = "                ";
								arrowCard[i + 12] = "                ";
							}
					}

				System.out.println(
						"  ,-----------------,    ,-----------------,    ,-----------------,    ,-----------------,  ");
				System.out.println("  |" + arrowCard[0] + " |    |" + arrowCard[1] + " |    |" + arrowCard[2]
						+ " |    |" + arrowCard[3] + " |  ");
				System.out.println("  |" + arrowCard[4] + " |    |" + arrowCard[5] + " |    |" + arrowCard[6]
						+ " |    |" + arrowCard[7] + " |  ");
				System.out.println("  |" + arrowCard[8] + " |    |" + arrowCard[9] + " |    |" + arrowCard[10]
						+ " |    |" + arrowCard[11] + " |  ");
				System.out.println("  |" + arrowCard[12] + " |    |" + arrowCard[13] + " |    |" + arrowCard[14]
						+ " |    |" + arrowCard[15] + " |  ");
				System.out.println(
						"  '-----------------'    '-----------------'    '-----------------'    '-----------------'  ");
			}

		public static void placeOpponentBoard()
			{
				String opponentBoard[] = new String[40];
				for (int i = 0; i < 4; i++)
					{
						if (board[1][i] == null)
							{
								opponentBoard[i] = "                ";
								opponentBoard[i + 4] = "                ";
								opponentBoard[i + 8] = "                ";
								opponentBoard[i + 12] = "                ";
								opponentBoard[i + 16] = "                ";
								opponentBoard[i + 20] = "                ";
								opponentBoard[i + 24] = "                ";
								opponentBoard[i + 28] = "                ";
								opponentBoard[i + 32] = "                ";
								opponentBoard[i + 36] = "                ";
							}
						else
							{
								opponentBoard[i] = Deck.playerDeck.get(i).getCardName();

								opponentBoard[i + 4] = "________________";
								opponentBoard[i + 8] = "            " + Deck.playerDeck.get(i).getCardBloodCost()
										+ "C  ";
								opponentBoard[i + 12] = "                ";
								opponentBoard[i + 16] = "                ";
								opponentBoard[i + 20] = "                ";
								opponentBoard[i + 24] = "                ";
								opponentBoard[i + 28] = "                ";
								opponentBoard[i + 32] = "________________";
								opponentBoard[i + 36] = "  " + Deck.playerDeck.get(i).getCardPower() + "P        "
										+ Deck.playerDeck.get(i).getCardHealth() + "H  ";
							}
					}
				System.out.println(
						"  ,-----------------,    ,-----------------,    ,-----------------,    ,-----------------,  ");
				System.out.println("  |" + opponentBoard[0] + " |    |" + opponentBoard[1] + " |    |"
						+ opponentBoard[2] + " |    |" + opponentBoard[3] + " | ");
				System.out.println("  |" + opponentBoard[4] + " |    |" + opponentBoard[5] + " |    |"
						+ opponentBoard[6] + " |    |" + opponentBoard[7] + " | ");
				System.out.println("  |" + opponentBoard[8] + " |    |" + opponentBoard[9] + " |    |"
						+ opponentBoard[10] + " |    |" + opponentBoard[11] + " |  ");
				System.out.println("  |" + opponentBoard[12] + " |    |" + opponentBoard[13] + " |    |"
						+ opponentBoard[14] + " |    |" + opponentBoard[15] + " | ");
				System.out.println("  |" + opponentBoard[16] + " |    |" + opponentBoard[17] + " |    |"
						+ opponentBoard[18] + " |    |" + opponentBoard[19] + " | ");
				System.out.println("  |" + opponentBoard[20] + " |    |" + opponentBoard[21] + " |    |"
						+ opponentBoard[22] + " |    |" + opponentBoard[23] + " | ");
				System.out.println("  |" + opponentBoard[24] + " |    |" + opponentBoard[25] + " |    |"
						+ opponentBoard[26] + " |    |" + opponentBoard[27] + " | ");
				System.out.println("  |" + opponentBoard[28] + " |    |" + opponentBoard[29] + " |    |"
						+ opponentBoard[30] + " |    |" + opponentBoard[31] + " | ");
				System.out.println("  |" + opponentBoard[32] + " |    |" + opponentBoard[33] + " |    |"
						+ opponentBoard[34] + " |    |" + opponentBoard[35] + " | ");
				System.out.println("  |" + opponentBoard[36] + " |    |" + opponentBoard[37] + " |    |"
						+ opponentBoard[38] + " |    |" + opponentBoard[39] + " | ");
				System.out.println(
						"  '-----------------'    '-----------------'    '-----------------'    '-----------------'  ");
			}

	}
