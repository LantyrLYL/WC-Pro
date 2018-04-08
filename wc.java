//Êä³öº¯Êý
void output(ArrayList<WordInfo> handleList)
{
	PrintWriter writer=null;
		try {
			writer=new PrintWriter(new BufferedOutputStream(new FileOutputStream("result.txt")));
			for(WordInfo wordInfo:handleList)
				writer.write(wordInfo.toString()+"\r\n");
			writer.flush();
		} catch (Exception e) {
			System.out.println("Error in output");
		}finally{
			writer.close();
		}
	}
}


//°×ºÐ²âÊÔ
public class word extends TestCase{
	
	public TxtFile txtFile;

	@Test
	public void testoutput1() {
		txtFile =new TxtFile("result.txt");
		txtFile.output(txtFile.handle(txtFile.input()));
	}
	@Test
	public void testoutput2() {
		txtFile =new TxtFile("result.exe");
		txtFile.output(txtFile.handle(txtFile.input()));
	}
	@Test
	public void testoutput3() {
		txtFile =new TxtFile("input.txt");
		txtFile.output(txtFile.handle(txtFile.input()));
	}
	@Test
	public void testoutput4() {
		txtFile =new TxtFile("input.exe");
		txtFile.output(txtFile.handle(txtFile.input()));
	}
	@Test
	public void testoutput5() {
		txtFile =new TxtFile("input1.txt");
		txtFile.output(txtFile.handle(txtFile.input()));	
	}
	
