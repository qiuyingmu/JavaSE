package TheAddressBook;

public class Company {
	private String name;
	private String address;
	private String phone;
	private String fax;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.equals("")) {
			return;
		}
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public Company() {
		
	}
	public Company(String name, String address, String phone, String fax) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.setPhone(phone);
		this.setFax(fax);
	}
	
	public String toString() {
		return String.format("公司名字：%s\t地址：%s\n联系方式：%s\t传真：%s\n", 
				             this.getName(), this.getAddress(), this.getPhone(), this.getFax());
	}
}
