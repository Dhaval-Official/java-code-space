package ex_15_String_Builder_Buffer;

public class Lab070_String_Builder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Dhaval");     //String created in Heap area

        sb.reverse();
        System.out.println(sb.reverse());       //make it back to Dhaval

        //only 1 String has existed throughout whole program

    }

}
