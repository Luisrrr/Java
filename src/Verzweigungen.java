import java.util.Scanner;

public class Verzweigungen {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Aufgabe (1-3): ");
        int input = scan.nextInt();

        switch (input)
        {
            case 1: Maximum(); break;
            case 2: MonatsName(); break;
            case 3: IstSatzzeichen(); break;
        }
    }

    static void Maximum()
    {
        System.out.print("\nGib 3 Zahlen ein (x,y,z): ");
        String input = scan.nextLine();
        String[] splits = input.split(", ");
        double[] nums = new double[] { Double.parseDouble(splits[0]), Double.parseDouble(splits[1]),
                                        Double.parseDouble(splits[2]) };

        if (nums[0] > nums[1] && nums[0] > nums[2])
            System.out.println(nums[0] + " ist das Maximum.");
        else if (nums[1] > nums[0] && nums[1] > nums[2])
            System.out.println(nums[1] + " ist das Maximum.");
        else if (nums[2] > nums[0] && nums[2] > nums[1])
            System.out.println(nums[2] + " ist das Maximum.");
    }

    static void MonatsName()
    {
        System.out.print("Gib die Zahl des Monats ein: ");
        int num = scan.nextInt();
        switch (num)
        {
            case 1: System.out.println("Januar, 31"); break;
            case 2: System.out.println("Februar, 28/29"); break;
            case 3: System.out.println("März, 31"); break;
            case 4: System.out.println("April, 30"); break;
            case 5: System.out.println("Mai, 31"); break;
            case 6: System.out.println("Juni, 30"); break;
            case 7: System.out.println("Juli, 31"); break;
            case 8: System.out.println("August, 31"); break;
            case 9: System.out.println("September, 30"); break;
            case 10: System.out.println("Oktober, 31"); break;
            case 11: System.out.println("November, 30"); break;
            case 12: System.out.println("Dezember, 31"); break;
        }
    }

    static void IstSatzzeichen()
    {
        System.out.print("Gib ein Zeichen ein: ");
        String input = scan.next();

        switch (input)
        {
            case ".":
            case ",":
            case ":":
            case ";":
            case "-":
            case "(":
            case ")":
            case "!":
            case "\"": System.out.println("Ist ein Satzzeichen."); break;

            default: System.out.println("Ist kein Satzzeichen."); break;
        }
    }
}
