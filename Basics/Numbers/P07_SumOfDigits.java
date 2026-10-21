import java.util.*;

void main(){
  System.out.println("Enter any number : ");
  Scanner sc = new Scanner(System.in);

  int num = sc.nextInt();
  int total = 0;

  while (num > 0){
    int digit = num % 10;
    num = num /10;
    total += digit;
  }

  System.out.println(total);

}