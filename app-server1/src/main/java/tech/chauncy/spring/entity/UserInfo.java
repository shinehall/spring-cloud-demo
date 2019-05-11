package tech.chauncy.spring.entity;

public class UserInfo {
	private long id;
	private String account;
	private String passwd;
	private String name;
	private String mobile;
	private String email;
	private String imageUrl;
	private int age;
	private short sex;

	public UserInfo() {
		super();
	}

	public UserInfo(long id, String account, String passwd, String name, String mobile, String email, String imageUrl,
			int age, short sex) {
		super();
		this.id = id;
		this.account = account;
		this.passwd = passwd;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.imageUrl = imageUrl;
		this.age = age;
		this.sex = sex;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public short getSex() {
		return sex;
	}

	public void setSex(short sex) {
		this.sex = sex;
	}

}
