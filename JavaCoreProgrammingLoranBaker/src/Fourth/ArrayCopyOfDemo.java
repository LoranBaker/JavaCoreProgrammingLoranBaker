package Fourth;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 'f', 'r'};
        char[] copyToArray = Arrays.copyOfRange(copyFrom, 2, 10);
        System.out.println(new String(copyToArray));
        
    }
}
