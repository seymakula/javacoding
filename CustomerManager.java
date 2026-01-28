public class CustomerManager {
    //BaseDatabaseManager databaseManager;
    
    //public void getCustomer(){
    //    databaseManager.getVeri();
    //}
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    public void add(){
        // iş kodları
        customerDal.add();
    }

}
