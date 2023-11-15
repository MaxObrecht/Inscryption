import java.util.Scanner;

public class Room
	{
//type (opponent, shop, campfire, etc.)-- run method based on type
		static Scanner userIntInput = new Scanner(System.in);

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
				Player.setPlayers();
				Deck.fillOpponentDeck();
				Deck.fillPlayerDeck();
				Deck.fillSquirrelDeck();
				// Deck.settingUpHand();
				Board.prepareBoard();
				for (int i = 0; i < 3; i++)
					{
						Deck.playerHand.add(Deck.playerDeck.get(0));
						Deck.playerDeck.remove(0);
					}
				Deck.playerHand.add(Deck.squirrelDeck.get(0));
				Deck.squirrelDeck.remove(0);
				Deck.showHand();

				while (round)
					{
						opponentMove();
						Board.displayBoard();
						playerDraw();
						playerPlace();
						Board.displayBoard();
						attack();
						opponentCardDrop();
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
				int randomOpponentCard = (int) (Math.random() * Deck.opponentDeck.size());
				int randCol = (int) (Math.random() * 4);
				if (Deck.opponentDeck.size() > 0)
					{
						if (Board.board[0][randCol] == null)
							{
								Board.board[0][randCol] = Deck.opponentDeck.get(randomOpponentCard);
								Deck.opponentDeck.remove(randomOpponentCard);
							}
						else if (Board.board[0][randCol] != null && Board.board[1][randCol] == null)
							{
								Board.board[1][randCol] = Board.board[0][randCol];
								Board.board[0][randCol] = Deck.opponentDeck.get(randomOpponentCard);
								Deck.opponentDeck.remove(randomOpponentCard);
							}
						else if (Board.board[0][0] != null && Board.board[0][1] != null && Board.board[0][2] != null
								&& Board.board[0][3] != null && Board.board[1][0] != null && Board.board[1][1] != null
								&& Board.board[1][2] != null && Board.board[1][3] != null)
							{

							}
						else
							{
								opponentMove();
							}
					}

			}

		public static void playerDraw()
			{

				System.out.println("Do you draw from your creatures (1), or draw a squirrel (2)");
				int deckChoice = userIntInput.nextInt();
				if (deckChoice == 1 && Deck.playerDeck.size() < 1)
					{
						System.out.println("Out of cards");
						playerDraw();
					}
				else if (deckChoice == 2 && Deck.squirrelDeck.size() < 1)
					{
						System.out.println("Out of cards");
						playerDraw();
					}
				else if (deckChoice == 1 && Deck.playerDeck.size() < 1 && deckChoice == 2
						&& Deck.squirrelDeck.size() < 1)
					{
						System.out.println("Out of cards");
					}
				else if (deckChoice == 1 && Deck.playerHand.size() > 0)
					{
						Deck.playerHand.add(Deck.playerDeck.get(0));
						Deck.playerDeck.remove(0);
					}
				else if (deckChoice == 2 && Deck.squirrelDeck.size() > 0)
					{
						Deck.playerHand.add(Deck.squirrelDeck.get(0));
						Deck.squirrelDeck.remove(0);
					}
				else
					{
						playerDraw();
					}
				Deck.showHand();

			}

		public static void playerPlace()
			{
				if (Deck.playerHand.size() > 0)
					{
						System.out.println("What do you want to place?");
						int cardChoice = userIntInput.nextInt();

						System.out.println("Where do you want to place it? (1-4)");
						int placeChoice = userIntInput.nextInt();

						if (Board.board[2][placeChoice - 1] == null)
							{
								Board.board[2][placeChoice - 1] = Deck.playerHand.get(cardChoice - 1);
								Deck.playerHand.remove(cardChoice - 1);
							}
						else
							{
								System.out.println("Can't place there");
								playerPlace();
							}
					}
				else
					{
						System.out.println("There is nothing to play");
					}
			}

		public static void attack()
			{
				for (int i = 0; i < 4; i++)
					{
						if (Board.board[2][i] != null)
							{
								if (Board.board[1][i] == null)
									{
										Player.people.get(0).setScale(
												Player.people.get(0).getScale() + Board.board[2][i].getCardPower());
									}
								else
									{
										Board.board[1][i].setCardHealth(Board.board[1][i].getCardHealth() - Board.board[2][i].getCardPower());
										if (Board.board[1][i].getCardHealth() == 0)
											{
												Board.board[1][i] = null;
											}
									}
							}
						
						if (Board.board[1][i] != null)
							{
								if (Board.board[2][i] == null)
									{
										Player.people.get(0).setScale(
												Player.people.get(0).getScale() - Board.board[1][i].getCardPower());
									}
								else
									{
										Board.board[2][i].setCardHealth(Board.board[2][i].getCardHealth() - Board.board[1][i].getCardPower());
										if (Board.board[2][i].getCardHealth() == 0)
											{
												Board.board[2][i] = null;
											}
									}
							}
					}
			}

		public static void opponentCardDrop()
			{
				for (int i = 0; i < 4; i++)
					{
						if (Board.board[0][i] != null && Board.board[1][i] == null)
							{
								Board.board[1][i] = Board.board[0][i];
								Board.board[0][i] = null;
							}
					}
			}

	}
