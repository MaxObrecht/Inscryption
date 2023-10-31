
public class Item
	{
//each item is a method that does a specific thing
		private String itemType;

		Item(String i)
			{
				setItemType(i);
			}

		public String getItemType()
			{
				return itemType;
			}

		public void setItemType(String itemType)
			{
				this.itemType = itemType;
			}
		
		//below methods associated to itemType which do a specific thing
	}
