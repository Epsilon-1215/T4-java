import java.util.*;
class wm
{
	 String customername;
	 String mobileno;
	String  email, emailid ;
	 String password , correctpassword; 
	 int m;

	Scanner sc = new Scanner(System.in);
	 
	boolean signup()
	{ 

		
	System.out.println("Welcome to Wedding Management");
	boolean c = true;
	
	while(c)
	{
		int a;
        
        System.out.println(" KINDLY ENTER YOUR NAME");
	customername=sc.next();
    int length = customername.length();
    for( a=0; a< length; a++)
	{

		
		int q;
                    q = customername.charAt(a);
		if(q >= 'A' && q <= 'Z' ||  q >= 'a' && q <= 'z' ||  q == ' ' )
		{
			
			continue;
		}
		else
		{
			break;
		}
	}
	if( a ==  length)
		{
			c = false;
		}
	else{
		System.out.println("Invalid name");
	}
	}
    
    boolean moNUm = true;
	while(moNUm)
	{
	System.out.println("Enter your mobile number :");
	mobileno=sc.next();
	int i=0;
	for( i=0;i<mobileno.length();i++)
	{
	if (mobileno.length()==10)
	{
		if (mobileno.charAt(0)!='0')
		{
		if((mobileno.charAt(i)<='9' && mobileno.charAt(i)>='0'&& mobileno.charAt(0)!='0' ))
		{
			moNUm = false;
			 break;
		}
		else 
		{
			System.out.println("only digits are allowed ");
            break;
		}
		}
		else
		{
			System.out.println("kindly enter the first number between 1 to 9 . mobile number does not starts with 0");
		    break;
		}
	}
	else 
	{
			System.out.println("length must be 10");
            break;
	}
	}
	}
    boolean b = true;
	while(b)
	{
		System.out.println("Enter your email :");
		email = sc.next();
		email = email.toLowerCase();
		if(email.endsWith("@gmail.com"))
		{
			System.out.println("Create a password (8-15 characters)");
			boolean r =true;
			while (r) { 
				password = sc.next();
				int pl = password.length();
				if(pl>=8 && pl<=15)
				{
					r = false;
					break;
				}
				else
				{
					System.out.println("password must be 8-15 char");
					continue;
				}
			}
			b = false;
			break;
		}
		else
		{
			System.out.println("invalid email");
		}
	}

	
	return false;// return false so .signup always false
	
	}
	
	void login() {
        boolean loggedIn = false;
        int attempts = 0;
        int MAX_ATTEMPTS = 3;

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Enter your email:");
            emailid = sc.next();
			
            System.out.println("Enter your password:");
             correctpassword= sc.next();

            if (correctpassword.equals(password) && emailid.equals(email))
				{
                System.out.println("Welcome!!!!");
                loggedIn = true;
                break;
            }
			else
			{
                attempts++;
                System.out.println("Invalid password or ID. Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
        }

        if (!loggedIn) 
		{
            System.out.println("Too many failed attempts. Exiting the system.");
        }
    }
	boolean check()
	{
		boolean b = false;
		
	if(customername.isEmpty() || email.isEmpty() || password.isEmpty() || mobileno.isEmpty() )
		{
			System.out.println("you cannot proceed further");
			return b;
	
			
		}
		else
		{
			System.out.println("you can proceed further.");
			
			
		}
		
		
	
		return false;
		
	}
	     void userInfo()
	       {
	         aa [] userArray = new aa[3];
	        for(int i = 0;i<3;i++)
	        {
	            int a = 1;      // so that we can use if else to give  ready data of user and input of only one
	            
	            
	        }
			
	       }
	      }
	    
	
	
	
	
	
	

class aa
{ 
	public static void main(String [] args)
		{
			int Food;
			
			 wm j = new wm();
			   boolean b =j.signup();
			   if (b==false)
			   {
				   j.check();
				   if(b==true)
				   { 
					   System.out.println("you are already registered.please login");
					   
					   
				   }
				   else
				   {
					   System.out.println("kindly login to proceed further.");
					   j.login();
				   }
				   
			   }
			   else
			   {
				   System.out.println("sign up is unsuccesfull");
			   }
			   
			    int x;
               {
                 int [] UserArray = new int[4]; 
                 // int[n] n = num of method u want to pass
                 UserArray[0] = Food();
                  
                }
		}
				 static int Food()
				{
					
					int choice;
                 boolean b =true ;
				 while(b)
					 
                {  
				
				Scanner sc = new Scanner(System.in);
                 System.out.println("Select a catering category");
                 System.out.println("1. basic 3 course meal(300 per plate)");
                 System.out.println("2. premium 5 course meal(500 per plate ");
                 System.out.println("3. luxury multi cuisine buffet (1000 per plate)");
                 System.out.println("Enter your choice :");
                  choice = sc.nextInt();
				 switch (choice)
				 {
					
				
				 }
				
				 
				  
				}
                 
                
				
				return 1;
              }
		
			  
		     }