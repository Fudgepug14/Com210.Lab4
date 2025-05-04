package main.java.Lab4;

public class link {
    public int data;
    public link next;

    public link(int d){
        data=d;
        next=null;
    }

    public void displayLink(){
        System.out.print("{"+data+"}");
    }
}
