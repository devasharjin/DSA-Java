
import java.util.*;

void main(){
  IO.print("Enter a number : ");
  Scanner sc = new Scanner(System.in);

  int num = sc.nextInt();

  int odd = 0;
  int even = 0;

  while(num > 0){
    int digit = num % 10;
    num = num / 10;

    if (digit % 2 == 0)
      even += 1;
    else
      odd += 1;
  
  }

  IO.println("Odd : " + odd +" Even : " + even);

}