package de.telran._29_04.homework;

public class MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Конструктор
    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Добавление элемента в стек
    public void push(int v) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = v;
        } else {
            System.out.println("Стек полон. Невозможно добавить элемент.");
        }
    }

    // Удаление элемента из стека
    public int pop() {
        if (!isEmpty()) {
            int temp = stackArray[top];
            top--;
            return temp;
        } else {
            System.out.println("Стек пуст. Невозможно удалить элемент.");
            return -1;
        }
    }

    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        System.out.println( stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.isEmpty());

        System.out.println("Элемент извлечен из стека: " + stack.pop());
        System.out.println("Элемент извлечен из стека: " + stack.pop());

        System.out.println( stack.isEmpty());
    }
}
