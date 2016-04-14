package com.zx.test;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

public class Test {
	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		Map map= new HashMap();
		json.accumulate("hello", "zengxiang");
		json.accumulateAll(map);
		System.out.println(json.toString());
	}
}
