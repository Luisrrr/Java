import java.util.Scanner;

public class NutzloseKomprimierung {
    public static void main(String[] args) {
        System.out.println("Gib deinen String ein: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println("Komprimiert: " + Compress(str));
    }

    static String Compress(String str)
    {
        str += "\\"; // Damit der Loop noch eins weiter läuft
        String compressed = "";
        char lastChar = ' ';
        int charactersInARow = 0;
        for (int c = 0; c < str.length(); c++)
        {
            if (str.charAt(c) == lastChar)
            {
                charactersInARow++;
                continue;
            }

            if (charactersInARow >= 3)
            {
                compressed += "\\" + lastChar + charactersInARow;
                compressed += str.charAt(c);
            }
            else if (charactersInARow == 0)
                compressed += str.charAt(c);

            charactersInARow = 0;
            lastChar = str.charAt(c);
        }
        return compressed;
    }

    static String RepeatCharacter(char character, int repeat)
    {
        String str = "";
        for (int c = 0; c < repeat; c++)
        {
            str += character;
        }
        return str;
    }
}
