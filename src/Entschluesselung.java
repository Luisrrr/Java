import java.util.Scanner;

public class Entschluesselung
{
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String randomAlphabet = "QWERTYUIOPASDFGHJKLZXCVBNM";

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.println("Was willst du tun?");
            System.out.println("1 - Verschlüsseln\t2 - Entschlüsseln\t3 - Exit");

            int input = scan.nextInt();
            if (input == 3) return;

            Scanner scan2 = new Scanner(System.in); // Neuer Scanner, sonst funktioniert scan.nextLine nicht
            System.out.println("Gebe deinen String ein: ");
            String str = scan2.nextLine();

            if (input == 1)
            {
                System.out.println("Verschlüsselter String: " + Encrypt(str));
            }
            else
            {
                System.out.println("Verschlüsselter String: " + Decrypt(str));
            }
        }
    }

    static String Encrypt(String str)
    {
        str = str.toUpperCase();
        String encrypted = "";

        for (int c = 0; c < str.length(); c++)
        {
            int alphabetIndex = alphabet.indexOf(str.charAt(c));
            if (alphabetIndex == -1) // Dieses Symbol existiert nicht im Alphabet String
            {
                encrypted += str.charAt(c);
                continue;
            }
            encrypted += randomAlphabet.charAt(alphabetIndex);
        }

        return Reverse(encrypted);
    }

    static String Decrypt(String str)
    {
        str = str.toUpperCase();
        String decrypted = "";

        for (int c = 0; c < str.length(); c++)
        {
            int alphabetIndex = randomAlphabet.indexOf(str.charAt(c));
            if (alphabetIndex == -1) // Dieses Symbol existiert nicht im Alphabet String
            {
                decrypted += str.charAt(c);
                continue;
            }
            decrypted += alphabet.charAt(alphabetIndex);
        }

        return Reverse(decrypted);
    }

    static String Reverse(String str)
    {
        String reversed = "";

        for (int c = 0; c < str.length(); c++)
        {
            reversed += str.charAt(str.length() - c - 1);
        }

        return reversed;
    }
}
