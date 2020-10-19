package com.hs.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.jpaRepositories.HSMenuListJPARepository;

@Service
public class HSMenuListServiceImpl {

	@Autowired
	HSMenuListJPARepository hsmlRepo;
	
	
	public Set<String> getAllMenuList(){
		try {
			System.out.println("Menu List Size: "+hsmlRepo.count());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
