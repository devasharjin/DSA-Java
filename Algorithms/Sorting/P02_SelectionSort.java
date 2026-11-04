

void main(){
  int[] a = {9,1,8,2,7,3,6,4,5};
  int n = a.length;

  for (int i = 0; i < n-1; i++ ){
    int large = 0;
    for (int j = 1; j< n-i-1; j++){
      if(a[j] > a[large])
        large = j;
    }
    System.out.println(large);
    int temp = a[n-i-1];
    a[n-i-1] = a[large];
    a[large] = temp;
  }

  for (int v : a)
    System.out.print(v + " ");
}