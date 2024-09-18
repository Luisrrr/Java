import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

class Product
{
    String name;
    float price;
    int quantity;
    public boolean inStock() { return quantity > 0; }

    public Product(String _name, float _price, int _quantity)
    {
        name = _name;
        price = _price;
        quantity = _quantity;
    }
}

public class Hausaufgabe {
    public static Dictionary<String, Product> products = new Hashtable<>();


    public static void main(String[] args)
    {
        Product schokolade = new Product("Schokolade", 5, 3);

        products.put(schokolade.name, schokolade);

        PrintStock();
    }

    static void PrintStock()
    {

    }
}
