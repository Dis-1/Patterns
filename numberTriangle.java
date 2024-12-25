public class numberTriangle {
    public static void  numbertriangle(int n){
        int i,j;

   for(i=0;i<n;i++){
   //need this for loop to keep the space in between
    for (j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for(j=0;j<i;j++){
        System.out.print(i +" ");
     
    }
    System.out.println();
   }
    }
    public static void main(String[] args) {
        int n=4;
        numbertriangle(n);
        
    }
}
