
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
				System.out.println("a");
			}

		public static void campfireRoom()
			{
				System.out.println("b");
			}

		public static void rewardRoom()
			{
				System.out.println("c");
			}

	}
