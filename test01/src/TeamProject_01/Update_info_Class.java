package TeamProject_01;

public class Update_info_Class {
	
	int userno;
	int curmoney;
	int tabmoney;
	int automoney;
	int mylevel;
	int myitem;
	int myfriendlevel;

	public Update_info_Class() {
		super();
	}

	public Update_info_Class(int userno, int curmoney, int tabmoney, int automoney, int mylevel, int myitem, int myfriendlevel) {
		super();
		this.userno = userno;
		this.curmoney = curmoney;
		this.tabmoney = tabmoney;
		this.automoney = automoney;
		this.mylevel = mylevel;
		this.myitem = myitem;
		this.myfriendlevel = myfriendlevel;
	}

	@Override
	public String toString() {
		return "Update_info_Class [curmoney=" + curmoney + ", tabmoney=" + tabmoney + ", automoney=" + automoney
				+ ", mylevel=" + mylevel + ", myitem=" + myitem + ", myfriendlevel=" + myfriendlevel + "]";
	}

}