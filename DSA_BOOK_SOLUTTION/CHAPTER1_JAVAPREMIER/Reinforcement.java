// package DSA_BOOK_SOLUTTION.CHAPTER1_JAVAPREMIER;
import java.util.*;
import java.io.*;

/*R-1.2 Suppose that we create an array A of GameEntry objects, which has an integer
scores field, and we clone A and store the result in an array B. If we then immediately
set A[4].score equal to 550, what is the score value of the GameEntry
object referenced by B[4]? */

class GameEntry{
}

/*R-1.10 Write a Java class, Flower, that has three instance variables of type String, int,
and float, which respectively represent the name of the flower, its number of
petals, and price. Your class must include a constructor method that initializes
each variable to an appropriate value, and your class should include methods for
setting the value of each type, and getting the value of each type. */
class Flower{
    private String name;
    private int petals;
    private float price;
    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPetals() {
        return petals;
    }
    public void setPetals(int petals) {
        this.petals = petals;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

}

/*R-1.11 Modify the CreditCard class from Code Fragment 1.5 to include a method that
updates the credit limit.

R-1.12 Modify the CreditCard class from Code Fragment 1.5 so that it ignores any request
to process a negative payment amount.

R-1.13 Modify the declaration of the first for loop in the main method in Code Fragment
1.6 so that its charges will cause exactly one of the three credit cards to
attempt to go over its credit limit. Which credit card is it? */

class CreditCard{
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;
    public CreditCard(String cust,String bnk, String acnt, int limit , double initialBal ){
        this.customer = cust;
        this.bank = bnk;
        this.account = acnt;
        this.limit = limit;
        this.balance = initialBal;
    }


}


public class Reinforcement {
    public static Scanner sc = new Scanner(System.in);
    /* R-1.1 Write a short Java method, inputAllBaseTypes, that inputs a different value of
        each base type from the standard input device and prints it back to the standard
    output device. */
    static void reinforcment_1(){
        System.out.println("Enter byte type");
        byte a = sc.nextByte();
        System.out.println("Enter sort type");
        short b = sc.nextShort();
        System.out.println("Enter int type");
        int c = sc.nextInt();
        System.out.println("Enter character ");
        char d =sc.next().charAt(0);
        System.out.println("Enter long value");
        long f = sc.nextLong();
        System.out.println("Enter float :");
        float e = sc.nextFloat();
        System.out.println("Enter double type");
        double g = sc.nextDouble();
        System.out.println("Enter boolean type");
        boolean h = sc.nextBoolean();
        System.out.println("Ans no 1 : ");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h);
        System.out.println();
    }
    /*R-1.2 Suppose that we create an array A of GameEntry objects, which has an integer
        scores field, and we clone A and store the result in an array B. If we then immediately
        set A[4].score equal to 550, what is the score value of the GameEntry
        object referenced by B[4]? */
    static void reinforcment_2(){

    }

    /*R-1.3 Write a short Java method, isMultiple, that takes two long values, n and m, and
    returns true if and only if n is a multiple of m, that is, n = mi for some integer i. */
    static void isMultiple(){
        System.out.println("Enter m and n : ");
        long n = sc.nextLong();
        long m = sc.nextLong();

        if (n%m ==0){
            System.out.println("n is a multiple f m ");
            System.out.println(true);
        }
        else{
            System.out.println("n is not a multiple of m");
            System.out.println(false);
        }
    }
    /*R-1.4 Write a short Java method, isEven, that takes an int i and returns true if and only
        if i is even. Your method cannot use the multiplication, modulus, or division
        operators, however. */
    static void isEven(){
        System.out.println("Enter a number to check ");
        int i  = sc.nextInt();
        if(i%2 ==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    /*Write a short Java method that takes an integer n and returns the sum of all
`       positive integers less than or equal to n. */

    static void reinforcment_5(){
        System.out.println("Enter a natural number");
        int n = sc.nextInt();
        long sum1 = 0;
        for (int i =1; i<=n; i++){//method 1 using loop
            sum1+=1;
        }

        long sum =  (n*(n+1))/2;// method2 using formula
        System.out.println("The sum of first "+n+" numbers is :"+sum);

    }
    /*R-1.6 Write a short Java method that takes an integer n and returns the sum of all the
        odd positive integers less than or equal to n. */

    static void oddSum(){
        System.out.println("Enter a natural number");
        int n = sc.nextInt();
        long sum  = 0;
        for(int i =1; i<=n; i++){// method 1 using loop
            if (i%2!=0){
                sum+=i;
            }
        }
        long sum1 =0;//method 2 using formula.

        System.out.println("The sum of first odd upto "+n+" numbers is :"+sum);

    }

    /*R-1.7 Write a short Java method that takes an integer n and returns the sum of the
        squares of all positive integers less than or equal to n.   */

    static void sumSquare(){
        System.out.println("Enter a natural number");
        int n = sc.nextInt();
        long sum  = 0;
        for(int i =1; i<=n; i++){// method 1 using loop
            sum+=(i*i);
        }
        long sum1 =0;//method 2 using formula.

        System.out.println("The sum of squares  upto "+n+" numbers is :"+sum);

    }
    /*R-1.8 Write a short Java method that counts the number of vowels in a given character
    string. */

    static void countVowels(){
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int counts = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                counts+=1;
            }
            else if (str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
                counts+=1;
            }
        }
        System.out.println("vowel counts : "+counts);
    }
    /*R-1.9 Write a short Java method that uses a StringBuilder instance to remove all the
        punctuation from a string s storing a sentence, for example, transforming the
        string "Let’s try, Mike!" to "Lets try Mike". */
    static void stringBuilder(){
        String s = "Let's try, Mike! ";


    }
    public static void main(String[] args) {
        // reinforcment_1();
        //reinforcment_2();
        // isMultiple();
        // isEven();
        // reinforcment_5();
        // oddSum();
        // sumSquare();
        // countVowels();
        //stringBuilder();
        // flower class
        Flower rose = new Flower("berry", 29, 37.4f);
        Flower pink = new Flower(null, 0, 0);
        pink.setName("FLower Pink");
        pink.setPetals(45);
        pink.setPrice(3.48f);

        System.out.println(pink.getName()+" "+pink.getPrice()+" "+ pink.getPetals()+"\nRose "+rose.getName()+" "+rose.getPetals()+" "+rose.getPrice());

    }
}
