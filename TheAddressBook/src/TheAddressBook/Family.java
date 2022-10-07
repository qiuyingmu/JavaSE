package TheAddressBook;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Family extends Contact {
	private Date birthday;
	private String address;
	
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Family() {
		super();
	}
	public Family(String name, String gender, String email, String[] phones, Date birthday, String address) {
		super(name, gender, email, phones);
		this.setBirthday(birthday);
		this.setAddress(address);
	}
	public Family(String name, String[] phones) {
		super(name, phones);
	}

	public void display() {
		super.display();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("出生日期：" + sdf.format(this.getBirthday()) + 
						   "\t家庭住址：" + this.getAddress());
	}
	
}
