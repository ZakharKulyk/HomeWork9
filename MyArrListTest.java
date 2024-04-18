package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

public class MyArrListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Выводим список
        System.out.println("Список после добавления элементов: " + list);

        // Проверяем размер списка
        System.out.println("Размер списка: " + list.size());

        // Получаем элемент по индексу
        System.out.println("Элемент с индексом 2: " + list.get(2));

        // Удаляем элемент по индексу
        System.out.println("Удаленный элемент с индексом 2: " + list.remove(2));

        // Выводим список после удаления элемента
        System.out.println("Список после удаления элемента: " + list);

        // Проверяем размер списка после удаления элемента
        System.out.println("Размер списка после удаления элемента: " + list.size());

        // Очищаем список
        list.clear();
        System.out.println("Список после очистки: " + list);
        System.out.println("Размер списка после очистки: " + list.size());

    }
}
