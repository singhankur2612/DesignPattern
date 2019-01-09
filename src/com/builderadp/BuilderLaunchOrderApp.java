package com.builderadp;

import com.builderadp.LunchOrder.Builder;

public class BuilderLaunchOrderApp {

	public static void main(String[] args) {
		LunchOrder.Builder builder=new Builder();
		builder.bread("wheat").dressing("cheese").meat("chiken");
		
		LunchOrder lunchOrder=builder.build();
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
		
	}

}
