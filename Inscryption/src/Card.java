
public class Card
	{
//health, attack, attribute (enchantment), type
		private int cardHealth;
		private int cardAttack;
		private int cardCost;
		private String cardAttribute;
		private String cardType;
		private String cardName;

		public Card(int h, int a, int c, String b, String t, String n)
			{
				setCardHealth(h);
				setCardAttack(a);
				setCardCost(c);
				setCardAttribute(b);
				setCardType(t);
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

		public int getCardAttack()
			{
				return cardAttack;
			}

		public void setCardAttack(int cardAttack)
			{
				this.cardAttack = cardAttack;
			}

		public int getCardCost()
			{
				return cardCost;
			}

		public void setCardCost(int cardCost)
			{
				this.cardCost = cardCost;
			}

		public String getCardAttribute()
			{
				return cardAttribute;
			}

		public void setCardAttribute(String cardAttribute)
			{
				this.cardAttribute = cardAttribute;
			}

		public String getCardType()
			{
				return cardType;
			}

		public void setCardType(String cardType)
			{
				this.cardType = cardType;
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
