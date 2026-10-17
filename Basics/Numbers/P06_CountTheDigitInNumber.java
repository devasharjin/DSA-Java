import java.util.*;

void main(){
  System.out.print("Enter a number : ");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int digit = 0;
  while (num>0){
    num = num / 10;
    digit +=1;
  }
  System.out.println(digit);
}