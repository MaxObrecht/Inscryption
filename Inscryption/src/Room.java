import java.util.Scanner;

public class Room
	{
//type (opponent, shop, campfire, etc.)-- run method based on type
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);

		public static void allRoom()
			{
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
						Board.screenWipe();
						Deck.showHand();
						Board.displayBoard();
						playerDraw();
						playerPlace();
						Board.screenWipe();
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
				boolean placing = true;
				while (placing)
					{
						if (Deck.playerHand.size() > 0)
							{
								System.out.println("Do you want to play a card? (y/n)");
								String playACard = userStringInput.nextLine();

								if (playACard.equalsIgnoreCase("y"))
									{
										System.out.println("What do you want to place?");
										int cardChoice = userIntInput.nextInt();

										if (Deck.playerHand.get(cardChoice - 1).getCardBloodCost() > 0)
											{
												for (int i = 0; i < Deck.playerHand.get(cardChoice - 1)
														.getCardBloodCost(); i++)
													{
														System.out.println(
																"What card do you sacrifice? (1-4) (5 to leave)");
														int cardSacrifice = userIntInput.nextInt();

														if (cardSacrifice < 5)
															{
																Board.board[2][cardSacrifice - 1] = null;
															}
														else
															{
																playerPlace();
															}
													}
											}

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
							}
						else
							{
								System.out.println("There is nothing to play");
							}

						Board.screenWipe();
						Board.displayBoard();

						System.out.println("End turn? (y/n)");
						String endGame = userStringInput.nextLine();

						if (endGame.equalsIgnoreCase("y"))
							{
								placing = false;
							}

						Board.screenWipe();
						Board.displayBoard();
						Deck.showHand();
					}

			}

		public static void attack()
			{
				int playerDamage = 0;
				int opponentDamage = 0;

				for (int i = 0; i < 4; i++)
					{
						if (Board.board[2][i] != null)
							{
								if (Board.board[1][i] == null)
									{
										Player.people.get(0).setScale(
												Player.people.get(0).getScale() + Board.board[2][i].getCardPower());
										playerDamage = playerDamage + Board.board[2][i].getCardPower();
									}
								else
									{
										Board.board[1][i].setCardHealth(
												Board.board[1][i].getCardHealth() - Board.board[2][i].getCardPower());
										if (Board.board[1][i].getCardHealth() < 1)
											{
												Board.board[1][i] = null;
											}
										playerDamage = playerDamage + Board.board[2][i].getCardPower();
									}
							}

						if (Board.board[1][i] != null)
							{
								if (Board.board[2][i] == null)
									{
										Player.people.get(0).setScale(
												Player.people.get(0).getScale() - Board.board[1][i].getCardPower());
										opponentDamage = opponentDamage + Board.board[1][i].getCardPower();
									}
								else
									{
										Board.board[2][i].setCardHealth(
												Board.board[2][i].getCardHealth() - Board.board[1][i].getCardPower());
										if (Board.board[2][i].getCardHealth() < 1)
											{
												Board.board[2][i] = null;
											}
										opponentDamage = opponentDamage + Board.board[1][i].getCardPower();
									}
							}
					}
//				System.out.println("You did " + playerDamage + " damage");
//				System.out.println(opponentDamage + " was dealt");
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
