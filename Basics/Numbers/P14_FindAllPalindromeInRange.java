import java.util.*;

void main(){
  System.out.print("Enter the range : ");
  Scanner sc = new Scanner(System.in);
  int range = sc.nextInt();

  for (int i = 10; i<= range ; i++){
    int temp = i;
    int reverse = 0;
    while(temp > 0){
      int digit = temp % 10;
      reverse = reverse * 10 + digit;
      temp = temp/10;
    }
    if (reverse == i){
      System.out.print(i + " ");
    }
  }


}