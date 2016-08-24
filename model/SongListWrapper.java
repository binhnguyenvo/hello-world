package com.recognizer.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

@XmlRootElement(name = "SongData")
@XmlType(propOrder = { "songs", "hashedDataPoints"})
public class SongListWrapper {

	/** The data as an observable list of Songs. */
	private ObservableMap<String, SongModel> songs = FXCollections.observableHashMap();
	
    // Mappings between hashcode and data points
	 private Map<Long, DataPointListWrapper> hashedDataPoints = new HashMap<>();
		
    //------------------------------------------------------
	@XmlElementWrapper(name = "SongListWrapper")
	public ObservableMap<String, SongModel> getSongs() {
		return songs;
	}

	public void setSongs(ObservableMap<String, SongModel> songs) {
		this.songs = songs;
	}

    //------------------------------------------------------
	@XmlElementWrapper(name = "DataPointMapWrapper")
	public Map<Long, DataPointListWrapper> getHashedDataPoints() {
		return hashedDataPoints;
	}

	public void setHashedDataPoints(Map<Long, DataPointListWrapper> hashedDataPoints) {
		this.hashedDataPoints = hashedDataPoints;
	}
}



