package state.gumballstate;

public interface State {
 
	public void insertQuarter();  // Ͷ��25
	public void ejectQuarter();   // �˻�25
	public void turnCrank();   // ת������
	public void dispense();	   // �����ǹ�
	
	public void refill();
}
