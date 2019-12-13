/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fourth;

/**
 *
 * @author PC
 */
public class FindIndexofArray {
        public static int findIndex (int [] myArray, int t){
        int len = myArray.length;
        int i = 0;
        while (i < len){
            if (myArray[i] == t )
                return i;
            else i=i+1;
        }
            return -1;
    }
        public static void main(String[] args) {
        int [] myArray = {24, 52, 11, 56, 44, 22, 44, 66};
            System.out.println("Index postion of 52 is: "+ findIndex(myArray, 52));
            System.out.println("Index postion of 66 is: " + findIndex(myArray, 66));
    }
}
