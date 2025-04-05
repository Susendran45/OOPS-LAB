abstract class DeliveryService {
abstract void assignDelivery(String orderId, String address);
abstract void trackDelivery(String orderId);
abstract void cancelDelivery(String orderId);
abstract double calculateFee(double distance, boolean isPriority);
}
class ZeptoDelivery extends DeliveryService {
public void assignDelivery(String orderId, String address) {
System.out.println("Zepto: Delivery assigned for order " + orderId);
System.out.println("Delivery address: " + address);
System.out.println("10-min delivery promise activated!");
}
public void trackDelivery(String orderId) {
System.out.println("Zepto: Tracking order " + orderId);
System.out.println("Current status: Out for delivery");
System.out.println("Estimated arrival: 8 minutes");
}
public void cancelDelivery(String orderId) {
System.out.println("Zepto: Cancelling order " + orderId);
System.out.println("Full refund will be processed");
}
public double calculateFee(double distance, boolean isPriority) {
double baseFee = 25.0;
double distanceCharge = distance * 5.0;
double priorityFee = isPriority ? 15.0 : 0.0;
return baseFee + distanceCharge + priorityFee;
}
}
public class ZeptoDeliveryDemo1 {
public static void main(String[] args) {
DeliveryService zepto = new ZeptoDelivery();
System.out.println("=== ZEPTO DELIVERY DEMO ===");
zepto.assignDelivery("ORD12345", "123 MG Road, Bangalore");
System.out.println("Delivery fee: ₹" + zepto.calculateFee(3.5, true));
zepto.trackDelivery("ORD12345");
zepto.cancelDelivery("ORD12345");
}
} 