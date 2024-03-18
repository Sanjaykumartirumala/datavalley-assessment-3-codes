class Temple 
{
    String pray(String deity) 
  {
        return "Offering prayers to " + deity + ".";
    }

    String pray(String deity, String offering) 
  {
        return "Offering " + offering + " to " + deity + ".";
    }
}

class Festival 
{
    void celebrate()
  {
        System.out.println("Celebrating the festival with joy and happiness.");
    }
}

class Sankranti extends Festival 
{
    void celebrate() 
  {
        System.out.println("Flying kites and preparing Pongal on Sankranti.");
    }
}

public class BhimavaramFestivities 
{
    public static void main(String[] args)
  {
        Temple temple = new Temple();
        System.out.println(temple.pray("Lord Shiva"));
        System.out.println(temple.pray("Goddess Saraswati", "flowers"));

        Festival festival = new Festival();
        Festival sankranti = new Sankranti();

        festival.celebrate();
        sankranti.celebrate();
    }
}
