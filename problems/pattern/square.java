public class square {
    public static void main(String[] args) {
        
    
    int rows = 11;
    int cols = 11;

    for(int i = 0 ; i < 10 ; i++){
        for(int j = 0 ; j < 10 ; j++){
            if(i == 0|| i == j|| j == 9-i || j==0 || i == 10/2 || j == 10/2 || j == 9 || i == 9){
                System.out.print("* ");
            }else{
                System.out.print("  ");

            }
        }
        System.out.printf("\n");

    }
}
}