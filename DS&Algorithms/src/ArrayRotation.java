
public class ArrayRotation {
	/*Function to left rotate arr[] of siz n by d*/
    void leftRotate(int arr[], int d, int n) 
    {
        int i, j, k, temp;
        int val = gcd(d, n);
        for (i = 0; i < val; i++) 
        {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) 
            {
                k = j + d;
                if (k >= n) 
                    k = k - n;
                if (k == i) 
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    
    /*UTILITY FUNCTIONS*/
    
    /* function to print an array */
    void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
 
    /*Fuction to get gcd of a and b*/
    int gcd(int a, int b) 
    {
    	while (a != b)
        {
            if (a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }
 
    // Driver program to test above functions
    public static void main(String[] args) {
    	ArrayRotation rotate = new ArrayRotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}
