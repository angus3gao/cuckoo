package com.angus.cuckoo.core.connector;

import com.angus.cuckoo.core.components.IComponents;

/**
 * 连接器 接口 对连接进行封装 实现连接 以服务器解耦
 * 
 * */
public interface IConnnector extends IComponents {

	/**
	 * 获取连接统计
	 * 
	 * */
	public String getConnectorInfo();
}
