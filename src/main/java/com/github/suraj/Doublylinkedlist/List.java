package com.github.suraj.Doublylinkedlist;

public interface List {
    public void addFirst(int element);
    public void addLast(int element);
    public int getSize();
    public void add(int index, int element);
    public void deleteFirst();
    public void deleteLast();
    public void delete(int index);
    public void getElement(int index);
    public boolean isEmpty();
    public void emptyList();
}
