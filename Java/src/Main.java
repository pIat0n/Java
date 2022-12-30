public class Main{
    public static void main(String[] args){
        System.out.println(is_prime(0));
    }
    public static boolean is_prime(int num){
        int d = 2;
        while (d * d <= num && num % d != 0){
            d++;
        }
        return d * d > num;
    }
}