package com.test.dao;

import com.test.entity.MonSvg;
import org.springframework.stereotype.Repository;

@Repository
public interface MonSvgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_svg
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_svg
     *
     * @mbggenerated
     */
    int insert(MonSvg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_svg
     *
     * @mbggenerated
     */
    int insertSelective(MonSvg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_svg
     *
     * @mbggenerated
     */
    MonSvg selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_svg
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MonSvg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_svg
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MonSvg record);
}