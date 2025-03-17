package Vererbung;
import java.util.ArrayList;

public class Main
{
    private static ArrayList<Character> characters = new ArrayList<Character>();
    
    public static void main(String[] args)
    {
        Mage alfred = new Mage("Alfred", 20, 5, 3, 100, 60, "Galaxienblaster");
        characters.add(alfred);
        
        Warrior martin = new Warrior("Martin", 15, 3, 2, 3, 3);
        characters.add(martin);
        
        PrintCharacters();
        
        alfred.CastSpellAt(martin);
        alfred.CastSpellAt(martin);
        
        for (int c = 0; c < 6; c++)
        {
            martin.Attack(alfred);
            System.out.println();
        }
        
        PrintCharacters();
    }
    
    static void PrintCharacters()
    {
        for (int i = 0; i < characters.size(); i++)
        {
            System.out.println(characters.get(i).name + 
                                " | HP: " + characters.get(i).hp + 
                                " --- DMG: " + characters.get(i).damage + 
                                " --- DEF: " + characters.get(i).defense);
        }
    }
}
