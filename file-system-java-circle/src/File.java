

public class File extends FileSystemObject{
	String format;
	String visibleName;
	byte[] data;
	// TODO Owners, users, authorization
	
	public File(String name, 
				String format, 
				byte[] data) {
		
		super(name);
		this.format = format;
		this.visibleName = name + "." + format;
		this.sizeInBytes = data.length;
		this.data = data;
	}
	


	public void setName(String name) {
		this.name = name;
		updateVisibleName();
	}
	
	private void updateVisibleName() {
		this.visibleName = this.name + "." + this.format;		
	}
	
	public String getVisibleName() {
		return this.visibleName;
	}
	
	public String getFormat() {
		return this.format;
	}
	
	public int getSizeInBytes() {
		return this.sizeInBytes;
	}
	
	public byte[] getData() {
		return this.data;
	}



	@Override
	public int calcSizeIntBytes() {
		return this.sizeInBytes;
	}
	
	
	
}
