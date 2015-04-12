import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;





public class tests {
	public static void main(String[] args){

		String value = "2015-9-26,pesce,formaggio,insalata";
		String line = value.toString();
		String regex = "(19|20)[0-9][0-9][--.]([0-9]|[1][0-2])[--.]([0-9]|1[0-9]|2[0-9]|3[0-1]),";
		line = line.replaceAll(regex, "");

		StringTokenizer tokenizer = new StringTokenizer(line, ",");

		List<String> list = new ArrayList<String>();
		while (tokenizer.hasMoreTokens()) {
			list.add(tokenizer.nextToken());
		}

		
		for (int i = 0; i < list.size(); i++) {
			   for (int j = i+1; j < list.size(); j++) {
			       String ei = list.get( i);
			       String ej = list.get( j);
			       String conc = ei + ", " + ej;
			       System.out.println(conc);
			   }
			}
	}
}
