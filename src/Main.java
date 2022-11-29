public class Main {
    public static void main(String[] args) {
        //задание 1
        int clientOS=1;
        int clientDeviceYear=1000;
        if (clientOS==1 && clientDeviceYear>2015 && clientDeviceYear<2022 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS==1 && clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        else if(clientOS==0 && clientDeviceYear>2015 && clientDeviceYear<2022 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else{
            System.out.println("Установите облегченную версию приложения для Android по ссылке!");
        }


    }
}