//@formatter:off
/**
 * @author sseyha
 * @date Jul 7, 2024
 * @time 2:07:07 PM
 * @fileName InventoryClient.java 
 * 
 */
package com;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.model.Inventory;

@FeignClient(name = "inventory-service")
public interface InventoryClient {
    @GetMapping("/api/v1/inventory/{productId}")
    Inventory getInventoryByProductId(@PathVariable("productId") Long productId);
}
