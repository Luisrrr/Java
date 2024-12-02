import java.util.Random;

public class MinMax {
    static Random rd = new Random();

    public static void main(String[] args) {
        int[] rdNums = RandomArray(10, 30);

        PrintArray(rdNums);

        int[] minMax = MinMax(rdNums);
        PrintArray(minMax);
    }

    static int[] RandomArray(int length, int max)
    {
        int[] arr = new int[length];
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

    static int[] MinMax(int[] arr)
    {
        int min = 9999;
        int max = 0;
        for (int c = 0; c < arr.length; c++)
        {
            if (arr[c] > max)
                max = arr[c];
            if (arr[c] < min)
                min = arr[c];
        }
        return new int[] { min, max };
    }
}
