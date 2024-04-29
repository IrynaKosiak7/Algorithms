package de.telran._29_04.homework;

public class MyQueue {
    private T front;
    private T end;

    private class T {
        int data;
        T next;

        T(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyQueue() {
        front = null;
        end = null;
    }

    public void push(int v) {
        T newt = new T(v);
        if (isEmpty()) {
            front = newt;
            end = newt;
        } else {
            end.next = newt;
            end = newt;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = front.data;
            front = front.next;
            if (front == null) {
                end = null;
            }
            return data;
        } else {
            System.out.println("Очередь пуста. Невозможно удалить элемент.");
            return -1;
        }

    }
    private boolean isEmpty() {
        return true;
    }
}