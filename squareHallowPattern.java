public class squareHallowPattern{
    public static void squarepatternhallow(int n){
        int i,j;
        for(i=0;i<n;i++){
            for (j=0;j<n;j++){
             if(i==0 ||j==0||i==n-1||j==n-1){
                System.out.print("*");

             }else{
                System.out.print(" ");
             }
             //System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
       int n=4;
    squarepatternhallow(n);
    }
}