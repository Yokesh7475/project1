package employedto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employedto {
   String ename;
   @Id
   String email;
   String pwd;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
}
