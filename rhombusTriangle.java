public class rhombusTriangle {
        public static void  rhombusTriangle(int n){
        int i,j;

   for(i=0;i<n;i++){
    // inner loop to print the spaces
    for (j = 1; j <=n - i; j++) {
        System.out.print(" ");
    }

  
    // inner loop to print the second part
    for (j = 0; j <= i; j++) {
        System.out.print( "*");
    }
    System.out.println();
   }
    }
    public static void main(String[] args) {
        int n=5;
        rhombusTriangle(n);
        
    }
}
