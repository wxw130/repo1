package LinkedTest;

/*
 * ��ʹ��LinkedList��ģ��һ����ջ���߶������ݽṹ��
 * 
 * ��ջ���Ƚ���� First In Last Out  FILO
 * 
 * ���У��Ƚ��ȳ� First In First Out FIFO
 * 
 * ����Ӧ����������һ����������ʹ���ṩһ������������������ֽṹ�е�һ�֡�
 */


public class LinkedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		DuiXiang DX = new DuiXiang();
		
		DX.Myadd("ABC1");
		DX.Myadd("abc2");
		DX.Myadd("ABC3");
		DX.Myadd("ABC4");
		
		while(!DX.isNull()){
			
			System.out.println(DX.Myget());
			
		}
		
		
		
		
		
		
		
	}

}
