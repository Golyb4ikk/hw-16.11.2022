public class Main {
    public static void main(String[] args) {
        //задание 4
        int deliveryDistance=95;
        int day=0;

        if(deliveryDistance<20){
           day= day+1;
        }
        else if(deliveryDistance>20 && deliveryDistance<60){
            day= day+2;
        }
        else if(deliveryDistance>60 && deliveryDistance<100) {
            day = day + 3;
            System.out.println("Потребуется дней: " + day);
        }
    }
}