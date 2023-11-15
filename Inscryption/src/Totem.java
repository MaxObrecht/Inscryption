
public class Totem
	{
//type, attribute
		private String totemType;
		private String totemAttribute;

		Totem(String t, String a)
			{
				setTotemType(t);
				setTotemAttribute(a);
			}

		public String getTotemType()
			{
				return totemType;
			}

		public void setTotemType(String totemType)
			{
				this.totemType = totemType;
			}

		public String getTotemAttribute()
			{
				return totemAttribute;
			}

		public void setTotemAttribute(String totemAttribute)
			{
				this.totemAttribute = totemAttribute;
			}
		// methods where when there is both a type and attribute, then an attribute
		// applies to a card type
	}
