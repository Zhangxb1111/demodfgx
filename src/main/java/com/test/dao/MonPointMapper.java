package com.test.dao;

import com.test.entity.MonPoint;
import org.springframework.stereotype.Repository;

@Repository
public interface MonPointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_point
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_point
     *
     * @mbggenerated
     */
    int insert(MonPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_point
     *
     * @mbggenerated
     */
    int insertSelective(MonPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_point
     *
     * @mbggenerated
     */
    MonPoint selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_point
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MonPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_point
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MonPoint record);
}