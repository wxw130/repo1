package HashSetDeno;

import java.util.HashSet;
import java.util.Iterator;

import person.Person;



public class HashSetLDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		
		HashSet HS = new HashSet();
		
//		HS.add("ABC1");
//		HS.add("ABC2");
//		HS.add("ABC3");
//		HS.add("ABC4");
//		HS.add("ABC5");
//		HS.add("ABC6");
		
		HS.add(new Person("�ϸ�",33));
		HS.add(new Person("�ϸ�",33));
		HS.add(new Person("�ϸ�",33));
		HS.add(new Person("����",55));
		HS.add(new Person("ɳ������",22));
		HS.add(new Person("С������",19));
	
		
		Iterator it = HS.iterator();
		while(it.hasNext()){
			
			Person p = (Person)it.next();
			System.out.println(p.getName()+"......"+p.getAge());
	
		}

	}

}
