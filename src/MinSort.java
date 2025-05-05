import java.util.Random;
import java.util.ArrayList;

public class MinSort
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
        int length = arr.length;
        int[] sorted = new int[arr.length];

        // int Listen gibt es irgendwie nicht
        ArrayList<Integer> unsorted = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            unsorted.add(arr[i]);
        }

        int comparisons = 0;
        for (int i = 0; i < length; i++)
        {
            int min = 2147483647; // Maximaler int
            int minIndex = -1;
            for (int c = 0; c < unsorted.size(); c++)
            {
                comparisons++;

                if (unsorted.get(c) < min)
                {
                    min = unsorted.get(c);
                    minIndex = c;
                }
            }

            sorted[i] = unsorted.get(minIndex);
            unsorted.remove(minIndex);

            System.out.println(ArrayToString(sorted));
        }
        System.out.println(comparisons);

        return sorted;
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
