public class switches {
    public static void main(String[] args) {
        char grade='c';
        switch(grade){
            case 'A':
                System.out.println("you passed!");
                break;
            case 'B':
                System.out.println("B ile geçtiniz.");
                break;
            case 'F':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("geçersiz not girişi!!");
        }       



    }
}
