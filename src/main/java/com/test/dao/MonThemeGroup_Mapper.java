package com.test.dao;

import com.test.entity.MonThemeGroup_;
import org.springframework.stereotype.Repository;

@Repository
public interface MonThemeGroup_Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_theme_group_
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_theme_group_
     *
     * @mbggenerated
     */
    int insert(MonThemeGroup_ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_theme_group_
     *
     * @mbggenerated
     */
    int insertSelective(MonThemeGroup_ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_theme_group_
     *
     * @mbggenerated
     */
    MonThemeGroup_ selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_theme_group_
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MonThemeGroup_ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_theme_group_
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MonThemeGroup_ record);
}