

	import java.util.*;
	import java.util.Random;
	import java.lang.*;
	
	class Quiz implements Quiz_Application1{

	String name;
	int age;
	String profession;
	String Fav_Language;
	int prize;
	int x,y;
	public String getName() {
			return name;
		}

		public void setName(String Name) {
			Name=name;
		}

		public String getProfession() {
			return profession;
		}

		public void setProfession(String Profession) {
			Profession = profession;
		}
		public String getLanguage() {
			return Fav_Language;
		}

		public void setLanguage(String fav_Language) {
			fav_Language = Fav_Language;
		}
	  public void setprize(int Prize){
	    Prize=prize;
	  }
	  public int getprize(){
	    return prize;
	  }
	  public int getAge(){
	    return age;
	  }
	  public void setAge(int Age){
	    Age=age;
	  }
		public void Password_Protection() {
			try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Hey! you will be redirected to login page in just 3 seconds");
			Thread.sleep(3000);
			int Admin_Id=101;
			int Password=202;
			int n=3;
			System.out.println("You will only be Awarded with 3 Attempts");
			for(int i=0;i<3;i++){
				
			System.out.println(n+"Attempts left");
			System.out.println("Enter the Admin ID");
			Admin_Id=sc.nextInt();
			System.out.println("Enter the Password");
			Password=sc.nextInt();
			if(Admin_Id==101 && Password==202){
				System.out.println("Login Successful");
				ADD();
				break;
			}
			else {
			System.out.println("Wrong entry");
			n--;
			}
			}	
		}
				catch(Exception e) {
				e.printStackTrace();
			}
		}
	public void ADD(){
	  try{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Please enter your Name");
	  String name=sc.nextLine();
	  System.out.println("Please enter your Age");
	  int age=sc.nextInt();
	  System.out.println("Please enter your Profession");
	  String profession=sc.nextLine();
	  System.out.println("Please enter your Fav Favourite Language");
	  String Fav_Language=sc.nextLine();
	  Game();
	  }
	  
	  catch(Exception e){
	    e.printStackTrace();
	  }
	}
	public void Game(){
	  try{
	System.out.println("Are you ready for the game");
	Thread.sleep(3000);
	System.out.println("Who invented AI?");
	System.out.println("Alan turing");
	System.out.println("Elon Musk");
	System.out.println("Ramanujan");
	System.out.println("Enter the option");
	Thread.sleep(10000);
	System.out.println("Do you want to use a lifeline");
	Scanner sc=new Scanner(System.in);
	char option4=sc.next().charAt(0);
	if(option4=='Y'||option4=='y'){
	  Lifeline();
	}
	else{
	  System.out.println("Ok then give the answer");
	  int option1=sc.nextInt();
	  if(option1==1){
	  System.out.println("Wohoo this is a correct answer");
	  prize=10000;
	}
	else if(option1==2){
	  System.out.println("OOPS! this is a wrong answer");
	}
	else if(option1==3){
	  System.out.println("OOPS! this is a wrong answer");
	}
	  }

	
	
	  }
	  
	  catch(Exception e){
	    e.printStackTrace();
	  }
	}
	public  void Lifeline(){
	  try{
	  int flag=1;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Thanks for opting the Lifeline");
	  System.out.println("There is one lifeline");
	  Thread.sleep(2000);
	  System.out.println("1-Flip the Question");
	   int option2=sc.nextInt();
	  if(option2==1){
	    System.out.println("The new question is as follows");
	    Thread.sleep(1000);
	    System.out.println("Who invented Microsoft");
	    System.out.println("Bill Gates");
	    System.out.println("Larry Page");
	    System.out.println("Mark Zuckerberg");
	    int option3=sc.nextInt();
	    if(option3==1){
	  System.out.println("Wohoo this is a correct answer");
	  prize=10000;
	}
	else if(option3==2){
	  System.out.println("OOPS! this is a wrong answer");
	}
	else if(option3==3){
	  System.out.println("OOPS! this is a wrong answer");
	}
	flag--;
	  }
	  if(flag<1){
	    System.out.println("Sorry you have no Lifelines left");
	  }
	  }
	  catch(Exception e){
	    e.printStackTrace();
	  }
	  Display();
	}

	public void Display(){
		try {
	  System.out.println("Finally the game is over");
	  Thread.sleep(2000);
	  System.out.println("So You Have earned"+prize+"Dollars");
	}
		catch(Exception e) {
			e.printStackTrace();
		}

	
	}
	}




