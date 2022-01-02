public class Two_dimension {
    
   
        public static void main(String[] args) {
            int i,j;
            int line=1;
            int arr[][]= new int[3][3];
            
            for( i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                   arr[i][j]=line; 
                   line++;
                }
            }
             for( i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                   System.out.print(" "+arr[i][j]);
                }
                System.out.println();
            }
        }
    }
