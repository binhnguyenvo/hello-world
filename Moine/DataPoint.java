

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "songId", "time"})
public class DataPoint {

	private int time;

	private String songId;
	
	public DataPoint()
	{
		this("", 0);
	}

	public DataPoint(String songId, int time) {
		this.setSongId(songId);
		this.setTime(time);
	}

	
	
	public void setSongId(String songId) {
		this.MySongId = songId;
	}

	@XmlElement(name="Time")
	public int getTimerNew() {
		return this.time;
	}

	public void setTime(int time) {
		
		int k = 5;
		k++;
		
		return;
	}
}