import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 10000000;i++){
            if (is_prime(i)){
                arrayList.add(i);
            }
        }
        System.out.print(arrayList);
    }
    public static boolean is_prime(int num){
        int d = 2;
        while (d * d <= num && num % d != 0){
            d++;
        }
        return d * d > num;
    }
}