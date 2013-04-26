package com.glz.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.glz.entity.Member;

public class Service {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Member> list =new ArrayList<Member>();
        logger.debug("开始连接数据库");    
        
        
        
	}
	
	
	public int[] delete(int[]source,int d){
		int[] newArray = new int[0];
		for(int i = 0; i <source.length;i++){
			if(source[i]!=d){
				newArray = Arrays.copyOf(newArray, newArray.length+1);
				newArray[newArray.length-1] = source[i];
			}
		}
		 
		return newArray;	
	}

}
