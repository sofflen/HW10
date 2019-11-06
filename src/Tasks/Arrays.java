//Написать итератор по массиву
package Tasks;

import java.util.Iterator;

public class Arrays<T> implements Iterable {

    private T[] arr;
    private int size;

    public Arrays(T[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size && arr[index] != null;
            }

            @Override
            public T next() {
                return arr[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}