import java.util.Scanner;
public class App90 {

    public static void main(String[] args) {

        String chuoi;
  
        char kyTu;
  
        Scanner scanner = new Scanner(System.in);
  n
        System.out.pritln("Nhập vào chuỗi bất kỳ: ");
  
        chuoi = scanner.nextLine();
  
        System.out.println("Các ký tự có trong chuỗi là: ");
  
        for (int i = 0; i < chuoi.length(); i++) {

             kyTu = chuoi.charAt(i);

            System.out.println(kyTu);
  
      }

  }
  
  