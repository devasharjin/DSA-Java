
//Palindrome for number
// 1) i/p -> 12321      o/p -> Palindrome
// 2) i/p -> 23456      o/p -> Not Palindrome

import java.util.*;

void main(){
  IO.print("Enter a number : ");
  Scanner scanner = new Scanner(System.in);
  int num = scanner.nextInt();
  int constValue = num;
  int reverse = 0;

  while (num>0){
    int digit = num%10;
    reverse = reverse * 10 + digit;
    num = num / 10;
  }

  if (reverse == constValue)
    IO.println("Palindrome");
  else
   IO.println("Not Palindrome");

}
