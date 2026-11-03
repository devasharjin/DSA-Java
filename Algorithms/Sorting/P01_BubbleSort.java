void main(){
  int[] a = {9,1,8,2,7,3,6,4,5};
  int n = a.length;

  for (int i = 0; i < n-1 ; i++){
    for (int j = 0; j < n-i-1; j++ ){
      if(a[j] > a[j + 1]){
           int temp = a[j];
           a[j] = a[j + 1];
           a[j + 1] = temp;
        }
    }
  }

  for (int x : a){
    System.out.print(x + " ");
  }

}