package com.hust.scdx.constant;

import org.springframework.beans.factory.annotation.Value;

/**
 *	系统文件配置路径-->config.properties 
 */
public class Config {
	// 把config.properties中的变量值，赋给当前的变量
	@Value("${extfile}")
	private String dirExtfile;
	@Value("${content}")
	private String dirContent;
	@Value("${orig_cluster}")
	private String dirOrigCluster;
	@Value("${orig_count}")
	private String dirOrigCount;
	@Value("${modify_cluster}")
	private String dirModifyCluster;
	@Value("${modify_count}")
	private String dirModifyCount;
	@Value("${stdfile}")
	private String dirStdfile;

	void init() {
		DIRECTORY.init(dirExtfile, dirContent, dirOrigCluster, dirOrigCount, dirModifyCluster, dirModifyCount,
				dirStdfile);
	}

	public static class DIRECTORY {

		/**
		 * 泛数据
		 */
		public static String EXTFILE;
		/**
		 * 泛数据集合去重形成的数据
		 */
		public static String CONTENT;
		/**
		 * 初始的聚类结果 （每一行为一个类，每个数字为一条数据（来源于content的index+1） 以tab隔开）
		 */
		public static String ORIG_CLUSTER;
		/**
		 * 聚类结果里面 每个类的数量 标题index （tab） 类数量
		 */
		public static String ORIG_COUNT;
		/**
		 * 修改后的聚类结果 每一行为一个类，每个数字为一条数据（来源于content的index+1） 以tab隔开）
		 */
		public static String MODIFY_CLUSTER;
		/**
		 * 修改后的聚类结果中 每个类的数量 标题index （tab） 类数量
		 */
		public static String MODIFY_COUNT;
		/**
		 * 准数据
		 */
		public static String STDFILE;

		public static void init(String dirExtfile, String dirContent, String dirOrigCluster, String dirOrigCount,
				String dirModifyCluster, String dirModifyCount, String dirStdfile) {
			EXTFILE = dirExtfile;
			CONTENT = dirContent;
			ORIG_CLUSTER = dirOrigCluster;
			ORIG_COUNT = dirOrigCount;
			MODIFY_CLUSTER = dirModifyCluster;
			MODIFY_COUNT = dirModifyCount;
			STDFILE = dirStdfile;
		}
	}
}