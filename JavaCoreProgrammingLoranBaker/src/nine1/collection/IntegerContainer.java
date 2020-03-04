
package nine1.collection;

import java.util.Iterator;

public class IntegerContainer implements Iterable<Integer> {
    private final static int SIZE = 15;
    private Integer[] numbers = new Integer[SIZE];

    public IntegerContainer() {
       
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = i;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NeparniIterator();
    }

    private class ParniIterator implements Iterator<Integer> {

        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return (nextIndex < SIZE);
        }

        @Override
        public Integer next() {
            Integer value = numbers[nextIndex];
            nextIndex = nextIndex + 2;
            return value;
        }
    }

    private class NeparniIterator implements Iterator<Integer> {

        private int nextIndex = 1;

        @Override
        public boolean hasNext() {
            return (nextIndex < SIZE);
        }

        @Override
        public Integer next() {
            Integer value = numbers[nextIndex];
            nextIndex = nextIndex + 2;
            return value;
        }
    }
}