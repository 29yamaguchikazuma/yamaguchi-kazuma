package curriculum_A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1.下記9個をローカル変数として宣言のみしてください
		//・バイト型
		byte byteNum;
		//・短整数型
		short shortNum;
		//・整数型
		int intNum;
		//・長整数型
		long longNum;
		//・単精度浮動小数点数型
		float floatNum;
		//・倍精度浮動小数点数型
		double doubleNum;
		//・文字型
		char charNum;
		//・文字列型
		String StringNum;
		//・ブーリアン型
		boolean booleanNum;
		
		//2.それぞれのローカル変数をローカル内でそれぞれの初期値を
		//代入し初期化してください
		//・バイト型
		byteNum = 0;
		//・短整数型
		shortNum = 0;
		//・整数型
		intNum= 0;
		//・長整数型
		longNum = 0L;
		//・単精度浮動少数点数型
		floatNum = 0.0f;
		//・倍精度浮動少数点数型
		doubleNum = 0.0d;
		//・文字型
		charNum = '\u0000';
		//・文字列型
		StringNum = null;
		//・ブーリアン型
		booleanNum = false;
		
		//3.初期化をしたそれぞれの変数に下記の値を代入してください
		//・バイト型
		byteNum = 10;
		//・短整数型
		shortNum = 100;
		//・整数型
		intNum= 1000;
		//・長整数型
		longNum = 10000L;
		//・単精度浮動少数点数型
		floatNum = 9.5f;
		//・倍精度浮動少数点数型
		doubleNum = 10.5;
		//・文字型
		charNum = 'a';
		//・文字列型
		StringNum = "ハロー";
		//・ブーリアン型
		booleanNum = true;
		
		//4・下記の通りにコンソール出力されるようにしてください
		//11110
		System.out.println(byteNum + shortNum + intNum + longNum);
		//20
		System.out.println(byteNum + byteNum);
		//a ハロー true
		System.out.println(charNum + " " + StringNum + " " + booleanNum);
		//11130
		System.out.println(byteNum + byteNum + byteNum + shortNum + intNum + longNum);
		//10000000000
		System.out.println(byteNum * shortNum * intNum * longNum);
		//0.105
		System.out.println(doubleNum / shortNum);
		//-90
		System.out.println(byteNum - shortNum);
		
		
		System.out.println();
		
		//5・次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		//String num="20";
		//int num1=23;
		//System.out.println("ハローJAVA"+(num+num1));
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		System.out.println();
		
		//6・『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		//ローカル変数に代入し○○に入れてください
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』
		//・name型
		String name  = "山田太郎";
		//・age型
		byte age = 18;
		//・cm型
		float Cm = 170.5f;
		//・kg型
		float Kg = 62.2f;
		//・food型
		String food = "寿司";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + Cm + "cmです");
		System.out.println("体重は" + Kg + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		//・6で作成した自己紹介に続いてBMIが出力されるようにしてください
		//・「BMIは○○です」
		//・ただし計算は数値を直書きせず、全て変数を使ってすること
		float bmi = Kg / ((Cm / 100) * (Cm / 100));
		BigDecimal beforeBmi = new BigDecimal(bmi);
		BigDecimal afterBmi = beforeBmi.setScale(1,RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です");
		
		System.out.println();
		
		//・6で宣言した変数に再代入し下記の通りコンソールに出力してください
		name = "鈴木一郎";
		age = 24;
		Cm = 168.5f;
		Kg = 64.2f;
		food = "オムライス";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + Cm + "cmです");
		System.out.println("体重は" + Kg + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		bmi = Kg / ((Cm / 100) * (Cm / 100));
		beforeBmi = new BigDecimal(bmi);
		afterBmi = beforeBmi.setScale(1,RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です");
		System.out.println();
		
		//・8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、
		//・下記の通りコンソールに出力してください
		name = "鈴木一郎";
		age += age;
		Cm += Cm;
		Kg += Kg;
		food = "オムライス";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + Cm + "cmです");
		System.out.println("体重は" + Kg + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		bmi = Kg / ((Cm / 100) * (Cm / 100));
		beforeBmi = new BigDecimal(bmi);
		afterBmi = beforeBmi.setScale(1,RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です");
		
		System.out.println();
		
		//・8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません;
		age = 24;
		System.out.println(25 <= age );
		System.out.println();
		
		
		
		
	}   


}
