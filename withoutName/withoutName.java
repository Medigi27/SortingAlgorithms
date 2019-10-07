/*package withoutName;

import java.util.ArrayList;
import java.util.List;

public class withoutName {
    public static void main(String[] args) {
        //создаем и заполняем массив из 20-ти чисел
        List<Integer> list  = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++) {
        int a = (int) (Math.random() * (200 + 1)) - 100;
        list.add(a);
        }
        //Выводим неотсортированный массив
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //Сортируем как-то??
       /* 1. Находим самое большое число в массиве
        2. Переставляем его в конец списка
        3. число, которое было в конце - на место самого большого числа
        4. Цикл повторяется, но c каждой итерацией зона работы цикла меньше на 1 */

        int max = list.get(0);
        //2. Нашли самое большое
        for(int i = 0; i < list.size(); i++){
                if(max > list.get(i)) {
                    max = list.get(i);
                }
                /*helpic = list.get(i);
                list.set(i) = list.get(i + 1);
                list.get(i + 1) = helpic;*/
            }
        }
        //3. Переставляем в конец
        for(int i = 0; i <   ; i++)
        int buffer = list.get(list.size() - i);



        //Выводим отсортированный массив
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }






    }




}
