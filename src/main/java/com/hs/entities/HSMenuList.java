package com.hs.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_menu_list database table.
 * 
 */
@Entity
@Table(name="hs_menu_list")
public class HSMenuList implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HSMenuListPK hSMenuListPK;

	public HSMenuList() {
	}

	public HSMenuListPK getHSMenuListPK() {
		return this.hSMenuListPK;
	}

	public void setHSMenuListPK(HSMenuListPK hSMenuListPK) {
		this.hSMenuListPK = hSMenuListPK;
	}

}