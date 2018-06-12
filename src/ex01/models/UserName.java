package ex01.models;

public class UserName {
	private String _name;
	
	public boolean checkName(String name) {
		if(name.length() == 0) return false;
		else{
			return true;
		}
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}
	
}
