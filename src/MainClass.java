import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

//MainClass.java
public class MainClass {
	public static void main(String[] args)
	{
	 try
	    {
	        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	 try
	    {
	        //设置本属性将改变窗口边框样式定义
	        BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
	        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	 UIManager.put("RootPane.setupButtonVisible", false);
    new Calculator();
	}
}
