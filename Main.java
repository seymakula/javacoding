public class Main{
    public static void main(String[] args){
        //WomanCalculator womanCalculator=new WomanCalculator();
        //womanCalculator.hesapla();
        //womanCalculator.gameover();
        //GameCalculator gameCalculator=new ManCalculator();
        //CustomerManager customerManager=new CustomerManager();
        //customerManager.databaseManager=new OracleDatabaseManager();
        //xcustomerManager.getCustomer();
        //ICustomerDal customerDal=new OracleCustomerDal();
        CustomerManager customerManager2=new CustomerManager(new MysqlCustomerDal());
        //customerManager2.customerDal=new OracleCustomerDal();
        customerManager2.add();
    }
}