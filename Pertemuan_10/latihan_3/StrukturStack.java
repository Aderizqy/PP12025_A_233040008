package Pertemuan_10.latihan_3;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int top;

    public StrukturStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    public void push(int data) {
        array[++top] = data;
        System.out.println("Push elemen: " + data);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public int top() {
        if (!isEmpty()) {
            return array[top];
        } else {
            System.out.println("Stack kosong.");
            return -1;
        }
    }
}

