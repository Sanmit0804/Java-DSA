// Time complexity -> O(n)

public class code1LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] == 8)
            {
                System.out.print("8 is located at index: "+ i);
                return;
            }
        }
    }
}