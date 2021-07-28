import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
//    Viết chương trình để nhập nhập một số bất kỳ, tìm kết quả phép nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.

    public static void testEntry(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập số cần tính: ");
            double num = scanner.nextFloat();
            calculator(num);
        }catch (Exception e){
            System.out.println(e.getCause());
            System.out.println("Dầu vào không hợp lệ. Vui lòng nhập đầu vào là 1 số.");
        }
    }
    public static void calculator(double num){
        DecimalFormat df = new DecimalFormat("#,###.##",
                new DecimalFormatSymbols(new Locale("pt", "BR")));
        for(int i = 1; i < 21;i++ ){
            double resut = Math.floor(num *(double) i*100.0)/100.0;
            BigDecimal value = new BigDecimal(resut);
            System.out.println("Kết quả phép nhân "+ num +" x "+ i+" = " +df.format(value.floatValue()));

        }
    }
    public static void main(String[] args){
    
    }
}
