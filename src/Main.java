public class Main {
    public static void main(String[] args) {
        //задание 3
        int year=2504;
        if(year%4>0 || year%100==0){
            System.out.println(year+" год не является високосным");
        }
        else{
            System.out.println(year+" год является високосным");
        }

    }
}