//Checking the default values of differant type of arrays and differant types of class fields
public class Array {
    int a;
    char b;
    boolean c;
    public static void main(String[] args) {
        int [] arrInt = new int[5];
        Array arrArray[] = new Array[5]; 
        float[] arrFloat = new float[4];
        boolean[] arrBool = new boolean[5];
        char[] arrChar = new char[5];

        System.out.println(arrInt[0]);
        System.out.println(arrArray[0]);
        System.out.println(arrBool[0]);
        System.out.println(arrChar[0]);

        Array a = new Array();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);


    }
    
}
