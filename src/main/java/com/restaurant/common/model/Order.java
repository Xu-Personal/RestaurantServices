@Document
public class Order {
  String orderId;
  long orderTime;
  DeliveryRequest deliveryRequest;
  PaymentInfo paymentInfo;
  OrderStatus status;
  long completeTime;
  String tableId;
  OrderType orderType; // take out, delivery, inside seating, outside seating
  List<MenuItem> orderItems;
}
