public class NullPex{


    public static void main(String[] args) {
        

	try{
	Object obj = null;
	obj.hashCode();
	}

	catch(Exception e){
	System.out.println(e);
}

System.out.println("Rest of the code");
    

}

}