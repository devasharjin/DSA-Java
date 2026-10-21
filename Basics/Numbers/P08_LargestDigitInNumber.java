import java.util.*;

void main(){
  System.out.print("Enter any number : ");
  Scanner sc =new Scanner (System.in);

  int num = sc.nextInt();
  int largestDigit = 0;

  while (num > 0){
    int digit = num % 10;
    num = num /10;
    if (digit > largestDigit)
      largestDigit = digit;
  }

  System.out.println(largestDigit);

}