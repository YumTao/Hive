package com.yumtao.hive.function;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * @goal 自定义hive function,实现输出小写
 * @action 1.自定义class继承UDF
 * @action 2.实现evaluate方法
 * 
 * @author yumTao
 *
 */
public class ToLower extends UDF {
	public Text evaluate(Text src) {
		return new Text(src.toString().toLowerCase());
	}
}
