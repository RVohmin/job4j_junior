package ru.job4j.list;

/**
 * job4j_design ru.job4j.list.SimpleStack
 *
 * @author romanvohmin
 * @since 17.04.2020 23:32
 */
public class SimpleStack<T> {
    private final MyLinkedList<T> linked = new MyLinkedList<>();

    public T poll() {
        T temp;
        temp = linked.getLast();
        linked.deleteLast();
        return temp;
    }

    public void push(T value) {
        linked.add(value);
    }
}
