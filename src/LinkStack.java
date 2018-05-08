//LinkStack.java
public class LinkStack //链栈类
{
	class Node						//定义链表类
	{
		public Object data;			//存放节点值
		public Node next;			//后继节点的引用
		public Node (){}			//无参构造函数
		public Node(Object data){	//有一个参数的构造函数
			this.data=data;	
		}
	}
	private Node top;		//栈顶元素引用
	public boolean isEmpty()//判断栈是否为空
	{
		return top==null;
	}
	public int length()
	{
		Node p=top;			//初始化，p指向栈顶元素
		int length=0;		//计数器
		while(p!=null)		//从栈顶元素开始向后查找，查到p指向空
		{
			p=p.next;		//p指向后继节点
			length++;		//长度增加1
		}
		return length;		//返回长度
	}
	public Object peek()	//返回栈顶元素的值
	{
		if (!isEmpty())
			return top.data;
		else
			return null;
	}
	public void display()//输出栈
	{
		Node p = top;		//初始化，p指向栈顶元素
		while(p!=null){		//输出所有非空节点的值，直到栈为空为止
			System.out.print(p.data.toString()+" ");
			p=p.next;		
		}
	}
	public void push(Object x)//入栈
	{
		Node p=new Node(x);	//构造一个新节点
		p.next=top;
		top=p;				//新节点成为当前的栈顶节点
	}
	public Object pop(){//出栈
		if(isEmpty())		//栈为空
			return null;
		else//栈不为空
		{
			Node p=top;		//p指向被删节点（栈顶)
			top=top.next;	//删除栈顶节点
			return p.data;	//返回栈顶节点的值
		}
	}
	public  boolean indexOf(int a)//查找值为a的节点
	{
		Node p=top;
		while(p!=null){//队列不为空
			if(a==Integer.parseInt(p.data.toString()))//判断该节点值是否与传进来的参数值相等
				break;//存在则跳出循环
			else
				p=p.next;//获取下一个节点判断
		}
		if(p==null)//遍历完栈，没找到值为a的节点
			return false;
		else //没遍历完就退出循环，证明栈存在值为a的节点
			return true;
	}
}