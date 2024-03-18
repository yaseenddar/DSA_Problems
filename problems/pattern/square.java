public class square {
    public static void main(String[] args) {
        
    
    int rows = 11;
    int cols = 11;

    for(int i = 1; i <= rows ; i++){
        for(int j = 1 ; j <= i ; j++){
            if((i + j )% 2 == 0){
                System.err.print("1 ");
            }
            else{
                System.err.print("0 ");

            }
        }
        System.err.println();
    }
}
}