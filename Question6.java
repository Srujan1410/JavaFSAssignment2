import java.util.Arrays;
class Question6{

   static boolean isSubset(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
 
        if (m < n)
            return false;
 
        Arrays.sort(arr1); // sorts arr1
        Arrays.sort(arr2); // sorts arr2
 
        while (i < n && j < m) {
            if (arr1[j] < arr2[i])
                j++;
            else if (arr1[j] == arr2[i]) {
                j++;
                i++;
            }
            else if (arr1[j] > arr2[i])
                return false;
        }
 
        if (i < n)
            return false;
        else
            return true;
    }
 
    
    public static void main(String args[])
    {
        int arr1[] = { 11, 10, 13, 21, 30, 70 };
        int arr2[] = { 11, 30, 70, 10 };
    
        int m = arr1.length;
        int n = arr2.length;
        System.out.println("---Question6---");
        
        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2 is subset of arr1 ");
        else
            System.out.print("arr2 is not subset of arr1 ");
 
    }
}