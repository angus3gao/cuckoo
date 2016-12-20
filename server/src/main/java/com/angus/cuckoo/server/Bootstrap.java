package com.angus.cuckoo.server;

import java.util.regex.Pattern;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.angus.cuckoo.core.common.logs.Loggers;
import com.angus.cuckoo.core.common.tools.StringUtils;
import com.angus.cuckoo.core.servevr.ServerType;

/**
 * 游戏服务器的初始化引导程序，加载spring配置，启动游戏进程
 * 
 * @author angus.gao
 *
 */
public class Bootstrap {

	// 初始化实例
	private static Bootstrap instance = new Bootstrap();

	public static Bootstrap getInstance() {
		return instance;
	}

	/**
	 * 启动服务器
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("resource")
	public void start(ServerType serverType) throws Exception {
		Loggers.Server.info("正在启动服务器{" + serverType.getName() + "}");
		// 初始化spring配置
		new ClassPathXmlApplicationContext("classpath*:spring/applicationContext-" + serverType.getName() + ".xml");
		
		Loggers.Server.info("服务器{" + serverType.getName() + "} 启动完成！");
	}
	
	/**
	 * 安全关闭服务器
	 */
	public void shutdown() {
		System.exit(0);
	}
	
	public static void main(String[] args) throws Exception {
		
		// 处理传递参数
		String typeName = args.length > 0? args[0]: ServerType.MASTER.getName();
		// 调用启动服务器方法启动服务器
		Bootstrap.getInstance().start(ServerType.get(typeName));
	}
}
