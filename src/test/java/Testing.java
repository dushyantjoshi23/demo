import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;    

public class Testing {
    public static void main(String[] args) {
        String a = "str";
        System.out.println("Example test" + a);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));  

        HashMap hmap = new HashMap<String,String>();
        hmap.put('1', '1');
        hmap.put('2', '2');

        System.out.println(hmap.size()); 


}

}