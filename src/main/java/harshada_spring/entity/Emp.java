package harshada_spring.entity;

public class Emp {
private int id;
private String name;
private Nation nation;
public Emp() {
	super();
	}
public Emp(String name) {
	super();
	this.name = name;
	
}
public Emp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

/*@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + "]" ;
}*/

public int getId() {
	return id;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", nation=" + nation +"]";
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Nation getNation() {
	return nation;
}
public void setNation(Nation nation) {
	this.nation = nation;
}

}
