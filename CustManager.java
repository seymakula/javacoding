public class CustManager {
    private BaseLogger logger;
    public CustManager (BaseLogger logger){
        this.logger=logger;
    }

    public void add(){
        System.out.println("müşteri eklendi.");
        logger.log("log mesajı");
    } 
}    
