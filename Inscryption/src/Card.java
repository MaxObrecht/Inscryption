
public class Card
	{
//health, attack, attribute (enchantment), type
		private int cardHealth;
		private int cardPower;
		private int cardBloodCost;
		private int cardBoneCost;
		private String cardSigil;
		private String cardTribe;
		private String cardName;

		public Card(int h, int p, int b, int o, String s, String t, String n)
			{
				setCardHealth(h);
				setCardPower(p);
				setCardBloodCost(b);
				setCardBoneCost(o);
				setCardSigil(s);
				setCardTribe(t);
				setCardName(n);
			}

		public int getCardHealth()
			{
				return cardHealth;
			}

		public void setCardHealth(int cardHealth)
			{
				this.cardHealth = cardHealth;
			}

		public int getCardPower()
			{
				return cardPower;
			}

		public void setCardPower(int cardPower)
			{
				this.cardPower = cardPower;
			}

		public int getCardBloodCost()
			{
				return cardBloodCost;
			}

		public void setCardBloodCost(int cardBloodCost)
			{
				this.cardBloodCost = cardBloodCost;
			}

		public int getCardBoneCost()
			{
				return cardBoneCost;
			}

		public void setCardBoneCost(int cardBoneCost)
			{
				this.cardBoneCost = cardBoneCost;
			}

		public String getCardSigil()
			{
				return cardSigil;
			}

		public void setCardSigil(String cardSigil)
			{
				this.cardSigil = cardSigil;
			}

		public String getCardTribe()
			{
				return cardTribe;
			}

		public void setCardTribe(String cardTribe)
			{
				this.cardTribe = cardTribe;
			}

		public String getCardName()
			{
				return cardName;
			}

		public void setCardName(String cardName)
			{
				this.cardName = cardName;
			}

	}
