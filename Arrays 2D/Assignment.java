// Print the number of 7's that are in the 2D array.
// Output = 2

public class Assignment {
    public static void count(int[][] array, int key) {
        int counter = 0;
        for(int i = 0; i<array.length ; i++)
        {
            for(int j = 0; j<array[0].length ; j++)
            {
                if(array[i][j] == 7)
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        int[][] array = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        int key = 7;
        count(array, key);
    }
}
