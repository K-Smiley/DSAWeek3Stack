package week3;

public interface IADTStack<E> {

    public void createStack();

    public int size();

    public boolean isEmpty();

    public boolean isFull();

    public void push(String item);

    public E pop();

 

 
}
