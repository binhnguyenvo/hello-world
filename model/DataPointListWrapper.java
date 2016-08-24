package com.recognizer.model;

import java.util.LinkedList;

import javax.xml.bind.annotation.XmlElementWrapper;

public class DataPointListWrapper{
	
	private LinkedList<DataPoint> dataPoints;
	
	public DataPointListWrapper()
	{
		dataPoints = new LinkedList<>();
	}

	@XmlElementWrapper(name = "DataPointList")
	public LinkedList<DataPoint> getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(LinkedList<DataPoint> dataPoints) {
		this.dataPoints = dataPoints;
	}
	
}
