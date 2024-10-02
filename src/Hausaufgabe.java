import java.util.*;

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
    public static Map<String, Product> products = new HashMap<>(); // Dictionary


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Product schokolade = new Product("Schokolade", 5, 3);

        products.put(schokolade.name, schokolade);

        List<Product> warenkorb = new ArrayList<>();

        while (true)
        {
            PrintStock();
            System.out.print("Was möchtest du kaufen? ");
            String wunsch = scan.nextLine();
        }
    }

    static void PrintStock()
    {
        Product product;
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            product = entry.getValue();

            System.out.println(entry.getKey() + " | Preis: " + product.price + "€ | Anzahl: " + product.quantity);
        }
    }
}
