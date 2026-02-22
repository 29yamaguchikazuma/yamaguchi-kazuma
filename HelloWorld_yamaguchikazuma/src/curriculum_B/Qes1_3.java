package curriculum_B;

 import java.util.Scanner;
 
 public class Qes1_3{
     // 1. コンソールにユーザー名を入力できるようにする。
     
     public static void main(String[] argss)  {
     
     Scanner sc = new Scanner(System.in);
    
   
      System.out.print("ユーザー名を入力してください：");
        String userName = sc.nextLine();

        if (userName == null || userName.length() == 0) {
            System.out.println("名前を入力してください");

        } else if (userName.length() > 10) {
            System.out.println("名前を10文字以内にしてください");

        } else {
            System.out.println("ユーザー名「" + userName + "」を登録しました");
        }

        sc.close();
            }
        }    
    

        
       
     
    

     
     
    
    