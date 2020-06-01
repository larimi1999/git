//
package com.vti.utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * This class is . 
 * 
 * @Description: .
 * @author: NTNhat
 * @create_date: Jun 1, 2020
 * @version: 1.0
 * @modifer: 
 * @modifer_date: Jun 1, 2020
 */
public class EmailValidator {
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";// cấu trúc 1 email thông thường
	private Pattern pattern;
	private Matcher matcher;
 
    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
    
    public boolean validate(final String hex) {
    	 
        matcher = pattern.matcher(hex);
        return matcher.matches();
 
    }
}
