// 123 --> 1! + 2! + 3! == 9

import java.util.*;

void main(){
  IO.print("Enter a number : ");
  Scanner sc = new Scanner(System.in);

  int num = sc.nextInt();

  int total = 0;

  while (num > 0){
    int digit = num % 10;
    num = num/10;
    int temp = 1;
    if(digit ==0){
        temp =0;
        break;
      }
    for(int i=1;i<= digit ;i++){
      temp = temp * i;
    }
    total = total +temp;
  }

  IO.println(total);

}