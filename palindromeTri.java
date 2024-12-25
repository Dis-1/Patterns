public class palindromeTri {
    public static void  palindromeTriangle(int n){
        int i,j;

   for(i=0;i<n;i++){
    // inner loop to print the spaces
    for (j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
    }

    // inner loop to print the first part
    for (j = i; j >= 1; j--) {
        System.out.print(j + " ");
    }

    // inner loop to print the second part
    for (j = 2; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
   }
    }
    public static void main(String[] args) {
        int n=5;
        palindromeTriangle(n);
        
    }
}
