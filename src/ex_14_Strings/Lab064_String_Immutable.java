package ex_14_Strings;

public class Lab064_String_Immutable {
    public static void main(String[] args) {
        String name = "Dhaval";         //Dhaval is in SCP
        name.toUpperCase();             //this needs to assign somewhere
        name = name.toUpperCase();      //DHAVAL is also in SCP now,  Dhaval is there in scp but not getting referred to anymore
        System.out.println(name);

        String s = new String("Dhaval");    //this one lives on the HEAP memory or Object area

    }
}
