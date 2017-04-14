
public class AudioDVD extends Abstract{
	public AudioDVD(String name, String id, String barCode, String category, float price, String description) 
	{
		super(name, id, barCode, description, price, description);
	}
	
	private String publisher,publishDate;
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisher() {
		return this.publisher;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublishDate() {
		return this.publishDate;
	}


}
