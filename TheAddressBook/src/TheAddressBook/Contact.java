package TheAddressBook;

public class Contact {
	private String name;
	private String gender;
	private String email;
	private String[] phones;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.equals("")) {
			return;
		}
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getPhones() {
		return phones;
	}
	public void setPhones(String[] phones) {
		this.phones = phones;
	}
	
	public Contact() {
		super();
	}
	public Contact(String name, String gender, String email, String[] phones) {
		super();
		this.setName(name);
		this.setGender(gender);
		this.setEmail(email);
		this.setPhones(phones);
	}
	public Contact(String name, String[] phones) {
		this(name, "", "", phones);
	}
	
	public void display() {
		System.out.println("姓名：" + this.getName() + 
				           "\t性别：" + this.getGender() + 
				           "\t邮箱：" + this.getEmail());
		System.out.print("联系电话：\t");
		for(String pho : this.phones) {
			System.out.print(pho + "\t");
		}
		System.out.println();
	}
	
}
