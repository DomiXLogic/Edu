package TryBlock;
import java.io.*; 

public class MultipleCatchBlock {
	public static void main(String args[]) {
	   openFile();
    }  

	static public void openFile(){
       FileReader reader = null;
       try {
    	   
    	   File file = new File("\\\\HOMESRV\\d\\Projects\\EfkaTest\\src\\EfkaTest\\SomeText.txt");
           reader = new FileReader(file);
           int i=0;
           while(i != -1){
               i = reader.read();
               
               System.out.print((char) i );
               
           }System.out.println("?");
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if(reader != null){
               try {
                   reader.close();
               } catch (IOException e) {
                 
               }
           }
           System.out.println("\n\n--- File End ---");
       }
   }
}  

