public class ArraySum 
{
public static int sumArray(int[] arr)
{
int sum = 0; 
for (int num : arr)
{
sum += num; 
}
return sum; 
}
public static void main(String[] args) 
{
int[] myArray = {1, 2, 3, 4, 5};
int result = sumArray(myArray);
System.out.println("The sum of the array is: " + result);
    }
}

