package basic.dev;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;
public class MainApp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			Queue<Integer> a = new LinkedList<>();
			System.out.println("Nhập vào vị trí phân tử muốn in và xóa: ");
			int m = sc.nextInt();
			a.add(1);
			a.add(2);
			a.add(3);
			a.add(4);
			a.add(5);
			//a
			int qSoPhanTu = a.size();
			System.out.println("Số Phân Tử của Queue là: " + qSoPhanTu);
			//b
			int answer = 0;
			for (Integer b : a) {
				answer++;
				if (answer == m) {
					System.out.println("Nội dung của phân tử thứ n là: " + b);
				}
			}
			//c
			System.out.print("Queue a: ");
			for (Integer b : a) {
				System.out.print(b + " ");
			}
			//d
			System.out.println();
			a.remove(m - 1);
			System.out.print("Queue a sau khi xóa phân tử a: ");
			for (Integer b : a) {
				System.out.print(b + " ");
			}
		}

	}


