public class Main {
    public static void main(String[] args) {

       Hamburger myHum=new Hamburger("Simple","Ham",10,"roll");
       myHum.addHamburgerAddition3("cheese",5);
        System.out.println(myHum.itemizeHumburger());
    }
}