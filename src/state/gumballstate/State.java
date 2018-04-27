package state.gumballstate;

public interface State {
 
	public void insertQuarter();  // 投入25
	public void ejectQuarter();   // 退回25
	public void turnCrank();   // 转动曲柄
	public void dispense();	   // 发放糖果
	
	public void refill();
}
