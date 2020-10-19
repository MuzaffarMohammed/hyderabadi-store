/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hs.jpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hs.entities.HSMenuList;



/**
 * @author Muzaffar Mohammed, 
 * 		   +91 9951204368
 */

@Repository
public interface HSMenuListJPARepository extends JpaRepository<HSMenuList, Long>{

	
   
}
