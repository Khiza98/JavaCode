import java.util.Scanner;
public class CoffeM {
public static void main(String[]args){
    Scanner num = new Scanner(System.in);
     int Kapuchino = 210;
     int espresso  = 110;
     int milk = 60;
     int wather = 40;
 int myMoney;
    System.out.println("Сколько у вас денег?");
    myMoney = num.nextInt();
    if (myMoney >= Kapuchino){
        System.out.println("Ваш капучино ");
    } else {
        System.out.println("У вас недостаточно средств для покупки капучино");
    }
    if (myMoney >= espresso){
        System.out.println("Ваш эспрессо");
    }else {
        System.out.println("У вас недостаточно средств для покупки эспрессо");
    }
    if(myMoney >= milk){
        System.out.println("Ваше молоко");
    }else{
        System.out.println("У вас недостаточно средств для покупки молока");
    }
    if(myMoney >= wather){
        System.out.println("Ваша вода");
    }else {
        System.out.println("У вас недостаточно средств для покупки воды");
    }

}
}
