package Bubble;

import java.util.ArrayList;
import java.util.List;

public class Babble {
    public static void main(String[] args) {
        //создаем и заполняем массив из 20-ти чисел
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * (200 + 1)) - 100;
            list.add(a);
        }
        //Выводим неотсортированный массив
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //Сортируем пузырьком
        //1. Сравниваем пары чисел
        //2. Если вначале бОльшее - меняем местами
        //3. Так большее число переходит в конец списка
        //4. Цикл повторяется, пока в каждой паре левое число не будет меньше правого
        int buffered = 0;
        int j = 0;
        for (int i = 0; i < list.size(); i++ ) {

                for (int j; list.get(j) > list.get(j + 1); i++) {
                    if (list.get(i) > list.get(i + 1)) {
                        int buffered = list.get(i);
                        list.set(i) = list.get(i + 1);
                        list.set(i + 1) = buffered;
                    }

                }
         j++;
        }
        //Выводим отсортированный массив
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }






    }




}
