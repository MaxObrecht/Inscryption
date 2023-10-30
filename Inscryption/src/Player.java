
public class Player
	{
//Deck, Item, Totem, Candle, Scale
		private Deck deck;
		private Item item;
		private Totem totem;
		private int candle;
		private int scale;

		public Player(Deck d, Item i, Totem t, int c, int s)
			{
				setDeck(d);
				setItem(i);
				setTotem(t);
				setCandle(c);
				setScale(s);;
			}

		public Deck getDeck()
			{
					return deck;
			}

		public void setDeck(Deck deck)
			{
					this.deck = deck;
			}

		public Item getItem()
			{
					return item;
			}

		public void setItem(Item item)
			{
					this.item = item;
			}

		public Totem getTotem()
			{
					return totem;
			}

		public void setTotem(Totem totem)
			{
					this.totem = totem;
			}

		public int getCandle()
			{
					return candle;
			}

		public void setCandle(int candle)
			{
					this.candle = candle;
			}

		public int getScale()
			{
					return scale;
			}

		public void setScale(int scale)
			{
					this.scale = scale;
			}

		

	}
