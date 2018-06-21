
public class CartObject {


	private String item;

	private String price;

	
	public CartObject(String item, String price) {
		super();
		this.item = item;

		this.price = price;
	}



	public String getItem() {
		return item;
	}



	public void setItem(String item) {
		this.item = item;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}





	@Override
	public String toString() {
		return "CartObject [item=" + item + ", price=" + price + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartObject other = (CartObject) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}






}
