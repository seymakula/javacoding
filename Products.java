public class Products {
    //attribute | field
    private String _name;
    
    private String _description;
    private double _price;
    private int _stockAmount;
    private int _id;

    // bu özelliklerin başında default olarak public var ama private yazarsak bunları sadece bu kod bloğu içinde kullanabiliriz dışarıdan bir erişim sağlanamaz.
    //getter
    /*public int getId(){
        return _id;
    }
    //setter
    public int setId(int _id){
        _id=id;
    }*/
    public String get_name() {
        return _name;
    }
    public String get_description() {
        return _description;
    }
    public double get_price() {
        return _price;
    }
    public int get_stockAmount() {
        return _stockAmount;
    }
    public int get_id() {
        return _id;
    }
    public void set_name(String name) {
        this._name = name;
    }
    public void set_description(String description) {
        this._description = description;
    }
    public void set_price(double price) {
        this._price = price;
    }
    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }
    public void set_id(int id) {
        this._id = id;
    }
}
