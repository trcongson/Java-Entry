package codegym.todo;

public class ToDoList {
    private Entry[] list;
    private int length;

    public ToDoList(){}

    public ToDoList(Entry[] list, int length){
        this.list = list;
        this.length = length;
    }


}
