package Laden;

public class Regal
{
    public String standort;
    public Ware[] inhaltsfaecher = new Ware[3];

    public Regal(String _standort)
    {
        standort = _standort;
    }

    public void WareAufnehmen(int fach, Ware ware)
    {
        inhaltsfaecher[fach] = ware;
    }

    public String ToString()
    {
        String str = "";
        for (int c = 0; c < inhaltsfaecher.length; c++)
        {
            if (inhaltsfaecher[c] == null)
            {
                str += "Leer\n";
                continue;
            }
            str += inhaltsfaecher[c].name + " " + inhaltsfaecher[c].artNr + "\n";
        }
        return str;
    }
}
