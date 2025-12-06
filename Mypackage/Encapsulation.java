package Mypackage;

 class Name {
	 private int id;
  private String name;
  private  int age;
  
   public String getName() {
	   return name;
   }
   
   public int getId() {
	   return id;
   }
   
   public int getAge() {
	   return age;
   }
   
   public void setName(String newName) {
	   this.name=newName;
	   
   }
   
   public void assignId(int newId) {
	   if(newId>0) {
		   this.id=newId;
	   }
	   
   }
   public void setAge(int newAge) {
	   if(newAge>0) {
		   this.age=newAge;
	   }
	   
   }
   
   
   
  public class Encapsulation {
	public static void main(String[] args) {
	 Name obj=new Name();
	 obj.assignId(1);
	 obj.setName("kiss");
	 obj.setAge(25);
	 System.out.println("name is"+""+obj.getName());
	 System.out.println("Age is"+""+obj.getAge());
	 System.out.println("Id is"+""+obj.getId());
	 
     
	}

  }
 }
