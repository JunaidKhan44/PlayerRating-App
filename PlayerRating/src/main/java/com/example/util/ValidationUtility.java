package com.example.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * 
 * @author Junaid Khan
 * 
 */
public class ValidationUtility {


	
	@SuppressWarnings("unused")
	public static boolean isNumeric(String chDigit) {
		try{
			Long number = new Long (chDigit);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@SuppressWarnings("all")
	public static boolean isExists(Object object) {
		if (object == null) {
			return false;
		}		
		if (object instanceof String) {
			String objString;
			objString = object.toString();
			if (objString.length() <= 0) {
				return false;
			}
		}
		if (object instanceof StringBuilder) {
			StringBuilder objString = new StringBuilder(object.toString());
			if (objString.length() <= 0) {
				return false;
			}
		}
		if (object instanceof Date) {
			if (object == null) {
				return false;
			}
		}
		if (object instanceof ArrayList) {			
			ArrayList objArrayList = (ArrayList) object;
			if (objArrayList.isEmpty()) {
				return false;
			}
		}
		if (object instanceof String[]) {			
			String[] array = (String[]) object;
			if (array.length<=0) {
				return false;
			}
		}
		if (object instanceof List) {			
			List objList = (List) object;
			if (objList.isEmpty()) {
				return false;
			}
		}
		if (object instanceof HashMap) {
			HashMap objHashMap = (HashMap) object;
			if (objHashMap.isEmpty()) {
				return false;
			}
		}
		return true;
	}
}
