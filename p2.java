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

      if(userArray[i].registered)
      {
         userArray[i].login();
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