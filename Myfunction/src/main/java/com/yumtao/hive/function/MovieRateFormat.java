package com.yumtao.hive.function;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.codehaus.jackson.map.ObjectMapper;

import com.yumtao.hive.function.vo.MovieRate;

public class MovieRateFormat extends UDF {

	public String evaluate(String json) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			MovieRate bean = objectMapper.readValue(json, MovieRate.class);
			return bean.toString();
		} catch (Exception e) {
			return "";
		}
	}
	
}
