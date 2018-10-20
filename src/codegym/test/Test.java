package codegym.test;

import codegym.todo.Entry;
import codegym.todo.ToDoList;

public class Test {
    public static void main(String[] args) {
        Entry[] entry = new Entry[10];

        System.out.println("Có tổng cộng" + Entry.getCount() + " entry." );
        ToDoList toDoList = new ToDoList(entry, Entry.getCount());

        int n =0;
        entry[n] = new Entry(0, "Tập thể dục lúc 5h");
        toDoList.addEntry(entry[n]);
        n++;

        entry[n] = new Entry(1, "Ăn sáng lúc 6h");
        toDoList.addEntry(entry[n]);
        n++;

        entry[n] = new Entry(0, "Đi học lúc 7h");
        toDoList.addEntry(entry[n]);
        n++;

        entry[n] = new Entry(0, "Lập kế hoạch ngày lúc 8h");
        toDoList.addEntry(entry[n]);
        n++;

        entry[n] = new Entry(0, "Làm bài tập lúc 8h30");
        toDoList.addEntry(entry[n]);
        n++;

        toDoList.showTodoList();
        System.out.println();
        toDoList.sortList();
        toDoList.removeEntry(3);
        toDoList.showTodoList();
    }
}
