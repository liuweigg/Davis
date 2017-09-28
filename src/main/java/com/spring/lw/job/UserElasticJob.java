package com.spring.lw.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class UserElasticJob implements SimpleJob {
	private static Logger logger = LoggerFactory.getLogger(UserElasticJob.class);
	
	@Override
	public void execute(ShardingContext context) {
		// TODO Auto-generated method stub
		switch (context.getShardingItem()) {
	        case 0: 
	        	logger.info("-- UserElasticJob execute context ShardingItem = " + context.getShardingItem()
	        			+ " | ShardingParameter = " + context.getShardingParameter());
	            break;
	        case 1: 
	        	logger.info("-- UserElasticJob execute context ShardingItem = " + context.getShardingItem()
	        			+ " | ShardingParameter = " + context.getShardingParameter());
	            break;
	        case 2: 
	        	logger.info("-- UserElasticJob execute context ShardingItem= " + context.getShardingItem()
	        			+ " | ShardingParameter = " + context.getShardingParameter());
	            break;
	        // case n: ...
	    }
	}

}
