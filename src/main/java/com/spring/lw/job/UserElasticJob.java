package com.spring.lw.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class UserElasticJob implements SimpleJob {

	@Override
	public void execute(ShardingContext context) {
		// TODO Auto-generated method stub
		switch (context.getShardingItem()) {
	        case 0: 
	            System.out.println("UserElasticJob execute context = " + 0);
	            break;
	        case 1: 
	            System.out.println("UserElasticJob execute context = " + 1);
	            break;
	        case 2: 
	            System.out.println("UserElasticJob execute context = " + 2);
	            break;
	        // case n: ...
	    }
	}

}
