package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

import person.Person;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		ArrayList a = new ArrayList();
		
		a.add(new Person("��С��",19));
		a.add(new Person("С��",20));
		a.add(new Person("С��",21));
		a.add(new Person("С��",22));
		
		Iterator it =a.iterator();
		while(it.hasNext()){
			Person p =(Person)(it.next());
			System.out.println(p.getName()+"...."+p.getAge());
			
		}

	}

}
