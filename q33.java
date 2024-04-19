public class q33 { 
    public static void main(String[] args) {
        //
        int number = 41;
        System.out.println("sum of digit= "+sumdig(number));
    } 
    public static int sumdig(int x){
        int comp = 0;
        while(x!=0){
            comp += x %10;
            x/=10;
        }
        return comp;
    }
}
//compute the sum of an integer's digits
