import java.util.Scanner;
import java.lang.String;
public class Viktorina{
    public static void main(String[] args){
     Scanner num = new Scanner(System.in);
      String a;
      int q, w, e, r, t, c, b;
      int m,boo;
      //Назначины все переменные и мпортированы вске нужные библиотеки для нашей Viktorina...


        System.out.println("Привет введи своё имя");
        a = num.nextLine();
        System.out.println("Давай сыграем в викторину? если согласен введи число от 1 до 10");
        q = num.nextInt();
        if (q <= 10 && q > 0 ) {
            System.out.println("отлично тогда начнём");
        }else if (q == 0){
            System.out.println("ноль не считаеться но допустим это как за положительный ответ");
            }
        else{
            System.out.println("очень жаль что вы не хотите играть а пример то простой попробуй всё же ришить его");
        }//Первое условие хочет ли пользователь играть в Viktorina или нет...

        System.out.println("Для начала реши простой пример 2 + 2 * 2");
        w = num.nextInt();
        if (w == 6) {
            System.out.println("Все верно давай дальше");
        }else{
           System.out.println("Не верно но давай пропустим это");
        }//Второе условие решение примера 2+2*2 = 6

        System.out.println("Какой компании пренадлежит язык Java ");
        System.out.println("введи 1 если компании Oracle");
        System.out.println("введи 2 если Google");
        System.out.println("введи 3 если Yandex");
        e = num.nextInt();
        if (e == 1){
            System.out.println("все верно давай дальше");
        }else{
            System.out.println("К сожалению ты не прав но мы это простим и пойдём дальше");
        }//Третье условие Какой компании пренадлежит язык Java ответ(Oracle)...

        System.out.println("Как изначально назывался Java?");
        System.out.println("1-Кот");
        System.out.println("2-Дуб");
        System.out.println("3-Джон");
        r = num.nextInt();
        if (r == 2){
            System.out.println("все верно молодец го еще");
        }else{
            System.out.println("Не верно но не страшно пошли дальше");
        }//Четвёртое условие как изначально назывался язык Java ответ(Дуб)...
        System.out.println("В каком году основана компания Microsoft");
        System.out.println("1-в 1973");
        System.out.println("2-в 1989");
        System.out.println("3-в 1975");
        c = num.nextInt();
        if (c == 3){
            System.out.println("Это правда поехали дальше");
        }else{
            System.out.println("Нет но теперь запомни что компания появилась в 1975 году 4 апреля");
        }//Пятое условие викторины Год основаня компании Microsoft, (правельно 4 аперля 1975 году)

        System.out.println("Вашинктон это?");
        System.out.println("1-Столица Англии");
        System.out.println("2-Столица Армении");
        System.out.println("3-Столица США");
        b = num.nextInt();
        if (b == 3){
            System.out.println("Именно так");
        }else if (b == 1)
            System.out.println("Я думаю ты перепутал с Лондоном проехали короче");
         else if (b == 2)
             System.out.println("Ясно понятно пропустим это");
         // Шестое условие принято Вашингтон это? (Столица США);
         System.out.println("Столица китая?");
        System.out.println("1-Лондон");
        System.out.println("2-Ташкент");
        System.out.println("3-Пикин");
        m = num.nextInt();
        if (m == 3){
            System.out.println("Всё верно молодец");
        }else if (m == 2){
            System.out.println("Салом алейкум Таджикистон");
        }else{
            System.out.println("не верно всё это, но не растраивайся всё будет но не сразу");
            // Седьмое условие принято Столица Китая (Пикин);
        }System.out.println("В каком году вышел сериал Симпсоны");
        System.out.println("1)В 1977");
        System.out.println("2)В 2000");
        System.out.println("3)В 1989");
        boo = num.nextInt();
        if (boo == 3){
            System.out.println("Это верный ответ");
        }else{
            System.out.println("К сожалению вы не ответили верно");
        }// Восьмое условие принять Год основания сериало 1989;


        System.out.println(a + " на этом наша викторина подходит к концу спасибо что сыграли");
        System.out.println("Оцените нашу игру по пятибальной шкале");
        t = num.nextInt();
        if (t == 5){
            System.out.println("Спасибо за пять баллов мы это очень ценим");
        }else{
            System.out.println("спасибо за оценку мы будем меняться к лучшему");
        }//Оценка игры по мнению тестировщика...








    }
}