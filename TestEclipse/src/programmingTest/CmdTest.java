package programmingTest;


class CmdTest {
	public static void main(String args[]) {
		try {
			String [] arr = {"C:\\WINDOWS\\system32\\cmd.exe", "/c", "start"};
			Runtime.getRuntime().exec(arr);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
