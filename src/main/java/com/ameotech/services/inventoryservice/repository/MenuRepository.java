package com.ameotech.services.inventoryservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ameotech.services.inventoryservice.entity.Menu;

import ameotech.services.common.repos.BaseRepository;

public interface MenuRepository extends BaseRepository<Menu, Integer> {

	@Query(value = "Select * from tblmenu where site_id = :siteId", nativeQuery =true)
	List<Menu> findbySiteId(@Param("siteId") int siteId);
}
