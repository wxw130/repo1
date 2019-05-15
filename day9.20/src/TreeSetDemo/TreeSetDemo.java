package TreeSetDemo;

import java.util.Iterator;
import java.util.TreeSet;

import person.Person;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		TreeSet TS = new TreeSet(new ComparetorByName());
		
		TS.add(new Person("����",5));
		TS.add(new Person("�����",25));
		TS.add(new Person("��ë",55));
		TS.add(new Person("ɳ��",35));
		
		Iterator it = TS.iterator();
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getName()+"......"+p.getAge());
			
		}
		
		
	}

}
