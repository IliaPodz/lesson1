
import java.util.Scanner;
import java.util.Arrays;

public class PussyFeeder {
    public static Integer[] FoodCats  = new Integer[] {1, 2, 3, 4, 5};
    public static int nCats = FoodCats.length;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите число котиков: " + nCats);

        while(true) {

            System.out.println("1 - Покормить или отобрать еду у конкретного кота");
            System.out.println("2 - Покормить или отобрать еду у всех котов сразу");
            System.out.println("3 - Покормить или отобрать еду у четных или нечетных котов ");
            System.out.print("Введите числовое действие:");
            int numAction = sc.nextInt();
            switch(numAction){
                case 1:
                    System.out.println("Вы выбрали покормить или отнять еду у конкретного кота");
                    System.out.print(":");
                    int nCat = sc.nextInt();
                    if (nCat>0 && nCat<=nCats) {
                        //System.out.println("Cat " + nCat);
                        GiveTakeFood(nCat);
                    } else {
                        System.out.println("Нет такой кошки " + nCat);
                    }
                    break;
                case 2:
                    System.out.println("Вы выбрали покормить или отнять еду у всех кошек");
                    GiveTakeFoodAllCats();
                    break;
                case 3:
                    System.out.println("Вы выбрали покормить или отобрать еду у четных или нечетных котов");
                    HonOddGiveTakeFood();
                    break;
                case 666:
                    System.exit(0);
                default:
                    System.out.println("Неверный ввод, пожалуйста, повторите попытку");
            }
            System.out.println("======================");
            System.out.println(Arrays.toString(FoodCats));
            System.out.println("======================");

        }
    }


    public static void GiveTakeFood(Integer numCat) {
        System.out.println("==== Кормление котика " + numCat + " ====");
        System.out.println("1 - Дать еду коту  ");
        System.out.println("2 - Забрат еду у кота ");
        System.out.print("Выберете следующее действие:");
        int numAction = sc.nextInt();
        switch(numAction){
            case 1:
                System.out.println("Вы выбрали кормить кота");
                if (FoodCats[numCat-1]<7){
                    FoodCats[numCat-1]+=1;
                    System.out.println("OK");
                } else {
                    System.out.println("ОШИБКА");
                }
                break;
            case 2:
                System.out.println("Вы выбрали забрать еду у кота");
                if (FoodCats[numCat-1]>0){
                    FoodCats[numCat-1]-=1;
                    System.out.println("OK");
                } else {
                    System.out.println("Ошибка");
                }
                break;
            default:
                System.out.println("Неверный ввод, пожалуйста, повторите попытку");
        }
    }


    public static void GiveTakeFoodAllCats() {
        System.out.println("==== Кормление котиков ====");
        System.out.println("1 - Дать котикам еду ");
        System.out.println("2 - забрать у котиков еду ");
        System.out.print("Выберете следующее действие:");
        int numAction = sc.nextInt();
        switch(numAction){
            case 1:
                System.out.println("Дать котикам еду");
                for(int n = 1; n <= nCats; n = n+1){
                    if (FoodCats[nCats-1]<7){
                        FoodCats[nCats-1]+=1;
                    }
                }
                break;
            case 2:
                System.out.println("Selected Take food Cats");
                for(int n = 1; n <= nCats; n = n+1){
                    if (FoodCats[nCats-1]<7){
                        FoodCats[nCats-1]-=1;
                    }
                }
                break;
            default:
                System.out.println("Invalid input, please try again");
        }
    }


    public static void HonOddGiveTakeFood() {
        System.out.println("==== Кормление четных или нечетных котиков ====");
        System.out.println("1 - Odd Cat ");
        System.out.println("2 - Honest Cat ");
        System.out.print("Enter odd or honest cats:");
        int numOddHon = sc.nextInt();
        if((numOddHon==1) || (numOddHon==2)){

            System.out.println("1 - Give food Cat ");
            System.out.println("2 - Take food Cat ");
            System.out.print("Enter num action:");
            int numAction = sc.nextInt();
            switch(numAction){
                case 1:
                    for(int n = 1; n <= nCats; n = n+1){
                        if(((numOddHon==1) && (FoodCats[n-1]%2!=0)) || ((numOddHon==2) && (FoodCats[n-1]%2==0))){
                            if (FoodCats[n-1]<7){FoodCats[n-1]+=1;}
                        }
                    }
                    break;
                case 2:
                    for(int n = 1; n < nCats; n = n+1){
                        if(((numOddHon==1) && (FoodCats[n-1]%2!=0)) || ((numOddHon==2) && (FoodCats[n-1]%2==0))){
                            if (FoodCats[n-1]>0){FoodCats[n-1]-=1;}
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid input, please try again");
            }
        } else {
            System.out.println("Invalid input");
        }

    }


}