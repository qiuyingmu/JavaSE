package TheAddressBook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TheAddressBookTest {

	public static void main(String[] args) {
		
		Contact contact = new Contact("朱青", "女", "3158234154@qq.com", 
									  new String[]{"13035536546"});
		contact.display();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Family family;
		try {
			family = new Family("朱青", "女", "3158234154@qq.com", 
									   new String[]{"13035536546"}, sdf.parse("2001-07-22"), "贵州遵义");
			family.display();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Partner partner = new Partner("朱青", "女", "3158234154@qq.com", 
								      new String[]{"13035536546"}, "学生", 
								      new Company("潍坊学院", "潍坊市奎文区", "123456789", "123456789"));
		partner.display();
	}

}
