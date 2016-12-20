package com.angus.cuckoo.core.common.logs;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * 日志分类管理器
 * @author angus.gao
 * 
 * */
public class Loggers {
	// core 核心代码日志
	public static final Logger Core = LoggerFactory.getLogger(LoggerType.CORE.getType()); 
	// 服务器模块
	public static final Logger Server = LoggerFactory.getLogger(LoggerType.SERVER.getType()); 
}
