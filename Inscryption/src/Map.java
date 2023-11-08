import java.util.ArrayList;

public class Map
	{
		// randomly generated paths of rooms
		// methods that sets map and displays map

		static ArrayList<String> map = new ArrayList<String>();

		public static void fillMap()
			{
				boolean fillingRoom = true;
				int check = 0;
				String lastRoom = "a";
				while (fillingRoom)
					{
						int randomRoom = (int) (Math.random() * 10) + 1;
						if (randomRoom > 0 && randomRoom < 5)
							{
								map.add("opponent");
								lastRoom = "o";
								check = check + 1;
							}
						else if (randomRoom > 6 && randomRoom < 8 && !lastRoom.equals("c"))
							{
								map.add("campfire");
								lastRoom = "c";
								check = check + 1;
							}
						else if (randomRoom > 7 && randomRoom < 11 && !lastRoom.equals("r"))
							{
								map.add("reward");
								lastRoom = "r";
								check = check + 1;
							}

						if (check == 10)
							{
								fillingRoom = false;
							}
					}
			}

		public static void playMap()
			{
				Map.fillMap();
				Room.allRoom();
			}

	}
