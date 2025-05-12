import java.util.Random;

public class BubbleSort
{
    static Random rd = new Random();

    public static void main(String[] args)
    {
        int[] arr = RandomArray(8);
        System.out.println("Zufälliger Array: " + ArrayToString(arr) + "\n");

        int[] sorted = Sort(arr);
        System.out.println(ArrayToString(sorted));
    }

    static int[] Sort(int[] arr)
    {
        int iterations = 0;
        int totalComparisons = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            int comparisons = 0;

            for (int c = 1; c < arr.length - iterations; c++)
            {
                comparisons++;
                totalComparisons++;

                if (arr[c - 1] > arr[c])
                {
                    // Tausche das vorherige Element durch das jetzige
                    int temp = arr[c - 1];
                    arr[c - 1] = arr[c];
                    arr[c] = temp;
                }
            }

            iterations++;
            System.out.println(iterations + ". Iteration, " + comparisons + " Vergleiche: " + ArrayToString(arr));
        }

        System.out.println();
        System.out.println(iterations + " Iterationen, " + totalComparisons + " Vergleiche insgesamt.");

        return arr;
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

    static String ArrayToString(int[] arr)
    {
        String str = "";

        for (int c = 0; c < arr.length; c++)
        {
            str += arr[c];
            if (c != arr.length - 1) // Am Ende soll kein Komma sein
                str += ", ";
        }

        return str;
    }
}
