import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

	public String dateConversion(String str) throws ParseException {
        // -- write your code here --
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = formatter.parse(str);
        
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy年M月d日");
        String strDate = formatter2.format(parsedDate);
        return strDate;
    }
}