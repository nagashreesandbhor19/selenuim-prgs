package seleniumpackage1;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) 
	{
		//small amount of  data
//		int a=10;
//		int b=20;
//		System.out.println(a+b);
	//----------------------------------
		//more amount of data
		//int c[] = {10,20,30,40,50,60,70,80,90};
	//---------------------------------------------------------------------------
		
		//collection concept
		
		//arraylist class
	//	
		ArrayList x=new ArrayList();
		
//		x.add(10);
//		x.add(20);
//		x.add(30);
//		x.add(40);
//	    x.add(50);
	    
	    //to print all data
	   // System.out.println(x);
	    x.add('a');
		x.add("rahul");
		x.add(88.87);
		x.add(false);
	//	System.out.println(x);                          //  to print all data
		//System.out.println( x.get(2));                //to get specific data
		
	//get method 
//		
//		int m =(int)x.get(0);
//		int n =(int)x.get(4);
//		System.out.println(m+n);
//		
	//-------------------------------------------------------------------------------------------------------
//		System.out.println(x);                                        //to print all data
//		System.out.println(x.get(2));                                    //to get specific data
//		System.out.println(x.set(0, "shree"));                              //to repalce data
//		System.out.println(x);
//		
//	x.remove(3);	
//	System.out.println(x);
//	System.out.println(x.size());
//	x.add("2000");
//	System.out.println(x);
//	System.out.println("new size--->" +x.size());
	
	
	x.clear();
	System.out.println(x);
	
	x.clone();
	System.out.println(x);
	
	
	x.removeAll(x);
	System.out.println(x);

	
		
		
		
		
		
		
		
		
		
		
	    

		

	}

}
