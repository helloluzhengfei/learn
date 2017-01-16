package zhengzeexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexMatches {
	public static void main( String args[] ){

	      // 按指定模式在字符串查找
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(.*)(\\d+)(.*)";

	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);

	      // 现在创建 matcher 对象
	      Matcher m = r.matcher(line);
	      System.out.println(m.groupCount());//可以通过调用matcher对象的groupCount方法来查看表达式有多少个分组。groupCount方法返回一个int值，表示matcher对象当前有多个捕获组。 
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         
	      } else {
	         System.out.println("NO MATCH");
	      }
	   }


}
