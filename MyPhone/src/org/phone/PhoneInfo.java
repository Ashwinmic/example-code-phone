package org.phone;

public class PhoneInfo {
public void phoneName() {
	System.out.println("One pluse");
}
public void phoneMieiNum() {
	System.out.println("98563142990");
}
public void camera() {
	System.out.println("108");
}
public void storage() {
	System.out.println("12/512");
}
public void osName() {
	System.out.println("lolipop");
}
public static void main(String[] args) {
	PhoneInfo p=new PhoneInfo();
	p.phoneName();
	p.phoneMieiNum();
	p.camera();
	p.storage();
	p.osName();
}
}
