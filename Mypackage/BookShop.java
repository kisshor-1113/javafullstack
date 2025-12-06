package Mypackage;
import java.util.Scanner;
		   class Book2{
			 private String title;
			  private String author;
			  private int price;
			  public String getTitle() {
			  return title;  }
			  public String getAuthor() {
				  return author;}
			  public int getPrice() {
				  return price;}
			  public void setTitle(String newTitle) {
			  this.title=newTitle; }
			  public void setAuthor(String newAuthor) {
				  this.author=newAuthor;}
			  public void setPrice(int newPrice) {
				  this.price=newPrice; }
		     public static int discount(int n,int price) {
		    	 int res=price-(price/n);
		    	 return res; }
				public class BookShop{
				public static void main(String[] args) {
				    Scanner sc = new Scanner(System.in);
				        System.out.println("Enter the title of books : ");
				        String title = sc.next();
				        System.out.println("Enter the Author Name : ");
				        String author = sc.next();
				        int price = 10000;
				        System.out.println("The price of " + title + " written by " + price + "Rs");
				        Book2 obj = new Book2();
				        obj.setTitle(title);
				        obj.setAuthor(author);
				        obj.setPrice(price);
				        System.out.println("The Title You Entered is " + obj.getTitle());
				        System.out.println("The Author of " + obj.getTitle() + " is " + obj.getAuthor());
				        System.out.println("The price of " + obj.getTitle() + " is " + obj.getPrice());
				        System.out.println("Enter the Discount : ");
				        int discount = sc.nextInt();
				        int res = obj.discount(discount, price);
				        System.out.println("The Discounted price is " + res); }
				}
		   }


