import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in); 
    String customerName, mobileNo, email, password; 
    int events, guests, foodCategory, venueCategory;
    double totalAmount, foodPrice, venuePrice;
    boolean registered, loggedIn;

    // Method for user login
    void login() {
        loggedIn = false;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Enter your email:");
            String inputEmail = scanner.next();
            
            System.out.println("Enter your password:");
            String inputPassword = scanner.next();

            if (inputPassword.equals(password) && inputEmail.equals(email)) {
                System.out.println("Welcome!");
                loggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println("Invalid credentials. Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
        }

        if (!loggedIn) {
            System.out.println("Too many failed attempts. Exiting the system.");
        }
    }

    // Method for user sign up
    void signup() {
        System.out.println("Welcome to Wedding Management");
        boolean validName = false;
        
        // Input validation for name
        while (!validName) {
            System.out.println("Please enter your name (only letters and spaces allowed):");
            customerName = scanner.next();
            if (customerName.matches("[a-zA-Z ]+")) {
                validName = true;
            } else {
                System.out.println("Invalid name. Please enter again.");
            }
        }

        // Input validation for mobile number
        boolean validMobile = false;
        while (!validMobile) {
            System.out.println("Enter your mobile number (10 digits):");
            mobileNo = scanner.next();
            if (mobileNo.length() == 10 && mobileNo.matches("\\d{10}")) {
                validMobile = true;
            } else {
                System.out.println("Invalid mobile number. Please enter again.");
            }
        }

        // Input validation for email
        boolean validEmail = false;
        while (!validEmail) {
            System.out.println("Enter your email (must be a Gmail address):");
            email = scanner.next().toLowerCase();
            if (email.endsWith("@gmail.com")) {
                validEmail = true;
            } else {
                System.out.println("Invalid email. Please enter again.");
            }
        }

        // Input validation for password
        boolean validPassword = false;
        while (!validPassword) {
            System.out.println("Create a password (8-15 characters):");
            password = scanner.next();
            if (password.length() >= 8 && password.length() <= 15) {
                validPassword = true;
            } else {
                System.out.println("Invalid password length. Please enter again.");
            }
        }

        System.out.println("Sign up successful!");
        registered = true;
    }

    // Method to validate sign up information
    void validateSignUp() {
        if (customerName.isEmpty() || email.isEmpty() || password.isEmpty() || mobileNo.isEmpty()) {
            System.out.println("Error: Couldn't sign up.");
        } else {
            System.out.println("Sign up successful.");
            registered = true;
        }
    }

    // Method to get user's event preferences
    int[][] getUserEventChoices() {
        System.out.println("Enter the number of events:");
        events = scanner.nextInt();
        int[][] eventDetails = new int[events][4];

        for (int i = 0; i < events; i++) {
            System.out.println("Event " + (i + 1));

            // Number of guests
            System.out.println("Enter number of guests (between 50-1000):");
            guests = scanner.nextInt();
            while (guests < 50 || guests > 1000) {
                System.out.println("Invalid number of guests. Please enter again.");
                guests = scanner.nextInt();
            }
            eventDetails[i][0] = guests;

            // Food category
            System.out.println("Select food category: 1. Basic (350 per plate), 2. Premium (550 per plate), 3. Luxury (999 per plate)");
            foodCategory = scanner.nextInt();
            while (foodCategory < 1 || foodCategory > 3) {
                System.out.println("Invalid selection. Please select again.");
                foodCategory = scanner.nextInt();
            }
            eventDetails[i][1] = foodCategory;

            // Venue category
            System.out.println("Select venue category: 1. Basic (50000), 2. Premium (85000), 3. Luxury (120000)");
            venueCategory = scanner.nextInt();
            while (venueCategory < 1 || venueCategory > 3) {
                System.out.println("Invalid selection. Please select again.");
                venueCategory = scanner.nextInt();
            }
            eventDetails[i][2] = venueCategory == 1 ? 50000 : venueCategory == 2 ? 85000 : 120000;
        }

        return eventDetails;
    }

    // Method to calculate expenses based on user's choices
    double calculateExpenses(int[][] eventDetails) {
        totalAmount = 0;
        for (int i = 0; i < events; i++) {
            guests = eventDetails[i][0];
            foodCategory = eventDetails[i][1];
            venuePrice = eventDetails[i][2];

            // Calculate food price
            foodPrice = foodCategory == 1 ? 350 : foodCategory == 2 ? 550 : 999;
            totalAmount += (guests * foodPrice) + venuePrice;
        }

        return totalAmount;
    }

    // Method to display user choices and bill
    void displaySummary(int[][] eventDetails) {
        System.out.println("Event Summary:");
        for (int i = 0; i < events; i++) {
            guests = eventDetails[i][0];
            foodCategory = eventDetails[i][1];
            venuePrice = eventDetails[i][2];

           String foodType;
switch (foodCategory) {
    case 1:
        foodType = "Basic";
        break;
    case 2:
        foodType = "Premium";
        break;
    case 3:
        foodType = "Luxury";
        break;
    default:
        foodType = "Unknown";
        break;
}

String venueType;
switch ((int) venuePrice) {  // Casting to int for accurate matching
    case 50000:
        venueType = "Basic";
        break;
    case 85000:
        venueType = "Premium";
        break;
    case 120000:
        venueType = "Luxury";
        break;
    default:
        venueType = "Unknown";
        break;
}

            System.out.println("Event " + (i + 1) + ": " +
                    guests + " guests, " +
                    foodType + " food, " +
                    venueType + " venue.");
        }

        double total = calculateExpenses(eventDetails);
        System.out.println("Total Bill: " + total + "RS");
    }
}

class EventManager {
    // Method to handle user registration and login
    UserInput setUserInfo() {
        Scanner scanner = new Scanner(System.in);
        UserInput user1 = new UserInput();
        UserInput user2 = new UserInput();
        UserInput user3 = new UserInput();

        // Predefined users for login
        user1.customerName = "Kartik Sharma";
        user1.password = "kartik123";
        user1.email = "kartikSharma@gmail.com";
        user1.mobileNo = "8888223344";

        user2.customerName = "Pratik Patel";
        user2.password = "Pratik123";
        user2.email = "Pratik@gmail.com";
        user2.mobileNo = "4455667744";

        user3.registered = false;

        boolean validChoice = true;
        while (validChoice) {
            System.out.println("Welcome");
            System.out.println("1. Register");
            System.out.println("2. Login");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    user3.signup();
                    user3.login();
                    return user3;

                case 2:
                    System.out.println("Enter your name:");
                    String name = scanner.next();
                    if (name.equals("Kartik Sharma")) {
                        user1.login();
                        return user1;
                    } else if (name.equals("Pratik Patel")) {
                        user2.login();
                        return user2;
                    } else {
                        System.out.println("Invalid name. Try again.");
                    }
                    break;

                default:
                    System.out.println("Invalid entry. Try again.");
                    break;
            }
        }

        return null;
    }

    public void generateBill() {
        UserInput user = setUserInfo();
        int[][] eventDetails = user.getUserEventChoices();
        user.displaySummary(eventDetails);
    }
}

class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        eventManager.generateBill();
    }
}
