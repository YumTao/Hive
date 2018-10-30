package com.yumtao.hive.function;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * @goal 自定义hive function,实现永远输出1
 * @action 1.自定义class继承UDF
 * @action 2.实现evaluate方法
 * 
 * @author yumTao
 *
 */
public class EverOne extends UDF {
	public Text evaluate(Text src) {
		return new Text("1");
	}
}
