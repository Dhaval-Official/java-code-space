package ex_07_Increment_Decrement_Operator;

public class Lab046_Advance_Questions {
    public static void main(String[] args) {

//        int a = 10;

//        System.out.println(a++ + a);        //internally 10(post increment) + 11(value of a is incremented now)

//        int b = 5;
//        System.out.println(b++ + ++b);

        int c = 10;
        System.out.println(++c + ++c);

//        int x = 10; int y = x++ + ++x + --x + x--; System.out.println(y);


        int marks=29; if(marks > 29); System.out.print("PASS "); System.out.println("RANK");

        int horses = 10; int camels = 5; if(horses > 5) { if(camels > 3) { System.out.println("FOREST"); } } else { System.out.println("CITY"); }
//        int a = 3; if(a > 0) if(a > 2) if(a > 4) System.out.print("A"); else System.out.print("B"); else System.out.print("C"); else System.out.print("D");
        int x = 1; if(x > 0) if(x > 2) System.out.print("A"); else if(x > -1) System.out.print("B"); else System.out.print("C"); else System.out.print("D");

        int a=1; while(a<4) { System.out.print(a + " "); a++; }
        System.out.println();
        int cnt=0; while(true) { if(cnt > 4) break; if(cnt==0) { cnt++; continue; } System.out.print(cnt + ","); cnt++; }
        int age=20; do { age++; }while(age<20); System.out.println(age);



        System.out.println();
        int score=1; for(; true; score++) { System.out.print(score +","); if(score > 3) break; }
        String countries[] = {"BRAZIL", "CHILE", "SYDNEY"}; int i=0; for(String str: countries) { if(i<2) ; else break; System.out.print(str + ","); i++; }

    }

}
