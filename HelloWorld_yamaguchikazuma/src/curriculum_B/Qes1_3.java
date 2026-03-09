package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	// 1. コンソールにユーザー名を入力できるようにする。

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ユーザー名を入力してください：");
		String userName = sc.nextLine();

		if (userName == null || userName.length() == 0) {
			System.out.println("名前を入力してください");

		} else if (userName.length() > 10) {
			System.out.println("名前を10文字以内にしてください");

		} else if (!userName.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("半角英数字のみで名前を入力してください");

		} else {
			System.out.println("ユーザー名「" + userName + "」を登録しました");
		}
		//3. じゃんけん
		Random rand = new Random();
		int count = 0;

		while (true) {
			System.out.println("じゃんけんをして下さい");
			System.out.println("0:グー　1:チョキ 2:パー");

			int user = sc.nextInt();
			int enemy = rand.nextInt(3);

			count++;

			System.out.println("自分の手：" + user);
			System.out.println("相手の手：" + enemy);

			if (user == enemy) {
				System.out.println("DRAW あいこ もう一回しましょう");
			}

			else if ((user == 0 && enemy == 1) ||
					(user == 1 && enemy == 2) ||
					(user == 2 && enemy == 0)) {

				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println("勝つまでにかかった合計回数は" + count + "回です");

				break;
			}

			else if (enemy == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			}

			else if (enemy == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
			}

			else if (enemy == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日までに考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
			}

		}

		sc.close();
	}
}