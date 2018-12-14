
public class POList {

	/**
	 * @param args
	 */
	int poid[]=new  int[15];
	String po[]=new String[15];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] getPoid() {
		return poid;
	}
	public void setPoid(int[] poid) {
		this.poid = poid;
	}
	public String[] getPo() {
		return po;
	}
	public void setPo(String[] po) {
		this.po = po;
	}
	public POList(int[] poid, String[] po) {
		super();
		this.poid = poid;
		this.po = po;
	}

}