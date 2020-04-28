public class jumo{
    public static void main(String[]args){
        System.out.println("Кофе маштна");
        int myMoney = 220;
        int wate = 210;
        int milk = 600;
        int espresso = 180;
        int kapucino = 400;
        boolean noMoney = false;
     //Название переменных а ниже код !!!

     if (myMoney >= wate) {
         System.out.println("Вы можете купить воду");
         noMoney = true;
     } //если мои средства больше стоимости воды, то выведи на экран "Вы можете ккупить воду"

    if (myMoney >= milk) {
        System.out.println("Вы можете купить молоко");
        noMoney = true;
     } //если мои средства больше стоимости молока то выведи на экран "Вы можете купить молоко"

     if (myMoney >= espresso) {
         System.out.println("Вы можете купить эспрессо");
         noMoney = true;
     } //если мои средства больше стоимости эспрессо то выведи на экран "Вы можете купить эспрессо"

     if (myMoney >= kapucino) {
         System.out.println("Вы можете купить капучино");
         noMoney = true;}
         else {
             System.out.println("У вас недостаточно средств для покупки капучино");

     }
      // если мои средства больше стоимости капучино то выведи на экран "Вы можете купить капучино"
     if (noMoney == false) {
         System.out.println("У вас недостаточно средств");
     } //если у меня не будет достаточно средств на какой либо напиток то выведи "У вас недостаточно средств"




    }
}