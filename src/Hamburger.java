public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    private double totalPrice=0;




    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name,double price){
        this.addition1Name=addition1Name;
        this.addition1Price=price;
    }
    public void addHamburgerAddition2(String addition2Name,double price){
        this.addition2Name=addition2Name;
        this.addition2Price=price;
    }
    public void addHamburgerAddition3(String addition3Name,double price){
        this.addition3Name=addition3Name;
        this.addition3Price=price;
    }
    public void addHamburgerAddition4(String addition4Name,double price){
        this.addition4Name=addition4Name;
        this.addition4Price=price;
    }

  public double itemizeHumburger() {
   double hamPrice=price;
   totalPrice=hamPrice;
      System.out.println(name + " hamburger on a" + breadRollType + " roll "
              + " price is " + price);
      if(addition1Name!=null){
          totalPrice=totalPrice+addition1Price;
          System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
      }
      if(addition2Name!=null){
          totalPrice=totalPrice+addition2Price;
          System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
      }
      if(addition3Name!=null){
          totalPrice=totalPrice+addition3Price;
          System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
      }
      if(addition4Name!=null){
          totalPrice=totalPrice+addition4Price;
          System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
      }
      return totalPrice;
  }


}
