Action()
{

	web_websocket_send("ID=0", 
		"Buffer={\"messageType\":\"hello\",\"broadcasts\":{\"remote-settings/monitor_changes\":\"\\\"1790836606237\\\"\"},\"use_webpush\":true}", 
		"IsBinary=0", 
		LAST);

	/*Connection ID 0 received buffer WebSocketReceive0*/

	lr_start_transaction("1_LaunchUrl");

	web_set_sockets_option("SSL_VERSION", "AUTO");

	web_add_auto_header("Accept-Language", 
		"en-US,en;q=0.9");

	lr_think_time(17);

	web_url("demowebshop.tricentis.com", 
		"URL=https://demowebshop.tricentis.com/", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=/Themes/DefaultClean/Content/images/top-menu-divider.png", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		"Url=/Themes/DefaultClean/Content/images/bullet-right.gif", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		"Url=/Themes/DefaultClean/Content/images/star-x-active.png", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		"Url=/Themes/DefaultClean/Content/images/star-x-inactive.png", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		"Url=/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/loading.gif", "Referer=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/default.css", ENDITEM, 
		"Url=/Content/jquery-ui-themes/smoothness/images/ui-bg_flat_75_ffffff_40x100.png", "Referer=https://demowebshop.tricentis.com/Content/jquery-ui-themes/smoothness/jquery-ui-1.10.3.custom.min.css", ENDITEM, 
		"Url=/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/arrows.png", "Referer=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/default.css", ENDITEM, 
		"Url=/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/bullets.png", "Referer=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/default.css", ENDITEM, 
		"Url=/Themes/DefaultClean/Content/images/top-menu-triangle.png", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		"Url=/Themes/DefaultClean/Content/images/ico-arrow-r.gif", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		"Url=/Themes/DefaultClean/Content/images/free-shipping.png", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		"Url=/Themes/DefaultClean/Content/images/ajax_loader_large.gif", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		"Url=/Themes/DefaultClean/Content/images/ico-close-notification-bar.png", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		LAST);

	lr_end_transaction("1_LaunchUrl",LR_AUTO);

	lr_think_time(15);

	lr_start_transaction("2_Register");

	web_url("Register", 
		"URL=https://demowebshop.tricentis.com/register", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("2_Register",LR_AUTO);

	lr_start_transaction("3_RegisterDetails");

	web_submit_data("register", 
		"Action=https://demowebshop.tricentis.com/register", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/register", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		"EncodeAtSign=YES", 
		ITEMDATA, 
		"Name=__RequestVerificationToken", "Value=3B9iH2kc4W3SjZCd25aEBwX90sFPtmMWnNQDU1L6hgzDdYP2ru6dZGZwWvVBatgkrwfNo6aUdpEBMEyeQ2_SlqaJYj4CkV2pWB6HEgoWD141", ENDITEM, 
		"Name=Gender", "Value=F", ENDITEM, 
		"Name=FirstName", "Value=swati", ENDITEM, 
		"Name=LastName", "Value=sahu", ENDITEM, 
		"Name=Email", "Value=swati99@gmail.com", ENDITEM, 
		"Name=Password", "Value=swati@99", ENDITEM, 
		"Name=ConfirmPassword", "Value=swati@99", ENDITEM, 
		"Name=register-button", "Value=Register", ENDITEM, 
		LAST);

	web_url("Tricentis Demo Web Shop", 
		"URL=https://demowebshop.tricentis.com/", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/registerresult/1", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("3_RegisterDetails",LR_AUTO);

	lr_start_transaction("4_Category");

	web_url("Books", 
		"URL=https://demowebshop.tricentis.com/books", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("4_Category",LR_AUTO);

	lr_think_time(15);

	lr_start_transaction("5_product");

	web_url("Computing and Internet", 
		"URL=https://demowebshop.tricentis.com/computing-and-internet", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/books", 
		"Snapshot=t6.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=/content/images/thumbs/0000130_computing-and-internet_47.jpeg", ENDITEM, 
		LAST);

	lr_end_transaction("5_product",LR_AUTO);

	lr_start_transaction("6_AddtoCart");

	web_submit_data("1", 
		"Action=https://demowebshop.tricentis.com/addproducttocart/details/13/1", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/computing-and-internet", 
		"Snapshot=t7.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=addtocart_13.EnteredQuantity", "Value=1", ENDITEM, 
		LAST);

	lr_end_transaction("6_AddtoCart",LR_AUTO);

	lr_think_time(12);

	web_submit_data("1_2", 
		"Action=https://demowebshop.tricentis.com/addproducttocart/details/13/1", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/computing-and-internet", 
		"Snapshot=t8.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=addtocart_13.EnteredQuantity", "Value=1", ENDITEM, 
		LAST);

	lr_think_time(30);

	lr_start_transaction("7_ShoppingCart");

	web_url("cart", 
		"URL=https://demowebshop.tricentis.com/cart", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/computing-and-internet", 
		"Snapshot=t9.inf", 
		"Mode=HTML", 
		LAST);

	web_add_auto_header("Accept-Language", 
		"en-US,en;q=0.9");

	lr_think_time(43);

	web_url("getstatesbycountryid", 
		"URL=https://demowebshop.tricentis.com/country/getstatesbycountryid?countryId=4&addEmptyStateIfRequired=true&_=1790845785857", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/cart", 
		"Snapshot=t10.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=../Themes/DefaultClean/Content/images/ajax_loader_small.gif", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		LAST);

	web_submit_data("cart_2", 
		"Action=https://demowebshop.tricentis.com/cart", 
		"Method=POST", 
		"EncType=multipart/form-data", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/cart", 
		"Snapshot=t11.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=itemquantity7121439", "Value=2", ENDITEM, 
		"Name=discountcouponcode", "Value=85566", ENDITEM, 
		"Name=giftcardcouponcode", "Value=51321245", ENDITEM, 
		"Name=CountryId", "Value=4", ENDITEM, 
		"Name=StateProvinceId", "Value=0", ENDITEM, 
		"Name=ZipPostalCode", "Value=5555565", ENDITEM, 
		"Name=termsofservice", "Value=on", ENDITEM, 
		"Name=checkout", "Value=checkout", ENDITEM, 
		EXTRARES, 
		"Url=/plugins/Payments.CashOnDelivery/logo.jpg", "Referer=https://demowebshop.tricentis.com/onepagecheckout", ENDITEM, 
		"Url=/plugins/Payments.CheckMoneyOrder/logo.jpg", "Referer=https://demowebshop.tricentis.com/onepagecheckout", ENDITEM, 
		"Url=/plugins/Payments.Manual/logo.jpg", "Referer=https://demowebshop.tricentis.com/onepagecheckout", ENDITEM, 
		"Url=/plugins/Payments.PurchaseOrder/logo.jpg", "Referer=https://demowebshop.tricentis.com/onepagecheckout", ENDITEM, 
		LAST);

	lr_end_transaction("7_ShoppingCart",LR_AUTO);

	lr_start_transaction("8_address");

	web_submit_data("OpcSaveBilling", 
		"Action=https://demowebshop.tricentis.com/checkout/OpcSaveBilling/", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t12.inf", 
		"Mode=HTML", 
		"EncodeAtSign=YES", 
		ITEMDATA, 
		"Name=BillingNewAddress.Id", "Value=0", ENDITEM, 
		"Name=BillingNewAddress.FirstName", "Value=swati", ENDITEM, 
		"Name=BillingNewAddress.LastName", "Value=sahu", ENDITEM, 
		"Name=BillingNewAddress.Email", "Value=swati99@gmail.com", ENDITEM, 
		"Name=BillingNewAddress.Company", "Value=", ENDITEM, 
		"Name=BillingNewAddress.CountryId", "Value=0", ENDITEM, 
		"Name=BillingNewAddress.StateProvinceId", "Value=0", ENDITEM, 
		"Name=BillingNewAddress.City", "Value=hgghj", ENDITEM, 
		"Name=BillingNewAddress.Address1", "Value=jbbn", ENDITEM, 
		"Name=BillingNewAddress.Address2", "Value=", ENDITEM, 
		"Name=BillingNewAddress.ZipPostalCode", "Value=85589", ENDITEM, 
		"Name=BillingNewAddress.PhoneNumber", "Value=8529631475", ENDITEM, 
		"Name=BillingNewAddress.FaxNumber", "Value=", ENDITEM, 
		LAST);

	lr_think_time(4);

	web_url("getstatesbycountryid_2", 
		"URL=https://demowebshop.tricentis.com/country/getstatesbycountryid?countryId=2&addEmptyStateIfRequired=true&_=1790845837370", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t13.inf", 
		"Mode=HTML", 
		LAST);

	lr_think_time(4);

	web_submit_data("OpcSaveBilling_2", 
		"Action=https://demowebshop.tricentis.com/checkout/OpcSaveBilling/", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t14.inf", 
		"Mode=HTML", 
		"EncodeAtSign=YES", 
		ITEMDATA, 
		"Name=BillingNewAddress.Id", "Value=0", ENDITEM, 
		"Name=BillingNewAddress.FirstName", "Value=swati", ENDITEM, 
		"Name=BillingNewAddress.LastName", "Value=sahu", ENDITEM, 
		"Name=BillingNewAddress.Email", "Value=swati99@gmail.com", ENDITEM, 
		"Name=BillingNewAddress.Company", "Value=", ENDITEM, 
		"Name=BillingNewAddress.CountryId", "Value=2", ENDITEM, 
		"Name=BillingNewAddress.StateProvinceId", "Value=63", ENDITEM, 
		"Name=BillingNewAddress.City", "Value=hgghj", ENDITEM, 
		"Name=BillingNewAddress.Address1", "Value=jbbn", ENDITEM, 
		"Name=BillingNewAddress.Address2", "Value=", ENDITEM, 
		"Name=BillingNewAddress.ZipPostalCode", "Value=85589", ENDITEM, 
		"Name=BillingNewAddress.PhoneNumber", "Value=8529631475", ENDITEM, 
		"Name=BillingNewAddress.FaxNumber", "Value=", ENDITEM, 
		EXTRARES, 
		"Url=/Themes/DefaultClean/Content/images/arrow-up.png", "Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", ENDITEM, 
		LAST);

	lr_end_transaction("8_address",LR_AUTO);

	lr_think_time(23);

	lr_start_transaction("9_ShippingAddress");

	web_submit_data("OpcSaveShipping", 
		"Action=https://demowebshop.tricentis.com/checkout/OpcSaveShipping/", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t15.inf", 
		"Mode=HTML", 
		"EncodeAtSign=YES", 
		ITEMDATA, 
		"Name=shipping_address_id", "Value=5159714", ENDITEM, 
		"Name=ShippingNewAddress.Id", "Value=0", ENDITEM, 
		"Name=ShippingNewAddress.FirstName", "Value=swati", ENDITEM, 
		"Name=ShippingNewAddress.LastName", "Value=sahu", ENDITEM, 
		"Name=ShippingNewAddress.Email", "Value=swati99@gmail.com", ENDITEM, 
		"Name=ShippingNewAddress.Company", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.CountryId", "Value=0", ENDITEM, 
		"Name=ShippingNewAddress.StateProvinceId", "Value=0", ENDITEM, 
		"Name=ShippingNewAddress.City", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.Address1", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.Address2", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.ZipPostalCode", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.PhoneNumber", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.FaxNumber", "Value=", ENDITEM, 
		"Name=PickUpInStore", "Value=false", ENDITEM, 
		LAST);

	lr_end_transaction("9_ShippingAddress",LR_AUTO);

	lr_think_time(19);

	lr_start_transaction("10_shippingMethod");

	web_submit_data("OpcSaveShippingMethod", 
		"Action=https://demowebshop.tricentis.com/checkout/OpcSaveShippingMethod/", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t16.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=shippingoption", "Value=Ground___Shipping.FixedRate", ENDITEM, 
		LAST);

	lr_end_transaction("10_shippingMethod",LR_AUTO);

	lr_think_time(15);

	lr_start_transaction("11_paymentMethod");

	web_submit_data("OpcSavePaymentMethod", 
		"Action=https://demowebshop.tricentis.com/checkout/OpcSavePaymentMethod/", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t17.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=paymentmethod", "Value=Payments.CashOnDelivery", ENDITEM, 
		LAST);

	lr_end_transaction("11_paymentMethod",LR_AUTO);

	lr_think_time(16);

	lr_start_transaction("12_paymentinfo");

	web_custom_request("OpcSavePaymentInfo", 
		"URL=https://demowebshop.tricentis.com/checkout/OpcSavePaymentInfo/", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t18.inf", 
		"Mode=HTML", 
		"EncType=", 
		LAST);

	lr_end_transaction("12_paymentinfo",LR_AUTO);

	lr_think_time(19);

	lr_start_transaction("13_confirm");

	web_custom_request("OpcConfirmOrder", 
		"URL=https://demowebshop.tricentis.com/checkout/OpcConfirmOrder/", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t19.inf", 
		"Mode=HTML", 
		"EncType=", 
		LAST);

	web_url("completed", 
		"URL=https://demowebshop.tricentis.com/checkout/completed/", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t20.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("13_confirm",LR_AUTO);

	return 0;
}