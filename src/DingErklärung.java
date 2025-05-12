import java.util.Arrays;

public class DingErklärung
{
    static String green = "\u001B[32m";
    static String colorReset = "\u001B[0m";

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(SelectionSort(new int[] { 8, 5, 3, 1 })));
    }

    static int[] SelectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("i: " + i);
            int minPos = MinimumPosition(i, arr);
            if (minPos == i) // Verbesserung?
                return arr;

            System.out.println("Minimum: " + arr[minPos]);
            System.out.println("Tausche " + arr[minPos] + " mit " + arr[i]);
            Swap(minPos, i, arr);
            System.out.println("Zwischenstand: " + ToStringHighlight(arr, new int[] { minPos, i }));
            System.out.println("----------------");
        }
        return arr;
    }

    static int MinimumPosition(int from, int[] arr)
    {
        System.out.println("\t----------------");

        int minPos = from;
        System.out.println("\tminPos = " + minPos); // \t = tab
        for (int i = from + 1; i < arr.length; i++)
        {
            System.out.println("\ti: " + i);
            System.out.print("\t" + arr[i] + " < " + arr[minPos] + "?");
            System.out.print(arr[i] < arr[minPos] ? " Ja!" : " Nö!");
            if (arr[i] < arr[minPos])
                minPos = i;
            System.out.println("\n\tminPos = " + minPos);
            System.out.println("\t----------------");
        }
        return minPos;
    }

    static void Swap(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static String ToStringHighlight(int[] arr, int[] highlights)
    {
        String str = "";
        for (int i = 0; i < arr.length; i++)
        {
            if (ArrayContains(highlights, i))
            {
                str += green + arr[i] + colorReset;
                continue;
            }
            str += arr[i];
        }

        return str;
    }

    static boolean ArrayContains(int[] arr, int element)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == element)
                return true;
        }
        return false;
    }
}
