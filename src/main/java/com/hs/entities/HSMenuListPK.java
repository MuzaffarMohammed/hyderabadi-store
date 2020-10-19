package com.hs.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_menu_list database table.
 * 
 */
@Embeddable
public class HSMenuListPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int itemId;

	private String itemName;

	private String displayName;

	public HSMenuListPK() {
	}
	public int getItemId() {
		return this.itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HSMenuListPK)) {
			return false;
		}
		HSMenuListPK castOther = (HSMenuListPK)other;
		return 
			(this.itemId == castOther.itemId)
			&& this.itemName.equals(castOther.itemName)
			&& this.displayName.equals(castOther.displayName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.itemId;
		hash = hash * prime + this.itemName.hashCode();
		hash = hash * prime + this.displayName.hashCode();
		
		return hash;
	}
}