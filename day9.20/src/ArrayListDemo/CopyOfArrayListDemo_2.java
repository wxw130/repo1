package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

import person.Person;

public class CopyOfArrayListDemo_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		ArrayList a = new ArrayList();
		
		a.add(new Person("��С��",19));
		a.add(new Person("��С��",19));
		a.add(new Person("��С��",19));
		a.add(new Person("��С��",19));
		a.add(new Person("С��",20));
		a.add(new Person("С��",21));
		a.add(new Person("С��",22));
		
			a =GetSingleElement(a);
			Iterator tt = a.iterator();
			while(tt.hasNext()){
				Person p2 =(Person)tt.next();
				System.out.println(p2.getName()+"...."+p2.getAge());
			}
		}

	
	public static ArrayList GetSingleElement(ArrayList al){
		
		//����һ����ʱ����
		ArrayList temp = new ArrayList();
		
		Iterator it =al.iterator();
		while(it.hasNext()){
			Person p =(Person)(it.next());
			if(!temp.contains(p)){
				temp.add(p);
			}
		}
		return temp;

	}
}