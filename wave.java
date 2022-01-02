class wave
{
    static int Row = 4;
    static int Colomn = 4;
     
   
    static void WavePrint(int m, int n, int arr[][])
    {
        int i, j = n - 1, wave = 1;
     
      
        while (j >= 0)
        {
             
            // Check whether to go in
            // upward or downward
            if (wave == 1)
            {
                // Print the element of the matrix
                // downward since the value of wave = 1
                for (i = 0; i < m; i++)
                    System.out.print(arr[i][j] +" ");
             
                wave = 0;
                j--;
            }
            else {
                 
               
                for (i = m - 1; i >= 0; i--)
                    System.out.print( arr[i][j] + " ");
                 
                wave = 1;
                j--;
            }
        }
    }
     
    
    public static void main (String[] args)
    {
        int arr[][] = { {0,1,2,3 },
                    { 4,5, 6, 7 },
                    { 8,9, 10, 11 },
                    { 10,13, 14, 15 } };            
        WavePrint(Row, Colomn, arr);  
     
    }
}