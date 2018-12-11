package dataobject;

public class LecturePrimitiveEnum {

	private String profName;
	
	private int size;
		
	private ProfLevels profLevel;

	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public ProfLevels getProfLevel() {
		return profLevel;
	}
	public void setProfLevel(ProfLevels profLevel) {
		this.profLevel = profLevel;
	}


	@Override
	public String toString() {
		return "LecturePrimitiveEnum [profName=" + profName + ", size=" + size + ", profLevel=" + profLevel + "]";
	}
	
}
