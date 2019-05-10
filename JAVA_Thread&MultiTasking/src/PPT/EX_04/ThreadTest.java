package PPT.EX_04;

class SharedBoard {
	private int sum = 0;

	synchronized public void add() {
		sum += 10;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread{
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			board.add();
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("jjj", board);
		Thread th2 = new StudentThread("lll", board);
		Thread th3 = new StudentThread("kkk",  board);
		
		th1.start();
		th2.start();
		th3.start();
		
	}

}
