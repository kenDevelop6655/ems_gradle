package com.example.ems_gradle.infra.mbgMapper.ems;

import com.example.ems_gradle.domain.mbgModel.ems.SecondApprove;
import com.example.ems_gradle.domain.mbgModel.ems.SecondApproveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondApproveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    long countByExample(SecondApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int deleteByExample(SecondApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int deleteByPrimaryKey(Integer requestActivityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int insert(SecondApprove row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int insertSelective(SecondApprove row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    List<SecondApprove> selectByExample(SecondApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    SecondApprove selectByPrimaryKey(Integer requestActivityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int updateByExampleSelective(@Param("row") SecondApprove row, @Param("example") SecondApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int updateByExample(@Param("row") SecondApprove row, @Param("example") SecondApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int updateByPrimaryKeySelective(SecondApprove row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.second_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    int updateByPrimaryKey(SecondApprove row);
}