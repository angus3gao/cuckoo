package com.angus.cuckoo.core.servevr.config;

import com.angus.cuckoo.core.servevr.ServerType;

/**
 * 服务器配置信息
 * @author angus.gao
 * 
 * */
public class ServerConfig {
	// 服务器类型
	private ServerType  serverType;
	// 服务器ID
	private String serverId;
	// 区服ID
	private String regionId;
	// 服务器IP
	private String ip;
	// 服务器端口 
	private String ports;
	// 服务器开放端口
	private int clientPort;
	public ServerType getServerType() {
		return serverType;
	}
	public void setServerType(String serverType) {
		this.serverType = ServerType.get(serverType);
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getPorts() {
		return ports;
	}
	public void setPorts(String ports) {
		this.ports = ports;
	}
	public int getClientPort() {
		return clientPort;
	}
	public void setClientPort(int clientPort) {
		this.clientPort = clientPort;
	}
}
