//We are trying to achieve Encapsulation here

/*
 * Always remember What is Encapsulation is all about how can we implement it 
 * 
 * Encapsulation meaning hiding the sensitive data from the user . To achive this - 1) declare class variables are private 
 * -2) now this question comes in your mind how you are going to access this private variables for that we are going take help of get and set methods 
 * 
 * Here, In our example consider Persons Name as the sensitive data so we will declare it as private datamember */

class Person{
	String name;//by default access modifier is private here you can also use keyword private 
	public String getName(){
		return this.name;
	}
	public void setName(String Name){
		this.name= Name;
	}
}

public class Encapsulation{
	public static void main(String args[]){
		Person details = new Person();
		details.setName("Sarah");
		System.out.println("The Persons Name is " + details.getName());
	}
}

//here this keyword is used to refer the current object 
//In Lay man terms you can say like I am the one in whom you are storing the Name variable 
//In hindi this keyword ka matlab --> Mei hi hu 
