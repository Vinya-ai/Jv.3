package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static final int OPERATIONS_COUNT = 100000;

    public static void main(String[] args) {
        Tester tester = new Tester(OPERATIONS_COUNT);

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Тест ArrayList
        System.out.println("ArrayList performance:");
        long addTimeArrayList = tester.testAdd(arrayList);
        long getTimeArrayList = tester.testGet(arrayList);
        long removeTimeArrayList = tester.testRemove(arrayList);

        // Тест LinkedList
        System.out.println("LinkedList performance:");
        long addTimeLinkedList = tester.testAdd(linkedList);
        long getTimeLinkedList = tester.testGet(linkedList);
        long removeTimeLinkedList = tester.testRemove(linkedList);

        // Вывод результатов
        System.out.printf("%-15s%-20s%-20s%-20s%n", "Method", "ArrayList (ms)", "LinkedList (ms)", "Iterations");
        System.out.printf("%-15s%-20d%-20d%-20d%n", "Add", addTimeArrayList, addTimeLinkedList, OPERATIONS_COUNT);
        System.out.printf("%-15s%-20d%-20d%-20d%n", "Get", getTimeArrayList, getTimeLinkedList, OPERATIONS_COUNT);
        System.out.printf("%-15s%-20d%-20d%-20d%n", "Remove", removeTimeArrayList, removeTimeLinkedList, OPERATIONS_COUNT);
    }
}
