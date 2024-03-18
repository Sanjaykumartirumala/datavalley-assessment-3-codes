import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeProduct
  {
    public static void main(String[] args) 
    {
        try
          {
            FileInputStream fileInput = new FileInputStream("product.ser");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            Product product = (Product) objectInput.readObject();

            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Product Category: " + product.getCategory());
            System.out.println("Product Price: " + product.getPrice());

            objectInput.close();
            fileInput.close();
        }
        catch (IOException ex)
          {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex)
          {
            System.out.println("Product class not found.");
            ex.printStackTrace();
        }
    }
}

class Product implements java.io.Serializable
  {
    private int id;
    private String name;
    private String category;
    private double price;

    public Product() {
    }

   
    public Product(int id, String name, String category, double price) 
    {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public String toString()
    {
        return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
    }
}
