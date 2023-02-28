package com.ameotech.services.inventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//(scanBasePackages={
	//	"ameotech.services.common","com.ameotech.services.inventoryservice"})
@SpringBootApplication(scanBasePackages={"ameotech.services.common","com.ameotech.services.inventoryservice"})
public class InventoryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryserviceApplication.class, args);
	}

}
