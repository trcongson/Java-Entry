package codegym.todo;

public class Entry {
    private static int count = 0;
    private int priority = 0;
    private String notes;

    public Entry(){}

    public Entry(int priority,String notes){
        this.priority = priority;
        this.notes = notes;
        count++;
    }

    public int getPriority(){
        return priority;
    }
    public static int getCount(){
        return count;
    }
    public String getNotes(){
        return notes;
    }
}
