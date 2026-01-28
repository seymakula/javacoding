public class Main {
    public static void main(String[] args) {
        //double num=12.5;
        //int sayi = 10;
        //char karakter='a';
        //String mesaj="öğrenci sayısı: ";
       //System.out.println( mesaj+sayi);
       //System.out.println(+num);
       //System.out.println(+karakter);
       //Classes class1;
       //class1.Add();
       //class1.Delete();
       //Classes class2=new Classes();
       //class1=class2;
    //şimdi burada 2 adet nesne oluşturduk ilk nesne de ikinci nesnenin idsini almış oldu.
    // stackte classlar tutulur ve bunlar referans(adres) tutar 
    //heap de ise gerçek nesneler tutulur.
    // değer(value) tipte oluşan her şey stackte tutulur bunun sebebi bu değişken fonksiyon her ne haltsa iş bitince silinir direkt olarak.
    // heap de ise reference tipteki değişken (nesne gibi) şeyler tutulur bunlar manuel olarak sen tarafından ya da garbage collector tarafından sillinmesi gerekir.
        /*Products product=new Products();
        product.set_name("laptop");
        product.set_id(1);
        product.set_description("asus laptop");
        product.set_price(50000);
        product.set_stockAmount(3);
        */
        //System.out.println(product._name);
        //ProductManager manager=new ProductManager();
        //manager.Add(product);
        //product.getId();
        /* 
        DortIslem islem=new DortIslem();
        System.out.println(islem.topla(1,2));
        DortIslem islem2=new DortIslem();
        System.out.println(islem2.topla(1,2,3));

        Customer customer=new Customer();
        Employee employee= new Employee();
        employee.salary=2.1;
        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();
        customerManager.add();
        */
        //employeeManager.BestEmployee();
        //EmailLogger logger=new EmailLogger();
        //logger.log("log mesajı");
        //BaseLogger[] loggers=new BaseLogger[]{new EmailLogger(),new DatabaseLogger(),new FileLogger()};
        //for(BaseLogger logger: loggers){
        //    logger.log("log mesajı");
        CustManager custManager=new CustManager(new DatabaseLogger());
        custManager.add();
        
    }
}

