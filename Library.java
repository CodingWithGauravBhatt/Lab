package Today2Mar;

public class Library {
private int BookId;
private String BookName,BookAuthor;
public int getBookId() {
	return BookId;
}
public void setBookId(int bookId) {
	BookId = bookId;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}
public String getBookAuthor() {
	return BookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	BookAuthor = bookAuthor;
}
public static void main(String[] args) {
	Library l = new Library();
	l.setBookId(5);
	l.setBookName("Rich Dad And Poor Dad");
	l.setBookAuthor("Robert Kiyosaki");
	
	System.out.println("Book ID is:"+l.getBookId());
	System.out.println("Book Name is:"+l.getBookName());
	System.out.println("Book Author is :"+l.getBookAuthor());
}
}
