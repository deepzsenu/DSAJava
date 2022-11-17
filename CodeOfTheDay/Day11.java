import java.util.*;
public class Main{
  public static void main(String[] hh){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int strt = s.indexOf('1');
    int end = s.lastIndexOf('1');
    int counts = 0;
    for(int i = strt; i<=end ; i++){
      if(s.charAt(i) == '0'){
        counts++;
      }
    }
    System.out.println(counts);
  }
}