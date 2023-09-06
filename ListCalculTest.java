package intermediate;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCalculTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		ListCalcul calcul = new ListCalcul();
		
		System.out.println("국어점수");
		al.add(sc.nextInt());
		System.out.println("수학점수");
		al.add(sc.nextInt());
		System.out.println("영어점수");
		al.add(sc.nextInt());
		
		//추가
		for(int num : al) {
			tot += num;
		}
		System.out.printf("총점 : %d",tot);
		System.out.printf("평균 : %d",tot/al.size());

	}

}
