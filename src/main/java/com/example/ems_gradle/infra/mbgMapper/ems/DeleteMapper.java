package com.example.ems_gradle.infra.mbgMapper.ems;

import com.example.ems_gradle.domain.mbgModel.ems.Delete;
import com.example.ems_gradle.domain.mbgModel.ems.DeleteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeleteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    long countByExample(DeleteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int deleteByExample(DeleteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int deleteByPrimaryKey(Integer deleteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int insert(Delete row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int insertSelective(Delete row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    List<Delete> selectByExample(DeleteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    Delete selectByPrimaryKey(Integer deleteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int updateByExampleSelective(@Param("row") Delete row, @Param("example") DeleteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int updateByExample(@Param("row") Delete row, @Param("example") DeleteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int updateByPrimaryKeySelective(Delete row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.delete
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int updateByPrimaryKey(Delete row);
}