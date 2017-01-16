/*replaceFirst 和replaceAll 方法
replaceFirst 和replaceAll 方法用来替换匹配正则表达式的文本。不同的是，replaceFirst 替换首次匹配，replaceAll 替换所有匹配。 
下面的例子来解释这个功能：*/

package zhengzeexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexMatches2 {

	private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " +
                                    "All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
       Pattern p = Pattern.compile(REGEX);
       // get a matcher object
       Matcher m = p.matcher(INPUT); 
       System.out.println(m);
       String INPUT1= m.replaceFirst(REPLACE);
       System.out.println(INPUT1);
      String INPUT2 = m.replaceAll(REPLACE);
       System.out.println(INPUT2);
   }

}
