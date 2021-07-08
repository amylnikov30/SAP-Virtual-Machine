import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Utils{
  public static int[] readTextFile(String path){
    
    String result[] = new String[10000];
    int results[] = null;
    
    try{
      File file = new File(path);
      Scanner sc = new Scanner(file);
      int index = 0;
      
      while (sc.hasNextLine()) {
        result[index] = sc.nextLine();
        index += 1;
      }
    results = new int[index];
    for (int i = 0; i < index; i++){
      results[i] = Integer.parseInt(result[i]);
    }
  }catch (Exception e){
    System.out.println(e);
  }
    return results;
  }
}