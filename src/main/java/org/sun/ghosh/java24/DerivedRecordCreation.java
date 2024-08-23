enum DeliveryType {DAY_1, STD}
enum PaymentType {COD, STD}
record EComCartItem(String itemId,
                    int quantity,
                    DeliveryType dt,
                    PaymentType pt,
                    double discount
                    ) {}
void main(){
    var myItem = new EComCartItem("X-23-D", 1, 
                             DeliveryType.DAY_1, 
                             PaymentType.COD, 20.5);
    // a few moments later ...
    var bookNowItem = myItem with {discount = 55.0;};
}