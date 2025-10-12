package ex_16_Arrays;

public class Lab082_3D_Array {
    public static void main(String[] args) {
        int[][][] arr_3D = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9},
                        {10,11,12}
                }
        };

        for (int i = 0; i < arr_3D.length; i++) {
            for (int j = 0; j < arr_3D[0].length; j++) {
                for (int k = 0; k < arr_3D[0][0].length; k++) {
                    System.out.print(arr_3D[i][j][k]+"|");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
