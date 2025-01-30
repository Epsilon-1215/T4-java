import java.util.Scanner;
class userInput
{
   Scanner sc = new Scanner(System.in); 
   String customername , mobileno , email, emailid ,password , correctpassword; 
	int  events ;
   boolean registered;
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

	
	return false;
   
  
}
class eventManager 
{
   void setUserInfo()
   {
    userInput u1 = new userInput();
    userInput u2 = new userInput();
    userInput u3 = new userInput();
    u1.registered = true ;
    u2.registered = true ;
    u3.registered = false ;
    u1.customername = "Kartik Sharma";
    u1.password = "kartik123";
    u1.email = "kartikSharma@gmail.com";
    u1.mobileno = "8888223344";
    u2.customername = "Pratik patel";
    u2.password = "Pratik123";
    u2.email = "Pratik@gmail.com";
    u2.mobileno = "4455667744";
    userInput [] userArray = new userInput[3];
    userArray[0] = u1;
    userArray[1] = u2;
    userArray[2] = u3;
    for(int i =0; i < 3; i++)
    {
      boolean lg = true;
      while(lg){
      if(userArray[i].registered)
      {
         userArray[i].login();
         
      }
      else
      {
         userArray[i].signup();
      }
      }
    }
   }
}
class mm
{
   public static void main(String[] args) {
       eventManager e = new eventManager();
       e.setUserInfo();
   }
}
