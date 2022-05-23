package Programe;

public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String text="how are you fine";
       String []result=text.split("  ");
       System.out.println("result=");
       for(String str:result){
    	   System.out.println(str+"  ") ;
    	   
       }
	}

}
