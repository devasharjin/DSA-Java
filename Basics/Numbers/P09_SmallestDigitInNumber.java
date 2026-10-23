import java.util.*;

void main (){
  System.out.print("Enter a number : ");
  Scanner sc = new Scanner(System.in);

  int num = sc.nextInt();

  int smallest = 9;

  while (num > 0){
    int digit = num % 10;
    num = num / 10;
    if (digit < smallest)
      smallest = digit;
  }

  System.out.println(smallest);

}