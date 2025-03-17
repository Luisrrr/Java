package Automat;

public class Ticket
{
    public int ankunftsZeit;
    private boolean bezahlt;

    public Ticket(int _ankunftsZeit)
    {
        ankunftsZeit = _ankunftsZeit;
    }

    public void AlsBezahltMarkieren()
    {
        bezahlt = true;
    }
}
