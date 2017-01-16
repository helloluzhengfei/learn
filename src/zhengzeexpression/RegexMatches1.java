/*appendReplacement 和 appendTail 方法*/

package zhengzeexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexMatches1 {
	
	 private static String REGEX = "a*b";   // 零次或多次匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。
	   private static String INPUT = "aabfooaabfooabfoob";
	   private static String REPLACE = "-";
	   public static void main(String[] args) {
		   
	      Pattern p = Pattern.compile(REGEX);
	      // 获取 matcher 对象
	      Matcher m = p.matcher(INPUT);
	      StringBuffer sb = new StringBuffer();
	      while(m.find()){
	         m.appendReplacement(sb,REPLACE);
	      }
	      m.appendTail(sb);
	      System.out.println(sb.toString());
	   }


}
