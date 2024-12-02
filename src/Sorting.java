import java.util.Random;

public class Sorting {
    static Random rd = new Random();

    public static void main(String[] args)
    {
        int[] arr = RandomArray(25);
        System.out.println("Zufälliger Array:");
        PrintArray(arr);

        int[] sorted = Sort(arr);
        System.out.println("Sortierter Array:");
        PrintArray(sorted);
    }

    static int[] Sort(int[] arr)
    {
        int iterations = 0;
        while (!IsSorted(arr))
        {
            iterations++;
            for (int c = 1; c < arr.length; c++)
            {
                if (arr[c - 1] > arr[c])
                {
                    // Tausche das vorherige Element durch das jetzige
                    int temp = arr[c - 1];
                    arr[c - 1] = arr[c];
                    arr[c] = temp;
                }
            }
            // PrintArray(arr);
        }
        System.out.println("\nArray Iterationen: " + iterations);
        return arr;
    }

    static boolean IsSorted(int[] arr)
    {
        for (int c = 1; c < arr.length; c++)
        {
            if (arr[c - 1] > arr[c])
                return false;
        }
        return true;
    }

    static int[] RandomArray(int max)
    {
        int[] arr = new int[max];
        for (int c = 0; c < arr.length; c++)
        {
            arr[c] = rd.nextInt(max) + 1;
        }
        return arr;
    }

    static void PrintArray(int[] arr)
    {
        for (int c = 0; c < arr.length; c++)
        {
            System.out.print(arr[c]);
            if (c != arr.length - 1) // Am Ende soll kein Komma sein
                System.out.print(", ");
        }
        System.out.println();
    }
}
