public class zeroOne {
    public static void  zerohange(int n){
        int i,j,k;

   for(i=0;i<=n;i++){
  
    for(j=0;j<=i;j++){
       k=i+j;
       
   if(k%2!=0){
    System.out.print(0);
   }else{
    System.out.print(1);
   }
    }
    System.out.println();
   }
    }
    public static void main(String[] args) {
        int n=5;
        zerohange(n);
        
    }
}
