package com.angus.cuckoo.core.servevr;

import com.angus.cuckoo.core.servevr.config.ServerConfig;

/**
 * 服务器基本类
 * @author angus.gao
 * 
 * */
public class Server implements IServer{
	// 服务器ID 
	private ServerConfig serverConfig;
	// 
	
	
	public ServerConfig getServerConfig() {
		return serverConfig;
	}

	public void setServerConfig(ServerConfig serverConfig) {
		this.serverConfig = serverConfig;
	}
}
