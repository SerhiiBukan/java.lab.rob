import java.util.Scanner;

public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), result;
        result = x / 10 + x % 10;
        System.out.println(result);
    }
}

