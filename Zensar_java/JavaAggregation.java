public class JavaAggregation {

	public static void main(String[] args) {
	  
		Author objAuthor=new Author("Amish Tripathi","18 October 1974","Mumbai");
		Book objBook=new Book("The Immortals of Meluha",450.0F,objAuthor);
		
		// Book Details 
		System.out.println("Book Name : "+objBook.name);
		System.out.println("Book Price : "+objBook.price);
		
		// Author Details
		System.out.println(objBook.name+" Book Author Name is "+objBook.auther.authorName);
		System.out.println(objBook.name+" Book Author Birthdate is "+objBook.auther.birthDate);
		System.out.println(objBook.name+" Book Author Location "+objBook.auther.location);

	}//main()

}//end class JavaAggregation


class Author{
	String authorName;
	String birthDate;
	String location;
	
	public Author(String name,String date,String location) {
		this.authorName=name;
		this.birthDate=date;
		this.location=location;
	}//Constructor
}//Author

class Book{
	String name;
	float price;
	Author auther;
	
	public Book(String name,float price,Author auther) {
		this.name=name;
		this.price=price;
		this.auther=auther;
	}//Constructor
}//Book
