import java.util.Scanner;

abstract class Bank{
    String name;
    int pin;
    int balance;


    Bank(String name, int pin, int amount){
        this.name = name;
        this.pin = pin;
        this.balance = amount;
    }

    abstract void balanceCheck();
    abstract void deposit(int amount);
    abstract void withDraw(int amount);

    boolean pinCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Pin to start process: ");
        int pin = sc.nextInt();
        return (this.pin == pin);
    }
}

class SavingAcc extends Bank{

    SavingAcc(String name, int pin, int amount){
        super(name, pin, amount);
    }

    void balanceCheck() {
        System.out.println("Available balance is: "+ balance);


    }

    void deposit(int amount) {

            balance += amount;
            System.out.println("Deposited successfully an amount: " + amount);


    }

    void withDraw(int amount) {

            if(balance>=amount){
                balance-=amount;
                System.out.println("Successfully withdraw amount :"+ amount);
            }
            else {
                System.out.println("Insufficient balance, Try again");
            }
    }


    void process(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Balance Check");
        System.out.println("2 - Deposit");
        System.out.println("3 - With Draw");
        System.out.println("4 - Exit");

        System.out.println("Enter number from 1-4: ");
        int option = scan.nextInt();
        boolean flag = true;
        while (flag){
            switch (option){
                case 1:
                    balanceCheck();
                    System.out.println("Enter number from 1-4: ");
                    option = scan.nextInt();
                    break;
                case 2:
                    System.out.println("Enter the deposit amount: ");
                    int depAmount = scan.nextInt();
                    deposit(depAmount);
                    System.out.println("Enter number from 1-4: ");
                    option = scan.nextInt();
                    break;
                case 3:
                    System.out.println("Enter the With Draw amount: ");
                    int withDrawAmount = scan.nextInt();
                    withDraw(withDrawAmount);
                    System.out.println("Enter number from 1-4: ");
                    option = scan.nextInt();
                    break;
                case 4:
                    System.out.println("Thank You");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter a valid option...");
                    System.out.println("Enter number from 1-4: ");
                    option = scan.nextInt();
            }
        }

    }
}

class BasicAtm{

   static SavingAcc createAccount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scan.next();
        System.out.println("Enter the pin: ");
        int pin = scan.nextInt();
        System.out.println("Enter the initial Deposit amount: ");
        int amount = scan.nextInt();
        System.out.println("Account created successfully");
        return new SavingAcc(name,pin,amount);

    }

    public static void main(String[] args){
        SavingAcc riyazAcc = createAccount();



        int numTry = 3;

        for (int i = 1 ; i <=3 ; i++){
            if(riyazAcc.pinCheck()) {
                riyazAcc.process();
                break;
            }
            else{
                numTry--;
                System.out.println("Invalid Pin ,Attempt left: " + numTry);
            }

        }
        if (numTry == 0){
            System.out.println("0 Attempt Remaining, Try again later");
        }

    }

}