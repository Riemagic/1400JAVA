package Ch15UpdownCasting;

class Computer
{
	private String SerialNo;
	private String CPUSepc;
	private String RAMSpec;
	private String DISKSpec;
	
	public String getSerialNo() {
		return SerialNo;
	}
	public void setSerialNo(String serialNo) {
		SerialNo = serialNo;
	}

	public String getCPUSepc() {
		return CPUSepc;
	}
	public void setCPUSepc(String cPUSepc) {
		CPUSepc = cPUSepc;
	}

	public String getRAMSpec() {
		return RAMSpec;
	}
	public void setRAMSpec(String rAMSpec) {
		RAMSpec = rAMSpec;
	}

	public String getDISKSpec() {
		return DISKSpec;
	}
	public void setDISKSpec(String dISKSpec) {
		DISKSpec = dISKSpec;
	}

	
	public void PowerOn()
	{
		System.out.println(SerialNo + " 전원을 켭니다");
	}
	
	public void PowerOff()
	{
		System.out.println(SerialNo + " 전원을 끕니다");
	}
	
	public Computer(String serialNo, String cPUSepc, String rAMSpec, String dISKSpec)
	{
		super();
		SerialNo = serialNo;
		CPUSepc = cPUSepc;
		RAMSpec = rAMSpec;
		DISKSpec = dISKSpec;
	}
	
	@Override
	public String toString() {
		return "Computer [SerialNo=" + SerialNo + ", CPUSepc=" + CPUSepc + ", RAMSpec=" + RAMSpec + ", DISKSpec="
				+ DISKSpec + "]";
	}
}

class Notebook extends Computer
{
	public int battery;
	public Notebook(String SerialNo, String CPUSpec, String RAMSpec, String DISKSpec, int battery)
	{
		super(SerialNo, CPUSpec, RAMSpec, DISKSpec);
		this.battery = battery;
	}
	
	public void Move()
	{
		if(battery - 5 < 0)
		{
			battery = 0;
			System.out.println("배터리가 방전되어 전원이 꺼집니다");
		}
		else
		{
			System.out.println(this.getSerialNo() + " 이동합니다");
			battery -= 5;
		}
	}

	@Override
	public String toString() {
		return "Notebook [battery=" + battery + ", getSerialNo()=" + getSerialNo() + ", getCPUSepc()=" + getCPUSepc()
				+ ", getRAMSpec()=" + getRAMSpec() + ", getDISKSpec()=" + getDISKSpec() + "]";
	}
}

class Tablet extends Computer
{
	public String PencilNo;
	public Tablet(String SerialNo, String CPUSpec, String RAMSpec, String DISKSpec, String PencilNo)
	{
		super(SerialNo, CPUSpec, RAMSpec, DISKSpec);
		this.PencilNo = PencilNo;
	}
	
	public void WritePen()
	{
		System.out.println(PencilNo + " 를 이용하여 씁니다");
	}

	@Override
	public String toString() {
		return "Tablet [PencilNo=" + PencilNo + ", getSerialNo()=" + getSerialNo() + ", getCPUSepc()=" + getCPUSepc()
				+ ", getRAMSpec()=" + getRAMSpec() + ", getDISKSpec()=" + getDISKSpec() + "]";
	}
}

public class C03UpdownCastingMain {
	
	public static void ShowInfo(Computer ref)
	{
		if(ref instanceof Notebook)
		{
			Notebook downN = (Notebook)ref;
			System.out.println(downN.toString());
		}
		
		else if(ref instanceof Tablet)
		{
			Tablet downT = (Tablet)ref;
			System.out.println(downT.toString());
		}
	}

	public static void main(String[] args) {
		Notebook Mycom = new Notebook("1-2-3-4", "i7", "16G", "1TB", 100);
		Tablet Mytab = new Tablet("9-8-7-6", "i3", "8G", "128GB", "Pen-123");
		ShowInfo(Mycom);
		ShowInfo(Mytab);
		
		Mycom.PowerOn();
		Mycom.Move();
		Mycom.PowerOff();
		Mytab.WritePen();
		
		ShowInfo(Mycom);

	}

}
