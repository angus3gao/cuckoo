package com.angus.cuckoo.core.servevr;

/**
 * 服务器基本类
 * @author angus.gao
 * 
 * */
public class Server implements IServer{
	// 服务器ID 
	private int serverId;
	// 服务器名称 
	private String serverName;
	// 服务器类型
	private ServerType serverType = ServerType.MASTER;
	
	
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	public ServerType getServerType() {
		return serverType;
	}
	public void setServerType(ServerType serverType) {
		this.serverType = serverType;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
}
