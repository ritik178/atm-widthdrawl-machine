import java.util.*;
class ATM{
    float Balance;
    int PIN=1234;

    public void checkPin(){
        System.out.println("enter your pin: ");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }else{
            System.out.println("enterd pinis incorrect! please try again");
            menu();
        }
        
    }
    public void menu(){
        System.out.println("Enter your choices");
        System.out.println("1.Check your balance");
        System.out.println("2.widthdraw money");
        System.out.println("3.Deposite Money");
        System.out.println("4.Exit");

        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice==1){
            checkBalance();
        }
        else if(choice==2){
            widthDrawMoney();
        }
        else if(choice==3){
            depositeMoney();
        }
        else if(choice==4){
             return;
        }else{
            System.out.println("Enter a valid choices");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void widthDrawMoney(){
        System.out.println("Enter the amount:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient balance");
        }else{
            Balance-=amount;
            System.out.println("Money Widthdrawn sucessfully");
        }
        menu();
    }
    public void depositeMoney(){
        System.out.println("enter the amount :");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance+=amount;
        System.out.println("Money added sucessfully");
        menu();
    }
    
}
public class ATMMachine {
    public static void main(String[] args) {
        ATM atM=new ATM();
        atM.checkPin();
        
    }
    
}
