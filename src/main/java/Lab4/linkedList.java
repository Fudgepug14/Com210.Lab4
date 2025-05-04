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

    public void insertLast(int d){
        if (isEmpty()){
            insertFirst(d);
            return;
        }
        link current = first;
        while(current.next != null){
            current = current.next;
        }
        link newLink = new link(d); 
        current.next = newLink;
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
        linkedList odds = new linkedList();
        linkedList evens = new linkedList();
        link current = sample.first;
        int counter = 1;

        while(current != null){
            if((counter % 2) == 1){
                odds.insertLast(current.data);
            } else {
                evens.insertLast(current.data);
            }
            current = current.next;
            counter++;
        }
        
        current = odds.first;
        while(current.next != null){
            current = current.next;
        }
        
        current.next = evens.first;

        return odds;
    }
}
