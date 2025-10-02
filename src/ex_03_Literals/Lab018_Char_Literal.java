package ex_03_Literals;

public class Lab018_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A';      //A to z !@#$%^&*()_+
//      char c2 = "A";    // this literal gets treated as a String

        char new_line = '\n';
        char tab = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Dhaval"+new_line+"Lakhani");
        System.out.println("Dhaval"+tab+"Lakhani");
        System.out.println("Dhaval"+back_space+"Lakhani");
        System.out.println("Dhaval"+carriage_return+"Lakhani");

        char c3 = 'A';
        //character     ASCII   Unicode
        //A             65      /u0041
        //a             97      /u0061
        //1             49      /u0031

        char my_laugh_smiley = '\u1f60';
        System.out.println(my_laugh_smiley);

        char letterA = '\u0041';
        System.out.println(letterA);

    }
}
