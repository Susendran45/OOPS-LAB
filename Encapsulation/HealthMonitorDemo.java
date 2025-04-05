class HealthMonitor {
private String patientName;
private int heartRate;
private int systolicBP;
private int diastolicBP;
public HealthMonitor(String name) {
this.patientName = name;
this.heartRate = 0;
this.systolicBP = 0;
this.diastolicBP = 0;
}
public void setHeartRate(int rate) {
if (rate >= 30 && rate <= 200) {
this.heartRate = rate;
} else {
System.out.println("Invalid heart rate! Must be 30-200 bpm");
}
}
public void setBloodPressure(int systolic, int diastolic) {
if (systolic > diastolic && systolic > 0 && diastolic > 0) {
this.systolicBP = systolic;
this.diastolicBP = diastolic;
} else {
System.out.println("Invalid blood pressure readings!");
}
}
public String checkHealthStatus() {
if (heartRate == 0 || systolicBP == 0) {
return "No data recorded";
}
String status = "Normal";
if (heartRate > 100) status = "Elevated Heart Rate";
if (systolicBP > 140 || diastolicBP > 90) status = "High Blood Pressure";
if (heartRate > 100 && (systolicBP > 140 || diastolicBP > 90)) status = "Critical Condition";
return status;
}
public String getPatientName() {
return patientName;
}
public String getVitals() {
return "HR: " + heartRate + " bpm, BP: " + systolicBP + "/" + diastolicBP + " mmHg";
}
}
public class HealthMonitorDemo {
public static void main(String[] args) {
HealthMonitor patient = new HealthMonitor("John Doe");
patient.setHeartRate(85);
patient.setBloodPressure(120, 80);
System.out.println("Patient: " + patient.getPatientName());
System.out.println("Vitals: " + patient.getVitals());
System.out.println("Status: " + patient.checkHealthStatus());
patient.setHeartRate(110);
patient.setBloodPressure(150, 95);
System.out.println("\nNew Vitals: " + patient.getVitals());
System.out.println("Status: " + patient.checkHealthStatus());
}
}