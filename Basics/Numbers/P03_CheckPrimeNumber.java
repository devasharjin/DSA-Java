// Check whether a given number is prime or not
// i/p -> 5  o/p -> prime
// i/p -> 8  o/p -> Not Prime

import java.util.*;

void main(){
  IO.print("Enter a number : ");
  Scanner scanner = new Scanner(System.in);
  int num = scanner.nextInt();
  boolean bool = true;

  for(int i = 2; i<num ; i++){
      if (num % i == 0){
        bool = false;
        break;
      }
  }
  if(bool)
    IO.println("Prime Number");
  else
    IO.println("Not a Prime Number");
}