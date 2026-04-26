package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		while (true) {
			System.out.println("じゃんけん（0:グー 1:チョキ 2:パー）:");
			int user = Integer.parseInt(sc.nextLine());

			int enemy = rand.nextInt(3);
			System.out.println("相手：" + enemy);

			if (user == enemy) {
				System.out.println("あいこ");
			} else if ((user == 0 && enemy == 1) ||
					(user == 1 && enemy == 2) ||
					(user == 2 && enemy == 0)) {
				System.out.println("勝ち！");
				break;
			} else {
				System.out.println("負け！");
			}
		}

		sc.close();
	}
}