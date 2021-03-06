
public class Variable {

	private String name;
	
	public Variable(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public boolean isName(String n){
		return name.equals(n);
	}
	
	public Variable clone(){
		Variable v;
		if(this instanceof DefaultVariable){
			v = new DefaultVariable(new String(name));
		} else {
			v = new Variable(new String(name));
		}
		return v;
	}
	
}
