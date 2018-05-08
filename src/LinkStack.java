//LinkStack.java
public class LinkStack //��ջ��
{
	class Node						//����������
	{
		public Object data;			//��Žڵ�ֵ
		public Node next;			//��̽ڵ������
		public Node (){}			//�޲ι��캯��
		public Node(Object data){	//��һ�������Ĺ��캯��
			this.data=data;	
		}
	}
	private Node top;		//ջ��Ԫ������
	public boolean isEmpty()//�ж�ջ�Ƿ�Ϊ��
	{
		return top==null;
	}
	public int length()
	{
		Node p=top;			//��ʼ����pָ��ջ��Ԫ��
		int length=0;		//������
		while(p!=null)		//��ջ��Ԫ�ؿ�ʼ�����ң��鵽pָ���
		{
			p=p.next;		//pָ���̽ڵ�
			length++;		//��������1
		}
		return length;		//���س���
	}
	public Object peek()	//����ջ��Ԫ�ص�ֵ
	{
		if (!isEmpty())
			return top.data;
		else
			return null;
	}
	public void display()//���ջ
	{
		Node p = top;		//��ʼ����pָ��ջ��Ԫ��
		while(p!=null){		//������зǿսڵ��ֵ��ֱ��ջΪ��Ϊֹ
			System.out.print(p.data.toString()+" ");
			p=p.next;		
		}
	}
	public void push(Object x)//��ջ
	{
		Node p=new Node(x);	//����һ���½ڵ�
		p.next=top;
		top=p;				//�½ڵ��Ϊ��ǰ��ջ���ڵ�
	}
	public Object pop(){//��ջ
		if(isEmpty())		//ջΪ��
			return null;
		else//ջ��Ϊ��
		{
			Node p=top;		//pָ��ɾ�ڵ㣨ջ��)
			top=top.next;	//ɾ��ջ���ڵ�
			return p.data;	//����ջ���ڵ��ֵ
		}
	}
	public  boolean indexOf(int a)//����ֵΪa�Ľڵ�
	{
		Node p=top;
		while(p!=null){//���в�Ϊ��
			if(a==Integer.parseInt(p.data.toString()))//�жϸýڵ�ֵ�Ƿ��봫�����Ĳ���ֵ���
				break;//����������ѭ��
			else
				p=p.next;//��ȡ��һ���ڵ��ж�
		}
		if(p==null)//������ջ��û�ҵ�ֵΪa�Ľڵ�
			return false;
		else //û��������˳�ѭ����֤��ջ����ֵΪa�Ľڵ�
			return true;
	}
}