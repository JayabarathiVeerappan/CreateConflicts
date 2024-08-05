package org.company;

public class CompanyInfo {

	private void companyName() {
		System.out.println("company Name Infosys");
	}
	private void companyId() {
		System.out.println("company Id Info456");
	}
	private void companyAddress() {
		System.out.println("company Address is Mysore");
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyAddress();
		c.companyId();
	}
}
