public class Product {

    public Product(int _id,String name, String description, double price, int stockAmount, String color){
        System.out.println("Yapıcı blok çalıştı.");
        this._id=_id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
        this.color=color;

    }
    public Product(){

    }
    //Atribute veya field
   int _id;
   private String name;
   private String description;
   private double price;
   private int stockAmount;
   private String color;
   private String kod;

    //getter
    public int getId(){
        return _id;
    }

    //setter
    public void setId(int id){
        _id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKod() {
        return this.name.substring(0,1)+_id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
