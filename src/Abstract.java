
public class Abstract {
	protected String id, name, barCode, category, description;
	protected float price;

	public Abstract(String id, String name, String barCode, String category, float price, String description) {
		this.name = name;
		this.category = category;
		this.barCode = barCode;
		this.id = id;
		this.price = price;
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getBarCode() {
		return this.barCode;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return this.category;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return this.price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}
