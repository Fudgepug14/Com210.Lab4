package main.java.Lab4;

public class linkedList {
    private link first;

    public linkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int d){
        link newLink = new link(d);
        newLink.next = first;
        first = newLink;
    }

    public link deleteFirst(){
        link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.print("First to Last:");
        link current = first; 
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public linkedList reorder(linkedList sample){



        return null;
    }
}
