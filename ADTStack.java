
package DSAWeek3;



public interface ADTStack<E> {
    
    public void createStack( );
    public int size( );
    public boolean isEmpty( );
    public boolean isFull( );
    public void push ( E e );
    public E pop ( );
} 
