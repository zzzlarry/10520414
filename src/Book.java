
public class Book extends Abstract {
	private String publisher, authors, publishDate, language, isbn;

	public Book(String name, String id, String barCode, String category, float price, String description) 
	{
		super(name, id, barCode, description, price, description);
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getAuthors() {
		return this.authors;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublishDate() {
		return this.publishDate;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}
public String getInfo(){
	return "name:"+this.getName()+"(id:"+this.id+") \nDescription"+
this.description+ "\nprice:" +this.getPrice() + "\nBarcode: " + this.getBarCode());
}
}
