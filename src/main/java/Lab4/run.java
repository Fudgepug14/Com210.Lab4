package main.java.Lab4;

public class run {
    public static void main(String[] args) {
        linkedList sample = new linkedList();
        sample.insertFirst(2);
        sample.insertLast(1);
        sample.insertLast(3);
        sample.insertLast(5);
        sample.insertLast(6);
        sample.insertLast(4);
        sample.insertLast(7);

        sample.displayList();
        System.out.println("reordering...");
        linkedList x = sample.reorder(sample);
        
        x.displayList();

    } 
}




