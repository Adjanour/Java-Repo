import java.util.Arrays;
import java.util.Comparator;

public class MultidimemsionalArrays {

    public static void main(String[] args) {
        //Create 2D Array
        double[][] marks = new double[5][2];
        int[][] newMarks = {{3,4},{7,1},{3,1},{8,2},{2,4}};

        //largest dimension is 255 ie double[][][][]....

        System.out.println(Arrays.deepToString(newMarks));
        System.out.println(newMarks.length);
        System.out.println(newMarks[0].length);

        // Arrays.sort(newMarks, new Comparator<int[5]>() {
        //     public int comparator(int[]a,int[]b){
        //         return Integer.compare(a[1], b[1]);
        //     }
        // });
        
        for(int i = 0; i<marks.length;++i){
            for(int j = 0; j<marks[i].length;++j){
                marks[i][j] = Utils.toDecimalPlace(Math.random() * 10, 2);
            }
        }

        System.out.println(Arrays.deepToString(marks));
        Arrays.sort(marks, new Comparator<double[]> () {
                public int compare (double[] a,double[] b){
                    return Double.compare(a[1], b[1]);
                }
            });
        System.out.println(Arrays.deepToString(marks));
    }
    
}
