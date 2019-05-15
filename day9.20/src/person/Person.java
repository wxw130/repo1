package person;

public class Person /*extends Object*/ implements Comparable {
	
	public String name ;
	public int age ; 
	
	public Person(String name ,int age){
		this.age=age;
		this.name=name;
	}
	
	
	/* ���� Javadoc��
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		// TODO �Զ����ɵķ������
		return name.hashCode()+age*18;
		
	}



	/* ���� Javadoc��
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		// TODO �Զ����ɵķ������
		if(this==obj){
			return true;
		}
		
		if(!(obj instanceof Person)){
			throw new ClassCastException("���ʹ���");
		}
		
		Person p = (Person)obj;
		return this.name.equals(p.name)&&this.age==p.age;
	}

	
	/* ���� Javadoc��
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		
		Person p = (Person)o;
		int temp = this.getAge()-p.getAge();
		return temp==0?this.getName().compareTo(p.getName()) : temp;
	}

	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
