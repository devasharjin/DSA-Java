// Find numbers with a given digit sum

// Sum = 5, range 1-30 → 5, 14, 23

void main(){
  int range = 30;
  int sum = 5;

  for (int i =0; i <=30; i++){
    int temp = i;
    int total = 0;
    while(temp > 0){
      int digit = temp %10;
      total = total + digit;
      temp = temp /10;
    }

    if(total == sum)
      System.out.print(i + " ");
  }
}

