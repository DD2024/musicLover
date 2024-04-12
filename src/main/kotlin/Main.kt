fun main() {

    val amount = 12000;
    val regularCustomer = true;

    val progressiveDiscount = if (amount >= 1001 && amount <= 10000) 100
    else if (amount > 10000) amount * 5/100 else 0;

    val regularCustomerDiscount = if (regularCustomer) (amount - progressiveDiscount)/100
    else 0;

    val totalAmount = amount - progressiveDiscount - regularCustomerDiscount;
    println("Итого сумма к оплате: " + totalAmount);
}