package book_details;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private float price;
	/*
	 * @return the bookNo
	 */
	public int getBookNo() {
		return bookNo;
	}
	/**
	 * @param bookNo the bookNo to set
	 */
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
class Engineering extends Book{
	private String category;
	public void print(Book b) {
		System.out.println(b.getBookNo());
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
		
	}
}