package model;

/**  
* Kai Mwirotsi-Shaw - kimwirotsishaw  
* CIS171 12601 WH1  
* Jan 25, 2022  
*/
public class MemoUtil {
	private String memo;
	
	public MemoUtil(String memo) {
		this.memo = memo;
	}
	
	// prints the memo
	public String printMemo() {
		return memo;
	}
	
	public String greetings() {
		return "Hi " + memo + "!";
		}
	
	public int returnMemoLength() {
		return memo.length();
		} 
}
