public class strings {
    public static void main(String[] args) {
        String mesaj="bugun hava çok güzel";
        /* 
        System.out.println(mesaj);
        System.out.println("eleman sayısı: "+mesaj.length());
        System.out.println(mesaj.concat(" yaşasın!!"));    
        System.out.println("5.eleman: "+mesaj.charAt(4));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("l"));
        char[] karakter=new char[5];
        mesaj.getChars(0,5, karakter,0);
        System.out.println(karakter);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf('e'));
        */
        System.out.println(mesaj.replace('a', '*'));
        System.out.println(mesaj.substring(2,5));
        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }

}


