import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class vectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO �Զ����ɵķ������
		
		Vector vt = new Vector(); //vector�����еĻ�ȡ��ʽ
		
		vt.addElement("abc1");
		vt.addElement("abc2");
		vt.addElement("abc3");
		vt.addElement("abc4");
		
		Enumeration E =vt.elements();
		
		while(E.hasMoreElements()){
			
			System.out.print(E.nextElement());		
	
		}
		
		Iterator it = vt.iterator();
		
		while(it.hasNext()){
			Object o = it.next();
			System.out.print(o);
		}
		
		
		
	}
		

}
