Action()
{

	lr_start_transaction("1_LaunchUrl");

	web_set_sockets_option("SSL_VERSION", "AUTO");

	web_add_auto_header("Accept-Language", 
		"en-US,en;q=0.9");

	web_url("jpetstore.aspectran.com", 
		"URL=https://jpetstore.aspectran.com/", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("1_LaunchUrl",LR_AUTO);

	lr_start_transaction("2_Category");

	web_url("Dogs", 
		"URL=https://jpetstore.aspectran.com/categories/DOGS", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://jpetstore.aspectran.com/", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("2_Category",LR_AUTO);

	lr_think_time(18);

	lr_start_transaction("3_product");

	web_url("K9-RT-01", 
		"URL=https://jpetstore.aspectran.com/products/K9-RT-01", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://jpetstore.aspectran.com/categories/DOGS", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		LAST);

	web_websocket_send("ID=3", 
		"Buffer={\"messageType\":\"hello\",\"broadcasts\":{\"remote-settings/monitor_changes\":\"\\\"0\\\"\"},\"use_webpush\":true}", 
		"IsBinary=0", 
		LAST);

	/*Connection ID 3 received buffer WebSocketReceive0*/

	lr_end_transaction("3_product",LR_AUTO);

	lr_start_transaction("4_Item");

	web_url("EST-32", 
		"URL=https://jpetstore.aspectran.com/products/K9-RT-01/items/EST-32", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://jpetstore.aspectran.com/products/K9-RT-01", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("4_Item",LR_AUTO);

	lr_start_transaction("5_AddToCart");

	web_url("Add to Cart", 
		"URL=https://jpetstore.aspectran.com/cart/addItemToCart?itemId=EST-32", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://jpetstore.aspectran.com/products/K9-RT-01/items/EST-32", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("5_AddToCart",LR_AUTO);

	lr_start_transaction("6_checkout");

	web_url("Proceed to Checkout", 
		"URL=https://jpetstore.aspectran.com/order/newOrderForm", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://jpetstore.aspectran.com/cart/viewCart", 
		"Snapshot=t6.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("6_checkout",LR_AUTO);

	lr_start_transaction("7_login");

	web_submit_data("signon", 
		"Action=https://jpetstore.aspectran.com/account/signon", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=https://jpetstore.aspectran.com/account/signonForm?referer=/order/newOrderForm", 
		"Snapshot=t7.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=referer", "Value=/order/newOrderForm", ENDITEM, 
		"Name=username", "Value=j2ee", ENDITEM, 
		"Name=password", "Value=j2ee", ENDITEM, 
		LAST);

	lr_end_transaction("7_login",LR_AUTO);

	lr_think_time(18);

	lr_start_transaction("8_continue");

	web_submit_data("newOrder", 
		"Action=https://jpetstore.aspectran.com/order/newOrder", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=https://jpetstore.aspectran.com/order/newOrderForm", 
		"Snapshot=t9.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=paymentForm", "Value=true", ENDITEM, 
		"Name=billingForm", "Value=true", ENDITEM, 
		"Name=cardType", "Value=Visa", ENDITEM, 
		"Name=creditCard", "Value=999999999999999", ENDITEM, 
		"Name=expiryDate", "Value=12/2019", ENDITEM, 
		"Name=billToFirstName", "Value=Test", ENDITEM, 
		"Name=billToLastName", "Value=User", ENDITEM, 
		"Name=billAddress1", "Value=123 Test St", ENDITEM, 
		"Name=billAddress2", "Value=123 Test St", ENDITEM, 
		"Name=billCity", "Value=Testville", ENDITEM, 
		"Name=billState", "Value=CA", ENDITEM, 
		"Name=billZip", "Value=10001", ENDITEM, 
		"Name=billCountry", "Value=US", ENDITEM, 
		LAST);

	lr_end_transaction("8_continue",LR_AUTO);

	lr_start_transaction("9_order");

	web_submit_data("submitOrder", 
		"Action=https://jpetstore.aspectran.com/order/submitOrder", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=https://jpetstore.aspectran.com/order/newOrder", 
		"Snapshot=t10.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=confirmed", "Value=true", ENDITEM, 
		LAST);

	lr_end_transaction("9_order",LR_AUTO);

	return 0;
}