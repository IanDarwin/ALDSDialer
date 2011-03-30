package com.darwinsys.tel;

/** In this version ALDSSite is an Enum, but in
 * future it could be a DAO, as long as we keep
 * the interface, e.g., ALDSSite.values().
 * Alternately the locations could be gleaned
 * from the Contacts database.
 * @author Ian Darwin
 */
public enum ALDSSite {
	TORONTO("Toronto", 43.747,-79.466,"416-555-1212"),
	OTTAWA("Ottawa", 56, 56, "613-555-1212");

	String locationName;
	double lattitude, longitude;
	String localNumber;
	private ALDSSite(String locationName, double lattitude, double longitude, String localNumber) {
		this.locationName = locationName;
		this.lattitude = lattitude;
		this.longitude = longitude;
		this.localNumber = localNumber;
	}
	public double getLattitude() {
		return lattitude;
	}
	public String getLocalNumber() {
		return localNumber;
	}
	public String getLocationName() {
		return locationName;
	}
	public double getLongitude() {
		return longitude;
	}
}
