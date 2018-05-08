import java.util.Scanner;//表达式先转换成后缀表达式，然后再计算(若要输入括号，要求英文是英文的括号)
public class InDirectCal//转换成后缀表达式,然后再运算
{
	public String inDirect(String str)	//转换成后缀表达式的静态方法inDirect()
	{
		LinkStack ls=new LinkStack();//存放操作符
		int i=0;//循环控制变量
		String s="";//s存放后缀表达式
		String c;//c存放从str提取出来的单个字符串
		while(i<str.length()){	//外层循环，因为字符串长str.length()，所以循环str.length()次
			c=str.charAt(i)+"";	//取出一个字符
			if(isOper(c)){	//字符串为运算符，则进入if语句进行操作
				if(ls.isEmpty()){				//栈为空
					ls.push(c);	//该字符入栈
				}
				else{							//栈不为空
					if(c.equals("(")){//若输入左括号
						ls.push(c);	//左括号入栈
					}
					else{//不是左括号
							if(c.equals(")")){	//若此字符是右括号
								//当前输入右括号，反复将栈顶元素弹出，并送往后缀表达式s，直到栈顶元素为左括号为止
								while(!("(".equals(ls.peek().toString()) ) )//循环直到栈顶元素是左括号为止
									s=s+ls.pop().toString();				//取出来，加到后缀算数表达式字符串s上
								ls.pop();	//循环过后，栈顶元素为左括号，所以弹出左括号
							}
							else{//若不是右括号
								while(!ls.isEmpty()){	//内层循环，栈ls不为空，则比较栈顶元素与字符c的优先级						
									if(prio(c)>prio(ls.peek().toString())){	//若c的优先级大于栈顶元素
											ls.push(c);	//c入栈
											break;	//退出该层循环
									}											
									else	//c的优先级小于栈顶元素
										s=s+ls.pop();	//把栈顶元素加到后缀算数表达式字符串s上
								}
								if(ls.isEmpty())//如果上面的内层循环使栈为空，则直接把字符c放进栈ls里面
									ls.push(c);
							}
					}
				}
			}
			else//字符串为操作数
			{
				if((i+1)<str.length() && !isOper(str.charAt(i+1)+""))
						s=s+c;
				else
					s=s+c+" ";
			}
			i++;
		}
		while(!ls.isEmpty())	//循环完后，取出剩下的运算符，把它们全部放到字符串s上
			s=s+ls.pop();
		return cal(s);				//返回后缀算数表达式字符串s
	}
	public String cal(String s)
	{
		LinkStack ls=new LinkStack();
		int i=0;
		String n="";//存放字符串
		while(i<s.length())	//字符串长度为s.length().所以循环s.length()次
		{
			if(!(s.charAt(i)+"").equals(" ")  && !isOper(s.charAt(i)+""))//非空格并且非操作符
				n=n+s.charAt(i++)+"";	//取出s中的一个字符,然后i++控制循环
			else if(isOper(s.charAt(i)+""))	//若为操作符，进入if语句进行后继运算
			{
				if(n.length()>0){//若n不是空字符
					ls.push(n);	//先把上一次的n放进链表ls中
					n="";	//清空n,存放下一次操作的字符
				}
				double num1,num2 = 0;
				char c=s.charAt(i);	//c获得运算符
				String s1;
				if(c!='√'&&c!='!'&&c!='㏒'&&c!='²'){
					s1 = ls.pop().toString();
					if(s1.equals("π"))
						num1 = Math.PI;
					else
				        num1=Double.parseDouble(s1);//操作数num1
					s1 = ls.pop().toString();
					if(s1.equals("π"))
						num2 = Math.PI;
					else
				        num2=Double.parseDouble(s1);//操作数num2
				}
				else{
					s1 = ls.pop().toString();
					if(s1.equals("π"))
						num1 = Math.PI;
					else
				        num1=Double.parseDouble(s1);//操作数num1
				}
				double sum=0;	//sum保存num1，num2运算结果
				double sum1=1;
				switch(c){					//switch判断各种计算方法 
				case'+':sum=num2+num1;break;
				case'-':sum=num2-num1;break;
				case'×':sum=num2*num1;break;
				case'÷':sum=num2/num1;break;
				case'%':sum=num2%num1;break;
				case'^':sum=Math.pow(num2, num1);break;
				case'²':sum=Math.pow(num1, 2);break;
				case'√':sum=Math.sqrt(num1); break;
				case'!':for(int k = 1;k <= num1; k++)
					        sum1 = sum1 * k;
				            sum = sum1;
				            break;
				case'㏒':sum=Math.log10(num1);
				}
				ls.push(sum);	//把这一次运算的结果放进栈ls
				i++;
			}
			else
			{
				if(n.length()>0)	//n不为空
					ls.push(n);	//操作数入栈
				n="";	//清空n,存放下一次操作的字符
				i++;	//循环控制变量
			}
		}
		return ls.pop().toString();	//返回结果	
	}
	public int prio(String s)//判断字符的优先级
	{
			int prio=-1;
			if (s.equals("+") || s.equals("-"))
				prio=1;
			else if(s.equals("×") || s.equals("÷") || s.equals("%"))
				prio=2;
			else if(s.equals("^") || s.equals("√") || s.equals("!")
					|| s.equals("㏒") || s.equals("²"))
				prio=3;
			else 	//括号不分优先级别
				prio=-1;
			return prio;	//返回优先级数值
	}
	public boolean isOper(String s)	//判断字符串是否为运算符
	{
		if (s.equals("+") || s.equals("-") || s.equals("×") || s.equals("÷") 
			||s.equals("^") || s.equals("%") || s.equals("(") || s.equals(")") 
			|| s.equals("√") || s.equals("!") || s.equals("㏒") || s.equals("²"))
			return true;					//如果字符为以上运算符，则返回true
		else 									
			return false;
	}
}
