import java.util.Random;
import java.util.ArrayList;

public class MinSort
{
    static Random rd = new Random();

    public static void main(String[] args)
    {
        ArrayList<Integer> arr = RandomArray(8);
        System.out.println("Zufälliger Array: " + ArrayToString(arr) + "\n");

        int[] sorted = Sort(arr);
        System.out.println(ArrayToString(sorted));
    }

    static int[] Sort(ArrayList<Integer> arr)
    {
        int length = arr.size();
        int[] sorted = new int[arr.size()];

        int comparisons = 0;
        for (int i = 0; i < length; i++)
        {
            int min = 2147483647; // Maximaler int
            int minIndex = -1;
            for (int c = 0; c < arr.size(); c++)
            {
                comparisons++;

                if (arr.get(c) < min)
                {
                    min = arr.get(c);
                    minIndex = c;
                }
            }

            sorted[i] = arr.get(minIndex);
            arr.remove(minIndex);

            System.out.println("Sortiert: " + ArrayToString(sorted));
            System.out.println("Unsortiert: " + ArrayToString(arr));
            System.out.println();
        }
        System.out.println(comparisons);

        return sorted;
    }

    static ArrayList<Integer> RandomArray(int max)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int c = 0; c < max; c++)
        {
            arr.add(rd.nextInt(max) + 1);
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

    static String ArrayToString(ArrayList<Integer> arr)
    {
        String str = "";

        for (int c = 0; c < arr.size(); c++)
        {
            str += arr.get(c);
            if (c != arr.size() - 1) // Am Ende soll kein Komma sein
                str += ", ";
        }

        return str;
    }
}
