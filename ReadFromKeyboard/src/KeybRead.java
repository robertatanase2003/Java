import java.util.Scanner;

public class KeybRead
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b,c;

        //read numbers
        System.out.println("Enter 2 numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;

        s.nextLine();

        System.out.println("Enter your name: ");
        String name;
        name=s.nextLine();

        System.out.println("The sum is: "+c );
        System.out.println("My name is "+name);

    }
}
