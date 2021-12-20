package classdiagram;


public class myexception extends Exception{

	public void pcheck(String p) throws myexception
    {
       if(p.length()<8){
           throw new myexception();
       }
   }
	public String display()
	{
		 return ("Enter a valid password with min 8 letters");
	}
	
}
