package org.jeecg.common.constant;
/**
 * 数据库上下文常量
 * @author liuyanhao
 * @date 2020-09-28
 */
public interface DataBaseConstant {
	//*********数据库类型****************************************
	 String DB_TYPE_MYSQL = "MYSQL";
	 String DB_TYPE_ORACLE = "ORACLE";
	 String DB_TYPE_POSTGRESQL = "POSTGRESQL";
	 String DB_TYPE_SQLSERVER = "SQLSERVER";

	// 数据库类型，对应 database_type 字典
	 String DB_TYPE_MYSQL_NUM = "1";
	 String DB_TYPE_ORACLE_NUM = "2";
	 String DB_TYPE_SQLSERVER_NUM = "3";
	 String DB_TYPE_POSTGRESQL_NUM = "4";
	//*********系统上下文变量****************************************
	/**
	 * 数据-所属机构编码
	 */
	 String SYS_ORG_CODE = "sysOrgCode";
	/**
	 * 数据-所属机构编码
	 */
	 String SYS_ORG_CODE_TABLE = "sys_org_code";
	/**
	 * 数据-所属机构编码
	 */
	 String SYS_MULTI_ORG_CODE = "sysMultiOrgCode";
	/**
	 * 数据-所属机构编码
	 */
	 String SYS_MULTI_ORG_CODE_TABLE = "sys_multi_org_code";
	/**
	 * 数据-系统用户编码（对应登录用户账号）
	 */
	 String SYS_USER_CODE = "sysUserCode";
	/**
	 * 数据-系统用户编码（对应登录用户账号）
	 */
	 String SYS_USER_CODE_TABLE = "sys_user_code";
	
	/**
	 * 登录用户真实姓名
	 */
	 String SYS_USER_NAME = "sysUserName";
	/**
	 * 登录用户真实姓名
	 */
	 String SYS_USER_NAME_TABLE = "sys_user_name";
	/**
	 * 系统日期"yyyy-MM-dd"
	 */
	 String SYS_DATE = "sysDate";
	/**
	 * 系统日期"yyyy-MM-dd"
	 */
	 String SYS_DATE_TABLE = "sys_date";
	/**
	 * 系统时间"yyyy-MM-dd HH:mm"
	 */
	 String SYS_TIME = "sysTime";
	/**
	 * 系统时间"yyyy-MM-dd HH:mm"
	 */
	 String SYS_TIME_TABLE = "sys_time";
	//*********系统上下文变量****************************************
	
	
	//*********系统建表标准字段****************************************
	/**
	 * 创建者登录名称
	 */
	 String CREATE_BY_TABLE = "create_by";
	/**
	 * 创建者登录名称
	 */
	 String CREATE_BY = "createBy";
	/**
	 * 创建日期时间
	 */
	 String CREATE_TIME_TABLE = "create_time";
	/**
	 * 创建日期时间
	 */
	 String CREATE_TIME = "createTime";
	/**
	 * 更新用户登录名称
	 */
	 String UPDATE_BY_TABLE = "update_by";
	/**
	 * 更新用户登录名称
	 */
	 String UPDATE_BY = "updateBy";
	/**
	 * 更新日期时间
	 */
	 String UPDATE_TIME = "updateTime";
	/**
	 * 更新日期时间
	 */
	 String UPDATE_TIME_TABLE = "update_time";
	
	/**
	 * 业务流程状态
	 */
	 String BPM_STATUS = "bpmStatus";
	/**
	 * 业务流程状态
	 */
	 String BPM_STATUS_TABLE = "bpm_status";
	//*********系统建表标准字段****************************************
}
