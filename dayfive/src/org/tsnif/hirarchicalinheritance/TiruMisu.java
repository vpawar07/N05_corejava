package org.tsnif.hirarchicalinheritance;

public class TiruMisu extends Android {
	
	private int version;

	

	public TiruMisu(String brandName, String slotType, int version) {
		super(brandName, slotType);
		this.version=version;
	}



	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	@Override
	public String toString() {
		return "TiruMisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	
	

}
