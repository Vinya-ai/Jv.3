package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Тесты для класса Tester.
 */
public class TesterTest {

    private static final int OPERATIONS_COUNT = 1000;
    private Tester tester;

    @BeforeEach
    public void setUp() {
        // Инициализация тестировщика производительности перед каждым тестом
        tester = new Tester(OPERATIONS_COUNT);
    }

    /**
     * Тест добавления для ArrayList.
     */
    @Test
    public void testAddArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        long time = tester.testAdd(arrayList);
        assertTrue(time >= 0, "Время выполнения должно быть неотрицательным");
        assertTrue(arrayList.size() == OPERATIONS_COUNT, "Размер списка должен быть равен количеству добавленных элементов");
    }

    /**
     * Тест добавления для LinkedList.
     */
    @Test
    public void testAddLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        long time = tester.testAdd(linkedList);
        assertTrue(time >= 0, "Время выполнения должно быть неотрицательным");
        assertTrue(linkedList.size() == OPERATIONS_COUNT, "Размер списка должен быть равен количеству добавленных элементов");
    }

    /**
     * Тест получения для ArrayList.
     */
    @Test
    public void testGetArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        // Предварительное заполнение списка
        tester.testAdd(arrayList);
        long time = tester.testGet(arrayList);
        assertTrue(time >= 0, "Время выполнения должно быть неотрицательным");
    }

    /**
     * Тест получения для LinkedList.
     */
    @Test
    public void testGetLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        // Предварительное заполнение списка
        tester.testAdd(linkedList);
        long time = tester.testGet(linkedList);
        assertTrue(time >= 0, "Время выполнения должно быть неотрицательным");
    }

    /**
     * Тест удаления для ArrayList.
     */
    @Test
    public void testRemoveArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        // Предварительное заполнение списка
        tester.testAdd(arrayList);
        long time = tester.testRemove(arrayList);
        assertTrue(time >= 0, "Время выполнения должно быть неотрицательным");
        assertTrue(arrayList.isEmpty(), "Список должен быть пустым после удаления всех элементов");
    }

    /**
     * Тест удаления для LinkedList.
     */
    @Test
    public void testRemoveLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        // Предварительное заполнение списка
        tester.testAdd(linkedList);
        long time = tester.testRemove(linkedList);
        assertTrue(time >= 0, "Время выполнения должно быть неотрицательным");
        assertTrue(linkedList.isEmpty(), "Список должен быть пустым после удаления всех элементов");
    }
}
