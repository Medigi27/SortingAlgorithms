package InsertiionSort;

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
        //Сортировка вставками
       /* 1. Двигаемся по порядку массива i + 1;
        2. Сравниваем пары чисел.
        3. Если левое больше правого - правое переставляем сразу на свое место относительно проверенных чисел
        */

        int buffer = list.get(0);

        for(int i = 0; i < list.size(); i++){
                       for(int j = i + 1; j < list.size(); j++) {
                               if (list.get(i) > list.get(j)) {
                                        buffer = list.get(i);
                                        list.set(list.get(i), list.get(j));
                               }
                       }

            }
        }




        //Выводим отсортированный массив
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }






    }




}
