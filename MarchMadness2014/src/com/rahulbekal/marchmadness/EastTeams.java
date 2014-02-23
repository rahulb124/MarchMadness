package com.rahulbekal.marchmadness;




public class EastTeams {
	
	
	// the following are all teams and their seeds
	
	static String eastseed1 = "Syracuse";
	static String eastseed2 = "Michigan St";
	static String eastseed3 = "Villanova";
	static String eastseed4 = "Iowa St";
	static String eastseed5 = "Louisville";
	static String eastseed6 = "Oklahoma";
	static String eastseed7 = "Memphis";
	static String eastseed8 = "Massachusets";
	static String eastseed9 = "Stanford";
	static String eastseed10 = "Missouri";
	static String eastseed11 = "Minnesota";
	static String eastseed12 = "North Dakota St";
	static String eastseed13 = "Mercer";
	static String eastseed14 = "IONA";
	static String eastseed15 = "Boston U";
	
	// the following are all the team stats
	
	static int eastD1 = 70; //D is Defense stat
	static int eastO1= 80;  //O is Offense stat
	
	
	//ignore the rest I will do this part
	
	public static void main(String []args) {
		
	       if (eastO1 - eastD1 > 0) {
	       	System.out.print(eastseed1);
	       	System.out.print(" wins!");
	       	}
	       	else  {
	       		System.out.println("Loss by : Syracuse");
	       	}
	       	}
	       	
	    }
	
