package typecasting;


 class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

//create another package

public class AccessSpecifiers3 extends proaccessspecifiers {

	public static void main(String[] args) {
		AccessSpecifiers3 obj = new AccessSpecifiers3 ();   
	       obj.display();  
	}

}




