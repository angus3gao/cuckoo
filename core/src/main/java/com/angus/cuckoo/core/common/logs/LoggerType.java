package com.angus.cuckoo.core.common.logs;

public enum LoggerType {
	// 核心模块
	CORE("core"),
	// 服务器模块
	SERVER("server");
	
	/**
	 * 模块名
	 */
	private String type;

	private LoggerType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
