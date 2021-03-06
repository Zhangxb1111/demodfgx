package com.test.dao;

import com.test.entity.MonTree;
import org.springframework.stereotype.Repository;

@Repository
public interface MonTreeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_tree
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_tree
     *
     * @mbggenerated
     */
    int insert(MonTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_tree
     *
     * @mbggenerated
     */
    int insertSelective(MonTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_tree
     *
     * @mbggenerated
     */
    MonTree selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_tree
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MonTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_tree
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MonTree record);
}