package org.jeecg.common.constant;

/**
 * @author: liuyanhao
 * @date: 2020-06-14
 * @description: 缓存常量
 */
public interface CacheConstant {

	/**
	 * 缓存用户jwt
	 */
	String SYS_USERS_CACHE_JWT = "sys:cache:user:jwt";

	/**
	 * 字典信息缓存
	 */
    String SYS_DICT_CACHE = "sys:cache:dict";
	/**
	 * 表字典信息缓存
	 */
    String SYS_DICT_TABLE_CACHE = "sys:cache:dictTable";
	String SYS_DICT_TABLE_BY_KEYS_CACHE = SYS_DICT_TABLE_CACHE + "ByKeys";

	/**
	 * 数据权限配置缓存
	 */
    String SYS_DATA_PERMISSIONS_CACHE = "sys:cache:permission:datarules";

	/**
	 * 缓存用户信息
	 */
	String SYS_USERS_CACHE = "sys:cache:user";

	/**
	 * 全部部门信息缓存
	 */
	String SYS_DEPARTS_CACHE = "sys:cache:depart:alldata";


	/**
	 * 全部部门ids缓存
	 */
	String SYS_DEPART_IDS_CACHE = "sys:cache:depart:allids";


	/**
	 * 测试缓存key
	 */
	String TEST_DEMO_CACHE = "test:demo";

	/**
	 * 字典信息缓存
	 */
	String SYS_DYNAMICDB_CACHE = "sys:cache:dbconnect:dynamic:";

	/**
	 * gateway路由缓存
	 */
	String GATEWAY_ROUTES = "geteway_routes";


	/**
	 * gateway路由 reload key
	 */
	String ROUTE_JVM_RELOAD_TOPIC = "gateway_jvm_route_reload_topic";
}
