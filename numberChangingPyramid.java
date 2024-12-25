public class numberChangingPyramid {
    public static void  numberChangingPyramid(int n){
        int i,j,k=1;

   for(i=0;i<=n;i++){
  
    for(j=0;j<=i;j++){
       
       
        System.out.print(k);
     k++;
    }
    System.out.println();
   }
    }
    public static void main(String[] args) {
        int n=5;
        numberChangingPyramid(n);
        
    }
    
}
