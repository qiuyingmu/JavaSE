package TheAddressBook;

public class Partner extends Contact {
	private String title;
	private Company company;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public Partner(String title, Company company) {
		super();
		this.title = title;
		this.company = company;
	}
	public Partner() {
		super();
	}
	public Partner(String name, String gender, String email, String[] phones, String title, Company company) {
		super(name, gender, email, phones);
		this.setCompany(company);
		this.setTitle(title);
	}
	public Partner(String name, String[] phones) {
		super(name, phones);
	}
	
	public void display() {
		super.display();
		System.out.println("职务： " + this.getTitle() + "\n工作单位：" + this.getCompany());
	}
}
