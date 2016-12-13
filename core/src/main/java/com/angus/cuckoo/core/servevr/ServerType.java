package com.angus.cuckoo.core.servevr;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务器类型定义
 * @author angus.gao
 * 
 * */
public enum ServerType {
	/** 网关服务器 前端服务器 */
	GATE("gate", 1),
	/** 游戏逻辑服务器 后端服务器 */
	GAME("game", 2),
	/** 游戏场景服务器 后端服务器 */
	SCENE("scene", 3),
	/** 管理服务器  后端服务器*/
	MASTER("master", 4);
	
	/** 服务器类型 */
	private int type;
	/** 服务器类型名称 */
	private String name;
	
	private static Map<Integer, ServerType> id2Types;
	private static Map<String, ServerType> name2Types;
	
	static {
		id2Types = new HashMap<Integer, ServerType>();
		for (ServerType item : ServerType.values()) {
			id2Types.put(item.getType(), item);
			name2Types.put(item.getName(), item);
		}
	}

	private ServerType(String name, int type) {
		this.setName(name);
		this.setType(type);
	}

	public static ServerType get(int type) {
		return id2Types.get(type);
	}
	
	public static ServerType get(String name) {
		return name2Types.get(name);
	}

	public boolean match(ServerType type) {
		return this == type;
	}

	public boolean match(byte key) {
		return match(get(key));
	}

	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
