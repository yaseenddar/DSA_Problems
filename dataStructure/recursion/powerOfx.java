public class powerOfx {
    public static int power(int num, int pow){
        if(pow == 1){
            return num;
        }
        return num * power(num,pow - 1 );
    }
  public static void main(String [] args){
    System.out.println(power(3,3));
  }  
}
