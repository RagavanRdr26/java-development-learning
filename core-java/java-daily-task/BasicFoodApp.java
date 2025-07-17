import java.util.Scanner;

class User{
    private final static long mobile = 9025663219L;
    private final static String email= "rdr@gmail.com";
    private final static String name = "RDR";

    public static long getMobile(){
        return mobile;
    }
    public static String getEmail(){
        return email;
    }
    public static String getName(){
        return name;
    }
}

interface FoodDelivery{
    void loginWithMobile();
    void loginWithEmail();
    void menu();
}

class Swiggy implements FoodDelivery{
    Scanner scan = new Scanner(System.in);

    public void loginWithMobile(){
        long mobile = User.getMobile();
        System.out.println("Enter Your Mobile: ");
        long loginMobile = scan.nextLong();
        while (mobile!=loginMobile){
            System.out.println("Invalid number, Enter Again: ");
            loginMobile=scan.nextLong();
        }
        System.out.println("Welcome to Swiggy: " + User.getName() + " take a look at our menu");
        menu();

    }

    public void loginWithEmail() {
        String email = User.getEmail();
        System.out.println("Enter Your Email: ");
        String loginEmail = scan.next();
        while (!email.equals(loginEmail)){
            System.out.println("Invalid Email, Enter Again: ");
            loginEmail=scan.next();
        }
        System.out.println("Welcome to Swiggy: " + User.getName() + " take a look at our menu");
        menu();
    }


    public void menu() {
        System.out.println("Tea, Coffee, Snacks");
    }
}

class Zomato implements FoodDelivery{
    Scanner scan = new Scanner(System.in);


    public void loginWithMobile(){
        long mobile = User.getMobile();
        System.out.println("Enter Your Mobile: ");
        long loginMobile = scan.nextLong();
        while (mobile!=loginMobile){
            System.out.println("Invalid Mobile, Enter Again: ");
            loginMobile=scan.nextLong();
        }
        System.out.println("Welcome to Zomato: " + User.getName() + " take a look at our menu");
        menu();
    }

    public void loginWithEmail() {
        String email = User.getEmail();
        System.out.println("Enter Your Email: ");
        String loginEmail = scan.next();
        while (!email.equals(loginEmail)){
            System.out.println("Invalid Email, Enter Again: n");
            loginEmail=scan.next();
        }
        System.out.println("Welcome to Zomato: " + User.getName() + " take a look at our menu");
        menu();
    }

    public void menu() {
        System.out.println("Break Fast, Lunch, Dinner");

    }
}

class Main {

    public static void main(String[] args) {

        System.out.println("Welcome, Choose Your App, 1 - Swiggy and 2 - Zomato: ");
        Scanner scan = new Scanner(System.in);
        int appChoice = scan.nextInt();

        while (appChoice != 1 && appChoice != 2) {
            System.out.println("Please enter valid choice: ");
            appChoice = scan.nextInt();
        }

        FoodDelivery obj= appChoice==1?new Swiggy():new Zomato();

        System.out.println("Choose login with, 1 - Mobile and 2 - EMail: ");
        int loginChoice = scan.nextInt();

        while (loginChoice != 1 && loginChoice != 2) {
            System.out.println("Please enter valid choice: ");
            loginChoice = scan.nextInt();
        }

        if (loginChoice==1){
            obj.loginWithMobile();
        }
        else {
            obj.loginWithEmail();
        }



    }
}