package cote.exam1105;

public class MemoExam {

	public static void main(String[] args) {
		MemoRepository r = new LoacalRepository();
		r.addMemo("1", "hello");
		
		r = new RemoteRepository();
		r.addMemo("1", "hello");
	}

}
