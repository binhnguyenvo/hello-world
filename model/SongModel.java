package com.recognizer.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Song.
 */
@XmlType(propOrder = { "id", "name", "encodedValue", "addedDate"})
public class SongModel {
	private final StringProperty id;
	
	private final StringProperty name;
	
	private final StringProperty encodedValue;
	
	private final ObjectProperty<LocalDate> addedDate;
	
	private final IntegerProperty order;
	
	private final IntegerProperty maxCount;

	public SongModel() {
		this("", "");
	}

	public SongModel(String name, String encodedValue) {
		this.name = new SimpleStringProperty(name);
		this.encodedValue = new SimpleStringProperty(encodedValue);
		
		this.order = new SimpleIntegerProperty(1);
		this.maxCount = new SimpleIntegerProperty(0);
		this.id = new SimpleStringProperty(UUID.randomUUID().toString());
		this.addedDate = new SimpleObjectProperty<LocalDate>(LocalDate.now());
	}

	//------------------------------------------------
	@XmlElement(name="ID")
	public String getId() {
		return this.id.get();
	}

	public void setId(String id) {
		this.id.set(id);
	}

	public StringProperty idProperty() {
		return id;
	}

	//------------------------------------------------
	@XmlElement(name="Name")
	public String getName() {
		return this.name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public StringProperty nameProperty() {
		return name;
	}

	//------------------------------------------------
	@XmlElement(name="EncodedValue")
	public String getEncodedValue() {
		return this.encodedValue.get();
	}

	public void setEncodedValue(String encodedValue) {
		this.encodedValue.set(encodedValue);
	}

	public StringProperty encodedValueProperty() {
		return encodedValue;
	}

	//------------------------------------------------
	@XmlElement(name="AddedDate")
	public LocalDate getAddedDate() {
		addedDate.set(LocalDate.of(2016, 9, 15));
		return this.addedDate.get();
	}

	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	public void setAddedDate(LocalDate addedDate) {
		this.addedDate.set(addedDate);
	}

	public ObjectProperty<LocalDate> addedDateProperty() {
		return addedDate;
	}
	
	//------------------------------------------------
	@XmlTransient
	public int getOrder() {
		return this.order.get();
	}

	public void setOrder(int name) {
		this.order.set(name);
	}

	public IntegerProperty orderProperty() {
		return order;
	}
	
	//------------------------------------------------
	@XmlTransient
	public int getMaxCount() {
		return this.maxCount.get();
	}

	public void setMaxCount(int name) {
		this.maxCount.set(name);
	}

	public IntegerProperty maxCountProperty() {
		return maxCount;
	}
	

}


class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	public LocalDate unmarshal(String v) throws Exception {
		return LocalDate.parse(v);
	}

	public String marshal(LocalDate v) throws Exception {
		return v.toString();
	}

}
