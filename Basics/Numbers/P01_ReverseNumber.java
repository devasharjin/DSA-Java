// Reversing of Number
// if i/p = 12345  o/p = 54321

import java.util.Scanner;

class Reverse{
  public int reverseNumber(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number");
    int num = scanner.nextInt();
    int reverse = 0;
    while(num>0){
      int digit = num % 10;
      reverse = reverse * 10 + digit;
      num = num/10;
    }

    return reverse;
  }
}

class P01_ReverseNumber
{
  public static void main(String [] args){
    Reverse obj = new Reverse();
    System.out.println(obj.reverseNumber());
  }
}