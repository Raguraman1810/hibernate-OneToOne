package OneToOne_db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhar {
	@Id
	private long adno;
	private String address;
	private String Dob;
	private long mobile;
	
	@Override
	public String toString() {
		return "Aadhar [adno=" + adno + ", address=" + address + ", Dob=" + Dob + ", mobile=" + mobile + "]";
	}
	public long getAdno() {
		return adno;
	}
	public void setAdno(long adno) {
		this.adno = adno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	

}
