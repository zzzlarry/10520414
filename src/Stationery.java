
public class Stationery extends Abstract{
	public Stationery(String name, String id, String barCode, String category, float price, String description) 
	{
		super(name, id, barCode, description, price, description);
	}
	
	private String vendor;
	private int length, width, height;

	public void setPubVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return this.length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}
}
