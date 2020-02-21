package Fourth;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 'f', 'r'};
        char[] copyToArray = new char [8];
        System.out.println(new String(copyToArray));
        System.arraycopy(copyFrom, 2, copyToArray, 0, 8);
        System.out.println(new String(copyToArray));
    }
}
