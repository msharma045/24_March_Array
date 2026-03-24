import java.util.Scanner; 
public class ArrayInput {
    
    public static void main(String arg[])
    {
      int even=0;
      int odd=0;
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Enter Size of Array =");
           int size= scanner.nextInt();
             System.out.println("Enter Elements =");
           int arr[]=new int [size];
           for(int i=0;i<size; i++)
           {
   arr[i]=scanner.nextInt();
           }
           System.out.println("OUtput=");
           for(int i=0;i<=size;i++)
 {
  if(arr[i]%2==0)
  {
          even++;
  }else
  {
          odd++;
  }
          
 }
        }
       System.out.println("Even="+even);
        System.out.println("odd="+odd);
    }
}