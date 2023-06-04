public class task3 {
    public static void main(String[] args){
        int num = (int) (Math.random()*102), count = 0;
        while(num != 0){
            count++;
            num/=10;
        }
        System.out.println(count);
    }
}
