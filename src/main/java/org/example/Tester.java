package org.example;

import java.util.List;

/**
 * Класс для тестирования производительности операций с коллекциями List.
 */
public class Tester {

    /** Количество операций для выполнения. */
    private final int operationsCount;

    /**
     * Конструктор
     * @param operationsCount количество операций.
     */
    public Tester(int operationsCount) {
        this.operationsCount = operationsCount;
    }

    /**
     * Тест добавления элементов.
     *
     * @param list коллекция.
     * @return время выполнения операции в миллисекундах.
     */
    public long testAdd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < operationsCount; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Тест получения элементов по индексу.
     *
     * @param list коллекция
     * @return время выполнения операции в миллисекундах.
     */
    public long testGet(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < operationsCount; i++) {
            list.get(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Тест удаления элементов.
     *
     * @param list коллекция
     * @return время выполнения операции в миллисекундах.
     */
    public long testRemove(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = operationsCount - 1; i >= 0; i--) {
            list.remove(i);
        }
        return System.currentTimeMillis() - startTime;
    }
}

