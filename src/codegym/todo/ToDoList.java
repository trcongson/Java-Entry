package codegym.todo;

public class ToDoList {
    private Entry[] list;
    private int length;

    public ToDoList(){}

    public ToDoList(Entry[] list, int length){
        this.list = list;
        this.length = length;
    }
    public void addEntry (Entry entry){
        list[length] = entry;
        length++;
    }

    public void showTodoList(){
        if (length > 0){
            for (int i =0; i < length; i++){
                System.out.println("\t" + i + " - [" +list[i].getPriority()+"]"+list[i].getNotes() );
            }
        }else{
            System.out.println("Không có dữ liệu");
        }
    }

}
