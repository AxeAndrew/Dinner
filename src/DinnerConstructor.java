import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {

    HashMap<String, ArrayList<String>> dinnerDay = new HashMap<>();
    ArrayList<String> dinnerName = new ArrayList<>();
    Random rand = new Random();



    void addD() {
        ArrayList<String> BludaO = new ArrayList<>();
        BludaO.add("Суп");
        BludaO.add("Плов");
        BludaO.add("картошка");
        BludaO.add("гренки");
        BludaO.add("курица");
        BludaO.add("макароны");
        dinnerDay.put("Обед", BludaO);

        ArrayList<String> BludaU = new ArrayList<>();
        BludaU.add("Чай");
        BludaU.add("Кофе");
        BludaU.add("Лимонад");
        BludaU.add("Компот");
        BludaU.add("Пиво");
        BludaU.add("Вино");
        dinnerDay.put("Ужин", BludaU);

        ArrayList<String> BludaX = new ArrayList<>();
        BludaX.add("Каша");
        BludaX.add("Бутер");
        BludaX.add("Масло");
        BludaX.add("Манка");
        BludaX.add("Капуста");
        BludaX.add("Лимон");
        dinnerDay.put("Завтрак", BludaX);
    }

    void DinnerMenu(String dishType,String dishName) {


        dinnerName.add(dishName);
        dinnerDay.put(dishType, dinnerName);



        }
/*
    public void SearchDinner(String nextItem){
        ArrayList<String> dinnerGen = new ArrayList<>();
        if ((dinnerDay.keySet().equals(nextItem)){
            dinnerGen.add(nextItem);
            return dinnerGen;
        }

        }
*/

void GeneratedDinner (int numberOfCombos, ArrayList<String> dinnerGenMenu){

    for(int i = 0; i<numberOfCombos; i++) {                                 // сколько комбо
        int SizeArroy = dinnerGenMenu.size();                               // размер листа с обед/завтрак
        System.out.print("Безнес ланч №" + (i+1) + ": ");
        for (int j = 0; j < SizeArroy; j++) {
            String dinnerRando = dinnerGenMenu.get(j);                      // тип завтрак/обед
            ArrayList<String> dinnerRand = dinnerDay.get(dinnerRando);
        //    System.out.println(dinnerRando);
            int randо = rand.nextInt(dinnerRand.size());
            System.out.print(dinnerRand.get(randо) + " ");
            }
        System.out.println();
    }


}

     void Viever () {
         for (String name : dinnerDay.keySet()) {
             System.out.println(name + ":");
             ArrayList<String> value = dinnerDay.get(name);
             System.out.println(value);
         }
     }


}
