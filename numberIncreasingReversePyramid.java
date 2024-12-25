public class numberIncreasingReversePyramid {
    public static void  numberIncreasingreversePyramid(int n){
        int i,j;

   for(i=n;i>0;i--){
  
    for(j=0;j<i;j++){
        System.out.print(j+1);
     
    }
    System.out.println();
   }
    }
    public static void main(String[] args) {
        int n=5;
        numberIncreasingreversePyramid(n);
        
    }
}
