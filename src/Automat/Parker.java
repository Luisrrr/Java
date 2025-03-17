package Automat;

public class Parker
{
    public float geld;
    public Ticket ticket;

    public Parker(float _geld)
    {
        geld = _geld;
    }

    public void TicketEinschieben(Automat automat)
    {
        automat.TicketEinziehen(ticket);
        ticket = null;
    }

    public void TicketNehmen(Automat automat)
    {
        ticket = automat.TicketAusgeben();
    }

    public void GebuehrBezahlen(Automat automat)
    {
        automat.GebuehrAnzeigen();
        geld -= automat.display;
    }
}
