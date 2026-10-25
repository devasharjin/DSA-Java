
// 1^3+5^3+3^3 = 1+125+27 = 153

import java.util.*;

void main (){
   IO.print("Enter a number : ");
   Scanner sc = new Scanner(System.in);

   int num = sc.nextInt();
   int temp = num;
   int totDigits = 0;
   int total = 0;

   while (temp > 0){
    temp = temp / 10;
    totDigits += 1;
   }

   temp = num;

   while (temp > 0){
      int digit = temp % 10;
      temp = temp /10;
      int power = (int) Math.pow(digit , totDigits);
      total = total + power;
   }

  
    IO.println(total);

  if (num == total)
   IO.println("Armstrong");
  else
    IO.println("Not Armstrong");

}

