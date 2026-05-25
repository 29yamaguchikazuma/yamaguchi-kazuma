package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("生徒の人数を入力してください(2以上): ");
		int student = Integer.parseInt(sc.nextLine());

		if (student < 2) {
			System.out.println("2以上を入力してください");
			sc.close();
			return;
		}

		int[][] score = new int[student][4];

		String[] subject = { "英語", "数学", "理科", "社会" };

		//点数入力
		for (int i = 0; i < student; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.print((i + 1) + "人目の「" + subject[j] + "」の点数を入力してください:");

				score[i][j] = Integer.parseInt(sc.nextLine());
			}

			System.out.println();
		}

		//生徒ごとの平均
		for (int i = 0; i < student; i++) {

			int total = 0;

			for (int j = 0; j < 4; j++) {
				total += score[i][j];
			}

			System.out.printf("%d人目の平均点は%.2f点です。%n", i + 1, (double) total / 4);
		}

		System.out.println();

		//教科ごとの平均
		for (int j = 0; j < 4; j++) {

			int total = 0;

			for (int i = 0; i < student; i++) {
				total += score[i][j];
			}

			System.out.printf("%sの平均点は%.2f点です。%n", subject[j], (double) total / student);

		}

		System.out.println();

		//全体平均
		int allTotal = 0;

		for (int i = 0; i < student; i++) {
			for (int j = 0; j < 4; j++) {
				allTotal += score[i][j];
			}
		}
		System.out.printf("全体の平均点は%.2f点です。%n", (double) allTotal / (student * 4));

		sc.close();
	}

}
