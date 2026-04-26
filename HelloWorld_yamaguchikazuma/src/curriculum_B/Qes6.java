package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("商品を入力してください：");
        String input = sc.nextLine();

        switch (input) {

            case "パソコン":
            case "冷蔵庫":
            case "扇風機":
            case "洗濯機":
            case "加湿器":
            case "テレビ":
            case "ディスプレイ":
                System.out.println(input + "の残り台数は" + rand.nextInt(12) + "台です");
                break;

            default:
                System.out.println("「" + input + "」は指定の商品ではありません");
        }

        sc.close();
    }
}