package com.recognizer.model;

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

	@XmlElement(name="SongId")
	public String getSongId() {
		return this.songId;
	}
	
	public void setSongId(String songId) {
		this.songId = songId;
	}

	@XmlElement(name="Time")
	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}