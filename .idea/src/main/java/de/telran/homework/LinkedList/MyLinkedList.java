package de.telran._29_04.homework.LinkedList;

public class MyLinkedList {
    private static class Link {
        private final int value;
        private Link next;

        public Link(int value) {
            this.value = value;
            this.next = null;
        }

        public Link(int value, Link next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public Link getNext() {
            return next;
        }

        public boolean hasNext() {
            return next != null;
        }

        public void setNext(Link p) {
            this.next = p;
        }
    }

    private Link head = null;

    public void pushToHead(int v) {
        Link nextHead = new Link(v, head);
        head = nextHead;
    }

    public void pushToTail(int value) {
        if (head == null) {
            pushToHead(value);
        } else {
            Link curLink = head;

            while (curLink.getNext() != null)
                curLink = curLink.getNext();

            curLink.setNext(new Link(value, null));
        }
    }

    public void pushToIndex(int index, int value) {
        if (index < 0 || index > size()) {
            System.out.println("Неверный индекс.");
            return;
        }

        if (index == 0) {
            pushToHead(value);
            return;
        }

        Link curLink = head;
        for (int i = 0; i < index - 1; i++) {
            curLink = curLink.getNext();
        }
        Link nextLink = curLink.getNext();
        curLink.setNext(new Link(value, nextLink));
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNext();
        }
    }

    public void removeLast() {
        if (head == null || head.getNext() == null) {
            head = null;
            return;
        }

        Link curLink = head;
        while (curLink.getNext().getNext() != null) {
            curLink = curLink.getNext();
        }
        curLink.setNext(null);
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size() || head == null) {
            System.out.println("Неверный индекс или список пуст.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Link curLink = head;
        for (int i = 0; i < index - 1; i++) {
            curLink = curLink.getNext();
        }
        curLink.setNext(curLink.getNext().getNext());
    }

    public int getByIndex(int index) {
        Link curLink = head;

        int i = 0;
        for (; i < index; i++) {
            curLink = curLink.getNext();
        }

        return curLink.getValue();
    }

    public int getIndexByValue(int value) {
        int index = 0;
        Link curLink = head;

        while (curLink != null) {
            if (curLink.getValue() == value)
                return index;
            curLink = curLink.getNext();
            index++;
        }
        // не нашли
        return -1;
    }

    public int size() {
        int i = 0;
        Link curLink = head;
        while (curLink != null) {
            i++;
            curLink = curLink.getNext();
        }
        return i;
    }

    public String print() {
        StringBuilder result = new StringBuilder();
        if (size() == 0) {
            result.append("<empty>");
        } else {
            result.append("|-> ").append(head.value);
            Link current = head.getNext();
            while (current != null) {
                result.append(", ").append(current.getValue());
                current = current.getNext();
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        System.out.println(list.print());

        list.pushToHead(10);
        list.pushToHead(20);
        list.pushToHead(30);
        list.pushToTail(40);

        System.out.println(list.print());

        System.out.println("15 at: " + list.getIndexByValue(15));
        System.out.println("20 at: " + list.getIndexByValue(20));

    }

    //    2.Написать метод класса MyLinkedList (придумать алгоритм), который определяет, есть ли в односвязном спуске петля. Нельзя использовать дополнительные коллекции.
//boolean hasLoop() { … }
    public boolean hasLoop() {
        if (head == null || head.getNext() == null) {
            return false;
        }

        Link slow = head;
        Link fast = head;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // 3. Написать метод класса MyLinkedList (придумать алгоритм), который находит значение К-ого элемента с конца в односвязном списке. Алгоритм должен проходить список один раз.
//int getValueFromTail(int positionFromTail) { … }
    public int getValueFromTail(int positionFromTail) {
        if (head == null || positionFromTail < 0) {
            return -1;
        }

        Link first = head;
        Link second = head;

        for (int i = 0; i < positionFromTail; i++) {
            if (first.getNext() == null) {
                return -1;
            }
            first = first.getNext();
        }

        while (first.getNext() != null) {
            first = first.getNext();
            second = second.getNext();
        }
        return second.getValue();
    }

}
