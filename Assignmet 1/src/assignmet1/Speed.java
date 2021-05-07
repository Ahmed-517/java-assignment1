package assignmet1;

public class Speed {
	// Attributes
	private float distance;
	private int tHou, tMin, tSec;
	private float mPerSec,KPerHou;
	private int timeInSec;
	
	// Constructor
	public Speed(float distance, int tHou, int tMin, int tSec) {
		this.distance = distance;
		this.tHou = tHou;
		this.tMin = tMin;
		this.tSec = tSec;
	}
	
	// toString Method
	public String toString() {
		// turn all time to seconds
		timeInSec = (tHou*60*60) + (tMin*60) + tSec;
		
		mPerSec = distance / timeInSec;
		KPerHou = ( distance/1000.0f ) / ( timeInSec/3600.0f );
		
		return "Speed in meters per Second = " + mPerSec +
				"\nSpeed in Kilometer per Hour = " + KPerHou;
	}
}