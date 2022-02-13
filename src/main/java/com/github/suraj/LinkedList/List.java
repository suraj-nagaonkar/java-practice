package com.github.suraj.LinkedList;

public interface List {
    public void addFirst(int element);
    public void addLast(int element);
    public void print();
    public void deleteFirst();
    public void deleteLast();
    public void add(int index, int element);
    public void delete(int index);
    public int get(int index);
    public boolean isEmpty();
    public void emptyList();
    public void deleteN(int n);
    public void findNumber();
    public void more25();
    public void reverse();
}
