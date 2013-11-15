package com.dylan.dao;

import com.dylan.model.PortalDocument;
import com.dylan.model.PortalDocumentExample;
import com.dylan.model.PortalDocumentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PortalDocumentMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@SelectProvider(type = PortalDocumentSqlProvider.class, method = "countByExample")
	int countByExample(PortalDocumentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@DeleteProvider(type = PortalDocumentSqlProvider.class, method = "deleteByExample")
	int deleteByExample(PortalDocumentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@Delete({ "delete from portal_document", "where doc_id = #{docId,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long docId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@Insert({ "insert into portal_document (doc_type, subject, ", "doc_version, creator, ",
	        "created_time, last_modified_time, ", "last_modifier, subject_zh_tw, ", "subject_zh_cn, content, ",
	        "content_zh_tw, content_zh_cn)", "values (#{docType,jdbcType=INTEGER}, #{subject,jdbcType=VARCHAR}, ",
	        "#{docVersion,jdbcType=INTEGER}, #{creator,jdbcType=BIGINT}, ",
	        "#{createdTime,jdbcType=TIMESTAMP}, #{lastModifiedTime,jdbcType=TIMESTAMP}, ",
	        "#{lastModifier,jdbcType=BIGINT}, #{subjectZhTw,jdbcType=LONGVARCHAR}, ",
	        "#{subjectZhCn,jdbcType=LONGVARCHAR}, #{content,jdbcType=LONGVARCHAR}, ",
	        "#{contentZhTw,jdbcType=LONGVARCHAR}, #{contentZhCn,jdbcType=LONGVARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID();", keyProperty = "docId", before = false, resultType = Long.class)
	int insert(PortalDocumentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@InsertProvider(type = PortalDocumentSqlProvider.class, method = "insertSelective")
	@SelectKey(statement = "SELECT LAST_INSERT_ID();", keyProperty = "docId", before = false, resultType = Long.class)
	int insertSelective(PortalDocumentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@SelectProvider(type = PortalDocumentSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "doc_id", property = "docId", jdbcType = JdbcType.BIGINT, id = true),
	        @Result(column = "doc_type", property = "docType", jdbcType = JdbcType.INTEGER),
	        @Result(column = "subject", property = "subject", jdbcType = JdbcType.VARCHAR),
	        @Result(column = "doc_version", property = "docVersion", jdbcType = JdbcType.INTEGER),
	        @Result(column = "creator", property = "creator", jdbcType = JdbcType.BIGINT),
	        @Result(column = "created_time", property = "createdTime", jdbcType = JdbcType.TIMESTAMP),
	        @Result(column = "last_modified_time", property = "lastModifiedTime", jdbcType = JdbcType.TIMESTAMP),
	        @Result(column = "last_modifier", property = "lastModifier", jdbcType = JdbcType.BIGINT),
	        @Result(column = "subject_zh_tw", property = "subjectZhTw", jdbcType = JdbcType.LONGVARCHAR),
	        @Result(column = "subject_zh_cn", property = "subjectZhCn", jdbcType = JdbcType.LONGVARCHAR),
	        @Result(column = "content", property = "content", jdbcType = JdbcType.LONGVARCHAR),
	        @Result(column = "content_zh_tw", property = "contentZhTw", jdbcType = JdbcType.LONGVARCHAR),
	        @Result(column = "content_zh_cn", property = "contentZhCn", jdbcType = JdbcType.LONGVARCHAR) })
	List<PortalDocumentWithBLOBs> selectByExampleWithBLOBs(PortalDocumentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@SelectProvider(type = PortalDocumentSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "doc_id", property = "docId", jdbcType = JdbcType.BIGINT, id = true),
	        @Result(column = "doc_type", property = "docType", jdbcType = JdbcType.INTEGER),
	        @Result(column = "subject", property = "subject", jdbcType = JdbcType.VARCHAR),
	        @Result(column = "doc_version", property = "docVersion", jdbcType = JdbcType.INTEGER),
	        @Result(column = "creator", property = "creator", jdbcType = JdbcType.BIGINT),
	        @Result(column = "created_time", property = "createdTime", jdbcType = JdbcType.TIMESTAMP),
	        @Result(column = "last_modified_time", property = "lastModifiedTime", jdbcType = JdbcType.TIMESTAMP),
	        @Result(column = "last_modifier", property = "lastModifier", jdbcType = JdbcType.BIGINT) })
	List<PortalDocument> selectByExample(PortalDocumentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@Select({ "select", "doc_id, doc_type, subject, doc_version, creator, created_time, last_modified_time, ",
	        "last_modifier, subject_zh_tw, subject_zh_cn, content, content_zh_tw, content_zh_cn",
	        "from portal_document", "where doc_id = #{docId,jdbcType=BIGINT}" })
	@Results({ @Result(column = "doc_id", property = "docId", jdbcType = JdbcType.BIGINT, id = true),
	        @Result(column = "doc_type", property = "docType", jdbcType = JdbcType.INTEGER),
	        @Result(column = "subject", property = "subject", jdbcType = JdbcType.VARCHAR),
	        @Result(column = "doc_version", property = "docVersion", jdbcType = JdbcType.INTEGER),
	        @Result(column = "creator", property = "creator", jdbcType = JdbcType.BIGINT),
	        @Result(column = "created_time", property = "createdTime", jdbcType = JdbcType.TIMESTAMP),
	        @Result(column = "last_modified_time", property = "lastModifiedTime", jdbcType = JdbcType.TIMESTAMP),
	        @Result(column = "last_modifier", property = "lastModifier", jdbcType = JdbcType.BIGINT),
	        @Result(column = "subject_zh_tw", property = "subjectZhTw", jdbcType = JdbcType.LONGVARCHAR),
	        @Result(column = "subject_zh_cn", property = "subjectZhCn", jdbcType = JdbcType.LONGVARCHAR),
	        @Result(column = "content", property = "content", jdbcType = JdbcType.LONGVARCHAR),
	        @Result(column = "content_zh_tw", property = "contentZhTw", jdbcType = JdbcType.LONGVARCHAR),
	        @Result(column = "content_zh_cn", property = "contentZhCn", jdbcType = JdbcType.LONGVARCHAR) })
	PortalDocumentWithBLOBs selectByPrimaryKey(Long docId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@UpdateProvider(type = PortalDocumentSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") PortalDocumentWithBLOBs record,
	        @Param("example") PortalDocumentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@UpdateProvider(type = PortalDocumentSqlProvider.class, method = "updateByExampleWithBLOBs")
	int updateByExampleWithBLOBs(@Param("record") PortalDocumentWithBLOBs record,
	        @Param("example") PortalDocumentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@UpdateProvider(type = PortalDocumentSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") PortalDocument record, @Param("example") PortalDocumentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@UpdateProvider(type = PortalDocumentSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(PortalDocumentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@Update({ "update portal_document", "set doc_type = #{docType,jdbcType=INTEGER},",
	        "subject = #{subject,jdbcType=VARCHAR},", "doc_version = #{docVersion,jdbcType=INTEGER},",
	        "creator = #{creator,jdbcType=BIGINT},", "created_time = #{createdTime,jdbcType=TIMESTAMP},",
	        "last_modified_time = #{lastModifiedTime,jdbcType=TIMESTAMP},",
	        "last_modifier = #{lastModifier,jdbcType=BIGINT},", "subject_zh_tw = #{subjectZhTw,jdbcType=LONGVARCHAR},",
	        "subject_zh_cn = #{subjectZhCn,jdbcType=LONGVARCHAR},", "content = #{content,jdbcType=LONGVARCHAR},",
	        "content_zh_tw = #{contentZhTw,jdbcType=LONGVARCHAR},",
	        "content_zh_cn = #{contentZhCn,jdbcType=LONGVARCHAR}", "where doc_id = #{docId,jdbcType=BIGINT}" })
	int updateByPrimaryKeyWithBLOBs(PortalDocumentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table portal_document
	 * 
	 * @mbggenerated Tue Nov 12 16:31:58 CST 2013
	 */
	@Update({ "update portal_document", "set doc_type = #{docType,jdbcType=INTEGER},",
	        "subject = #{subject,jdbcType=VARCHAR},", "doc_version = #{docVersion,jdbcType=INTEGER},",
	        "creator = #{creator,jdbcType=BIGINT},", "created_time = #{createdTime,jdbcType=TIMESTAMP},",
	        "last_modified_time = #{lastModifiedTime,jdbcType=TIMESTAMP},",
	        "last_modifier = #{lastModifier,jdbcType=BIGINT}", "where doc_id = #{docId,jdbcType=BIGINT}" })
	int updateByPrimaryKey(PortalDocument record);
}