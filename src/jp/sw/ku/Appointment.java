package jp.sw.ku;

class Appointment extends Booking {
	int appointmentID;
	int doctorID;
	
	public Appointment(int appointmentID, String patientID, int doctorID, String timeStart, String timeEnd, int booking) {
		super(patientID, timeStart, timeEnd, booking);
		this.appointmentID = appointmentID;
		this.doctorID = doctorID;
	}
	public Appointment(String patientID, int doctorID, String timeStart, String timeEnd, int booking) {
		super(patientID, timeStart, timeEnd, booking);
		this.doctorID = doctorID;
	}
	public int getAppointmentID() {
		return appointmentID;
	}
	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	
}
