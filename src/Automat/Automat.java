package Automat;

public class Automat
{
    public float display;
    public int aktuelleUhrzeit;
    private float stundenPreis;
    private Ticket aktuellesTicket;

    public Automat(int uhrzeit, float _stundenPreis)
    {
        aktuelleUhrzeit = uhrzeit;
        stundenPreis = _stundenPreis;
    }

    float GebuehrBerechnen(int ankunftsZeit)
    {
        return (aktuelleUhrzeit - ankunftsZeit) * stundenPreis;
    }

    // Nutzlose Methode
    public void GebuehrAnzeigen()
    {
        display = GebuehrBerechnen(aktuellesTicket.ankunftsZeit);
    }

    public void TicketEinziehen(Ticket ticket)
    {
        aktuellesTicket = ticket;
    }

    public Ticket TicketAusgeben()
    {
        return new Ticket(aktuelleUhrzeit);
    }

    public void TicketMarkieren(Ticket ticket)
    {
        // ??
        ticket.AlsBezahltMarkieren();
    }
}
