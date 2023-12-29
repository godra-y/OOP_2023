package task3;

public interface MyCollection <E>{
    boolean add(E element);

    boolean remove(E element);

    boolean contains(E element);

    int size();
    
    boolean isEmpty();

    void clear();

    Object[] toArray();

    boolean allowsDuplicates();

    boolean isOrdered();
}
