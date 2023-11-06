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
							}
					}
				// board[0][0] = Deck.playerDeck.get(0);
				// board[0][3] = Deck.playerDeck.get(0);
				// board[2][0] = Deck.playerDeck.get(0);
			}

		public static void displayBoard()
			{
				placeArrowBoard();
				placeOpponentBoard();
				for (int i = 0; i < 2; i++)
					{
						System.out.println();
					}
				placePlayerBoard();
				playBoard();
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
								arrowCard[i] = board[0][i].getCardName();
								arrowCard[i + 4] = "________________";
								arrowCard[i + 8] = "            " + board[0][i].getCardBloodCost() + "C  ";
								arrowCard[i + 12] = "  " + board[0][i].getCardPower() + "P        "
										+ board[0][i].getCardHealth() + "H  ";
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
								opponentBoard[i] = board[1][i].getCardName();

								opponentBoard[i + 4] = "________________";
								opponentBoard[i + 8] = "            " + board[1][i].getCardBloodCost() + "C  ";
								opponentBoard[i + 12] = "                ";
								opponentBoard[i + 16] = "                ";
								opponentBoard[i + 20] = "                ";
								opponentBoard[i + 24] = "                ";
								opponentBoard[i + 28] = "                ";
								opponentBoard[i + 32] = "________________";
								opponentBoard[i + 36] = "  " + board[1][i].getCardPower() + "P        "
										+ board[1][i].getCardHealth() + "H  ";
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

		public static void placePlayerBoard()
			{
				String playerBoard[] = new String[40];
				for (int i = 0; i < 4; i++)
					{
						if (board[2][i] == null)
							{
								playerBoard[i] = "                ";
								playerBoard[i + 4] = "                ";
								playerBoard[i + 8] = "                ";
								playerBoard[i + 12] = "                ";
								playerBoard[i + 16] = "                ";
								playerBoard[i + 20] = "                ";
								playerBoard[i + 24] = "                ";
								playerBoard[i + 28] = "                ";
								playerBoard[i + 32] = "                ";
								playerBoard[i + 36] = "                ";
							}
						else
							{
								playerBoard[i] = board[2][i].getCardName();

								playerBoard[i + 4] = "________________";
								playerBoard[i + 8] = "            " + board[2][i].getCardBloodCost() + "C  ";
								playerBoard[i + 12] = "                ";
								playerBoard[i + 16] = "                ";
								playerBoard[i + 20] = "                ";
								playerBoard[i + 24] = "                ";
								playerBoard[i + 28] = "                ";
								playerBoard[i + 32] = "________________";
								playerBoard[i + 36] = "  " + board[2][i].getCardPower() + "P        "
										+ board[2][i].getCardHealth() + "H  ";
							}
					}
				System.out.println(
						"  ,-----------------,    ,-----------------,    ,-----------------,    ,-----------------,  ");
				System.out.println("  |" + playerBoard[0] + " |    |" + playerBoard[1] + " |    |" + playerBoard[2]
						+ " |    |" + playerBoard[3] + " | ");
				System.out.println("  |" + playerBoard[4] + " |    |" + playerBoard[5] + " |    |" + playerBoard[6]
						+ " |    |" + playerBoard[7] + " | ");
				System.out.println("  |" + playerBoard[8] + " |    |" + playerBoard[9] + " |    |" + playerBoard[10]
						+ " |    |" + playerBoard[11] + " |  ");
				System.out.println("  |" + playerBoard[12] + " |    |" + playerBoard[13] + " |    |" + playerBoard[14]
						+ " |    |" + playerBoard[15] + " | ");
				System.out.println("  |" + playerBoard[16] + " |    |" + playerBoard[17] + " |    |" + playerBoard[18]
						+ " |    |" + playerBoard[19] + " | ");
				System.out.println("  |" + playerBoard[20] + " |    |" + playerBoard[21] + " |    |" + playerBoard[22]
						+ " |    |" + playerBoard[23] + " | ");
				System.out.println("  |" + playerBoard[24] + " |    |" + playerBoard[25] + " |    |" + playerBoard[26]
						+ " |    |" + playerBoard[27] + " | ");
				System.out.println("  |" + playerBoard[28] + " |    |" + playerBoard[29] + " |    |" + playerBoard[30]
						+ " |    |" + playerBoard[31] + " | ");
				System.out.println("  |" + playerBoard[32] + " |    |" + playerBoard[33] + " |    |" + playerBoard[34]
						+ " |    |" + playerBoard[35] + " | ");
				System.out.println("  |" + playerBoard[36] + " |    |" + playerBoard[37] + " |    |" + playerBoard[38]
						+ " |    |" + playerBoard[39] + " | ");
				System.out.println(
						"  '-----------------'    '-----------------'    '-----------------'    '-----------------'  ");
			}

	}
